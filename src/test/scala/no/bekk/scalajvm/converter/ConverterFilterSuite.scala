package no.bekk.scalajvm.converter

import org.scalatra._
import org.scalatra.test.scalatest._
import org.scalatest.matchers._

class ConverterFilterSuite extends ScalatraFunSuite with ShouldMatchers {
  addFilter(classOf[ConverterFilter], "/*")

  test("GET / returns status 200") {
    get("/") { 
      status should equal (200)
    }
  }
}
