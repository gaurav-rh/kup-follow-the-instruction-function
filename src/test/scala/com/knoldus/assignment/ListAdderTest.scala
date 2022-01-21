package com.knoldus.assignment

import org.scalatest.flatspec.AnyFlatSpec

class ListAdderTest extends AnyFlatSpec {
  val list = List(2, 4, 5, 3, 6)
  val listAdder = new ListAdder()

  "ListAdder" should "be valid calculation " in {
    assert(listAdder.sumOfList(list) == 20)
  }

  "listAdder with lambda" should "be valid calculation" in {
    assert(listAdder.sumOfListLambda(list) == 20)
  }

  "ListAdder in both functions" should "be valid calculation" in {
    assert(listAdder.sumOfListLambda(list) == listAdder.sumOfList(list))
  }
}
