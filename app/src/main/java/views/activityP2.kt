package views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.lifecycle.ViewModelProvider
import edu.example.app_tp1.R
import viewmodels.P2ViewModel

class activityP2 : AppCompatActivity() {

    lateinit var temp_ing_C: EditText
    lateinit var temp_ing_F: EditText
    lateinit var btn_conv_C: Button
    lateinit var btn_conv_F: Button
    lateinit var text_resultadoC: TextView
    lateinit var text_resultadoF: TextView
    lateinit var P2VM: P2ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_p2)

        P2VM = ViewModelProvider(this).get(P2ViewModel::class.java)
        inicializarComponentes()

        btn_conv_C.setOnClickListener(
            View.OnClickListener {

                var temp: String = temp_ing_C.text.toString()
                if (temp.isEmpty()) {
                    Toast.makeText(this, "Ingrese una temperatura", Toast.LENGTH_LONG).show()
                    text_resultadoC.text = ""
                } else {
                    var salida: Double = P2VM.celsiusToFahrenheit(temp)
                    text_resultadoC.text = salida.toString()
                }
            })

        btn_conv_F.setOnClickListener(
            View.OnClickListener {
                var temp: String = temp_ing_F.text.toString()
                if (temp.isEmpty()) {
                    Toast.makeText(this, "Ingrese una temperatura", Toast.LENGTH_LONG).show()
                    text_resultadoF.text = ""
                } else {
                    var salida: Double = P2VM.fahrenheitToCelsius(temp)
                    text_resultadoF.text = salida.toString()
                }
            })
    }

    private fun inicializarComponentes() {

        temp_ing_C = findViewById(R.id.P2_temp_ingresada1)
        temp_ing_F = findViewById(R.id.P2_temp_ingresada2)
        btn_conv_C = findViewById(R.id.P2_btn_C_to_F)
        btn_conv_F = findViewById(R.id.P2_btn_F_to_C)
        text_resultadoC = findViewById(R.id.P2_resultado1)
        text_resultadoF = findViewById(R.id.P2_resultado2)
    }
}