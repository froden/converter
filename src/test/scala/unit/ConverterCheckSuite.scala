package no.bekk.scalajvm.converter

import org.scalacheck.Prop._
import org.scalatest.prop.Checkers
import org.scalatest.FunSuite
import org.scalacheck.Prop

class ConverterCheckSuite extends FunSuite with Checkers {
  test("jejeje") {
    check(Prop.forAll((degreesCelsius: Double) => Converter.fahrenheitToCelsius(Converter.celsiusToFahrenheit(degreesCelsius)) === degreesCelsius ))
  }
}