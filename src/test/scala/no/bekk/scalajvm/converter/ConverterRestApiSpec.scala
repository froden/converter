package no.bekk.scalajvm.converter

import org.scalatra.test.specs.ScalatraSpecification
import xml.XML

class ConverterRestApiSpec extends ScalatraSpecification {
  addFilter(classOf[ConverterRestApi], "/*")

  import ConverterRestApi._

  "The Conversion rest api" should {

    "when using GET / return a welcome message with a link to the celsius-to-fahrenheit conversing" in {
      get("/") {
        status mustEqual(200)
        val xmlBody = XML.loadString(body)
        (xmlBody \\ "a" \ "@href").text mustEqual(celsiusToFahrenheitRoute)
      }
    }

    "when using GET /celsius/fahrenheit return a sample conversion chart" in {

    }



  }
}
