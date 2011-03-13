package no.bekk.scalajvm.converter


object Converter {

  def celsiusToFahrenheit(degreesCelsius: Double) = (9.0/5.0) * degreesCelsius + 32
  def fahrenheitToCelsius(degreesFahrenheit: Double) = (5.0/9.0) * (degreesFahrenheit - 32)
}