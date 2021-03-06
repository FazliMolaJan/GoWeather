package com.deepan.goweather.model

data class ForecastData (
    var averageTemperatureInCelsius: Float = 0f,
    var averageTemperatureInFahrenheit: Float = 0f,
    var date: String = "",
    var location: String = "",
    val forecasts: ArrayList<ForecastDay> = ArrayList()
)