package viewmodels

import androidx.lifecycle.ViewModel
import java.lang.StringBuilder
import java.util.*

class P1ViewModel : ViewModel() {

    fun esPalindromo(str: String): Boolean {
        val sb = StringBuilder(str.lowercase(Locale.getDefault()))
        val str_reversa = sb.reverse().toString()

        return str.lowercase(Locale.getDefault()) == str_reversa
    }


}