package no.bekk.scalajvm.converter

import org.scalatest.matchers.ShouldMatchers
import org.scalatest.FunSuite


class ConverterFunSuite extends FunSuite {

  object Conv extends Converter

  test("Water freezes at 0 celsius and 32 fahrenheit") {
    expect(32) {
      Conv.celsiusToFahrenheit(0)
    }
    expect(0) {
      Conv.fahrenheitToCelsius(32)
    }
  }
}