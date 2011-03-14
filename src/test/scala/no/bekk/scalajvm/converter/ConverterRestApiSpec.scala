package no.bekk.scalajvm.converter

import org.scalatra.test.specs.ScalatraSpecification
import xml.{NodeSeq, XML}
import ConverterRestApi._

class ConverterRestApiSpec extends ScalatraSpecification {
  addFilter(classOf[ConverterRestApi], "/*")

  "The Conversion rest api" should {

    "when using GET / return a welcome message with a link to the celsius-to-fahrenheit conversing" in {
      get(rootRoute) {
        status mustEqual(200)
        val xmlBody = XML.loadString(body)
        (xmlBody \\ "a" \ "@href").text mustEqual(celsiusToFahrenheitRoute)
      }
    }

    "when using GET " + celsiusToFahrenheitRoute + " return a sample conversion chart" in {
      get(celsiusToFahrenheitRoute) {
        val xmlBody = XML.loadString(body)
        val tableHeaders = xmlBody \\ "th"
        tableHeaders(0).text mustEqual("Celsius")
        tableHeaders(1).text mustEqual("Fahrenheit")
        val tableValues = xmlBody \\ "td"
        tableValues.foreach(_.text mustMatch """[0-9]+(\.[0-9]+)?""")
      }
    }

    "when using GET "+ celsiusToFahrenheitRoute +"/:number return the converted result" in {
      get(celsiusToFahrenheitRoute + "/50") {
        body mustEqual "122.0"
      }
    }

    "when using GET "+ fahrenheitToCelsiusRoute +"/:number return the converted result" in {
      get(fahrenheitToCelsiusRoute + "/-4") {
        body mustEqual "-20.0"
      }
    }

  }
}
