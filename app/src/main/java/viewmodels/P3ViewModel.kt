package viewmodels

import androidx.lifecycle.ViewModel
import kotlin.math.*

class P3ViewModel : ViewModel() {

    fun sigFibonacci(n: Int): Int {
        var salida = 0
        var encontre = false
        var i = 1

        if (esFibonacci(n)) {
            val a: Double = n * (1 + sqrt(5.0)) / 2
            val aux = round(a)
            salida = aux.toInt()
        } else {
            while (salida == 0 || !encontre) {
                if (esFibonacci(n + i)) {
                    salida = n + i
                    encontre = true
                } else
                    i++
            }
        }
        return salida
    }


    private fun esCuadradoPerfecto(x: Double): Boolean {
        val s = sqrt(x)
        return (s * s == x)
    }

    private fun esFibonacci(n: Int): Boolean {
        val op1 = 5 * n * n + 4
        val op2 = 5 * n * n - 4

        return esCuadradoPerfecto(op1.toDouble()) || esCuadradoPerfecto(op2.toDouble())
    }
}