package views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import edu.example.app_tp1.R
import viewmodels.P3ViewModel

class activityP3 : AppCompatActivity() {

    lateinit var nro_ingresado: EditText
    lateinit var btn_calc: Button
    lateinit var text_resultado: TextView

    lateinit var P3VM: P3ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_p3)

        P3VM = ViewModelProvider(this).get(P3ViewModel::class.java)
        inicializarComponentes()

        btn_calc.setOnClickListener(
            View.OnClickListener {
                if (!nro_ingresado.text.toString().isEmpty()) {
                    val n: Int = nro_ingresado.text.toString().toInt()
                    val salida: String = P3VM.sigFibonacci(n).toString()
                    text_resultado.text = salida
                } else
                    Toast.makeText(this, "INGRESE UN NUMERO", Toast.LENGTH_LONG).show()
            }
        )
    }

    private fun inicializarComponentes() {
        nro_ingresado = findViewById(R.id.P3_nro_ingresado)
        btn_calc = findViewById(R.id.P3_check)
        text_resultado = findViewById(R.id.P3_resultado)
    }
}