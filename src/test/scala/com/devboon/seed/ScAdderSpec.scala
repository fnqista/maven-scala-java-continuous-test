package com.devboon.seed

import org.scalatest.{Matchers, FunSpec}

class ScAdderSpec extends FunSpec with Matchers {

  describe("""Adder""") {
    it("""should add two integers correctly""") {
      ScAdder.add(1, 2) shouldBe 3
    }
  }
}
