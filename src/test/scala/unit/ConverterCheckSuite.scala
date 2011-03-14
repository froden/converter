package no.bekk.scalajvm.converter

import org.scalatest.FunSuite
import org.scalatest.prop.Checkers
import org.scalacheck.Arbitrary._
import org.scalacheck.Prop._


class ConverterCheckSuite extends FunSuite with Checkers {

  object Conv extends Converter

  test("jejeje") {
    check { degreesCelsius: Double =>
      Conv.fahrenheitToCelsius(Conv.celsiusToFahrenheit(degreesCelsius)).round == degreesCelsius.round
    }
  }
}