package viewmodels

import androidx.lifecycle.ViewModel

class P2ViewModel : ViewModel() {

    fun celsiusToFahrenheit(temp: String): Double {
        var auxTemp = temp.toDouble()
        auxTemp *= 9
        auxTemp /= 5
        auxTemp += 32
        return auxTemp
    }

    fun fahrenheitToCelsius(temp: String): Double {
        var auxTemp = temp.toDouble()
        auxTemp -= 32
        auxTemp *= 5
        auxTemp /= 9
        return auxTemp
    }
}