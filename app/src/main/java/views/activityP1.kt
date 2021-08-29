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
import viewmodels.P1ViewModel

class activityP1 : AppCompatActivity() {
    lateinit var text_ingresado: EditText
    lateinit var text_exito: TextView
    lateinit var btn_pal: Button
    lateinit var P1VM: P1ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_p1)

        P1VM = ViewModelProvider(this).get(P1ViewModel::class.java)

        inicializarComponentes()

        btn_pal.setOnClickListener(
            View.OnClickListener {
                var salida: Boolean
                if (!text_ingresado.text.toString().isEmpty()) {
                    salida = P1VM.esPalindromo(text_ingresado.text.toString())
                    if (salida)
                        text_exito.text = "ES UN PALINDROMO"
                    else {
                        Toast.makeText(this, "NO ES UN PALINDROMO", Toast.LENGTH_LONG).show()
                        text_exito.text = ""
                    }
                } else
                    Toast.makeText(this, "Ingrese una palabra", Toast.LENGTH_LONG).show()
            }
        )
    }


    private fun inicializarComponentes() {
        text_ingresado = findViewById(R.id.P1_texto_ingresado)
        btn_pal = findViewById(R.id.P1_btn_palindromo)
        text_exito = findViewById(R.id.P1_resultado)
    }


}