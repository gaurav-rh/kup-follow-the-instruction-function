package com.knoldus.assignment

import org.scalatest.flatspec.AnyFlatSpec

class AdderTest extends AnyFlatSpec {
  val adder = new Adder()
  val numberOne = 25
  val numberTwo = 40
  val numberThree = 13
  val numberFour = 15

  "Adder" should "be valid calculation " in {
    val result = numberOne + numberTwo
    assert(adder.add(numberOne, numberTwo) == result)
  }


  "Adder in lambda" should "be valid calculation" in {
    val result = numberThree + numberFour
    assert(adder.addInLambda(numberThree, numberFour) == result)
  }

  "Adder in both functions" should "be valid calculation " in {
    assert(adder.add(numberFour, numberTwo) == adder.addInLambda(numberFour, numberTwo))
  }

}
