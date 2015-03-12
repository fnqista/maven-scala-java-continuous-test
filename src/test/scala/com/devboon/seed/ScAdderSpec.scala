package com.devboon.seed

import org.scalatest.{Matchers, FunSpec}

class ScAdderSpec extends FunSpec with Matchers {

  describe("""Adder""") {
    import com.devboon.test.group.TestGroup
    import org.scalatest.Tag
    it("""should add two integers correctly""", Tag(TestGroup.QuickTests)) {
      ScAdder.add(1, 2) shouldBe 3
    }
  }
}
