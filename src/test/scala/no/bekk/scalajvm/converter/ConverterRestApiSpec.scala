package no.bekk.scalajvm.converter

import org.scalatra.test.specs.ScalatraSpecification
import xml.{NodeSeq, XML}
import ConverterRestApi._

class ConverterRestApiSpec extends ScalatraSpecification {
  addFilter(classOf[ConverterRestApi], "/*")

  "The Conversion rest api" should {

    //2.1
    "when using GET "+ celsiusToFahrenheitRoute +"/:number return the converted result" in {
      get(celsiusToFahrenheitRoute + "/50") {
        //gjør ferdig testen og implementer routen i ConverterRestApi
        //hint body
        //hint mange mustXXX matchers
      }
    }

    //2.2
    "when using GET "+ fahrenheitToCelsiusRoute +"/:number return the converted result" in {
      //gjør ferdig testen og implementer routen i ConverterRestApi
    }

    //2.3
    //Lag en test som verifiserer at forsiden (GET /) inneholder en link til celsius-to-fahrenheit konverteringen
    //Sjekk at http status 200 returneres
    //hind Scala har innebyg støtte for å traversere XML
    //hint body, status

    //2.4
    //Lag en test som sjekker at GET /celsius/fahrenheit (uten verdi) viser en side med eksempelkonverteringer

  }
}
