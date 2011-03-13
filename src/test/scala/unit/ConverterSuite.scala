package no.bekk.scalajvm.converter

import org.scalatest.Suite


class ConverterSuite extends Suite {

  def test100CelsiusShouldEqual212Fahrenheit = {
    assert(Converter.celsiusToFahrenheit(100) === 212.0)
  }

}