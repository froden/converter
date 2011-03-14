package no.bekk.scalajvm.converter

import org.scalatest.FunSuite
import org.scalatest.prop.Checkers
import org.scalacheck.Arbitrary._
import org.scalacheck.Prop._

/**
 * Bruker Scala Check som er ypperlig for funksjonell testing der man er ute etter
 * å teste om gitte kriterier holder for en rekke input/output verdier
 * Her brukes ScalaTests integrerte støtte for ScalaCheck
 */
class ConverterCheckSuite extends FunSuite with Checkers {

  //obs. avrundingsproblemer kan oppstå
  test("Converting a value back and forth should always equal the orginial value") {

  }
}