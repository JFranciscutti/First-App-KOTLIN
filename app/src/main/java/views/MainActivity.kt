package views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import edu.example.app_tp1.R

class MainActivity : AppCompatActivity() {
    lateinit var btn_p1: Button
    lateinit var btn_p2: Button
    lateinit var btn_p3: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inicializarComponentes()

        btn_p1.setOnClickListener(
            View.OnClickListener {
                startActivity(Intent(this, activityP1::class.java))
            }
        )
        btn_p2.setOnClickListener(
            View.OnClickListener {
                startActivity(Intent(this, activityP2::class.java))
            }
        )
        btn_p3.setOnClickListener(
            View.OnClickListener {
                startActivity(Intent(this, activityP3::class.java))
            }
        )

    }

    private fun inicializarComponentes() {
        btn_p1 = findViewById(R.id.p1)
        btn_p2 = findViewById(R.id.p2)
        btn_p3 = findViewById(R.id.p3)
    }

}