package no.bekk.scalajvm.converter

import org.scalatest.Suite


class ConverterSuite extends Suite {

  object Conv extends Converter

  def test100CelsiusShouldEqual212Fahrenheit = {
    assert(Conv.celsiusToFahrenheit(100) === 212.0)
  }

}