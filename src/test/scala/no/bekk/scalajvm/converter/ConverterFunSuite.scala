package no.bekk.scalajvm.converter

import org.scalatest.matchers.ShouldMatchers
import org.scalatest.FunSuite


class ConverterFunSuite extends FunSuite with ShouldMatchers {

  object Conv extends Converter

  test("conversion from celsius to fahrenheit") {
    Conv.celsiusToFahrenheit(0.0) should equal(32.0)
    Conv.celsiusToFahrenheit(100.0) should equal(212.0)
    Conv.celsiusToFahrenheit(-50.0) should equal(-58.0)
  }

  test("conversion from fahrenheit to celsius") {
    Conv.fahrenheitToCelsius(-40.0) should equal(-40.0)
    Conv.fahrenheitToCelsius(140.0) should equal(60.0)
    Conv.fahrenheitToCelsius(50.0) should equal(10.0)
  }

}