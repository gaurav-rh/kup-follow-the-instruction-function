package com.knoldus.assignment

import org.scalatest.flatspec.AnyFlatSpec

class HighOrderFunctionTest extends AnyFlatSpec {
  val highOrderFunction = new HighOrderFunction()

  "a cube in high order function" should "be valid " in {
    val number: Int = 5
    val result: Int = number * number * number
    assert(highOrderFunction.higherOrderFunction(highOrderFunction.cube, number) == result)
  }

  "a square in high order function" should "be valid " in {
    val number: Int = 5
    val result: Int = number * number
    assert(highOrderFunction.higherOrderFunction(highOrderFunction.square, number) == result)
  }

  "a cube in high order function in lambda" should "be valid " in {
    val number: Int = 25
    val result: Int = number * number * number
    assert(highOrderFunction.higherOrderFunctionLambda(highOrderFunction.cube, number) == result)
  }

  "a square in high order function in lambda" should "be valid " in {
    val number: Int = 15
    val result: Int = number * number
    assert(highOrderFunction.higherOrderFunctionLambda(highOrderFunction.square, number) == result)
  }

  "a cube in high order function in both situation" should "be valid " in {
    val number: Int = 5
    assert(highOrderFunction.higherOrderFunction(highOrderFunction.cube, number) == highOrderFunction.higherOrderFunctionLambda(highOrderFunction.cube, number))
  }

}
