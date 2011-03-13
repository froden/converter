package no.bekk.scalajvm.converter

import org.scalatest.matchers.ShouldMatchers
import org.scalatest.FunSuite


class ConverterFunSuite extends FunSuite {
  test("Water freezes at 0 celsius and 32 fahrenheit") {
    expect(32) {
      Converter.celsiusToFahrenheit(0)
    }
    expect(0) {
      Converter.fahrenheitToCelsius(32)
    }
  }
}