package com.ebaykorea.kyekang.sample

import collection.mutable.Stack
import org.scalatest._

class ScalaTestExample extends FlatSpec with Matchers {

  "A Pizza" should "pop values in last-in-first-out order" in {
    val pizza = new Pizza
    pizza.addTopping(Topping("green olives"))
    pizza.getToppings.size should be (1)
  }

  "A Pizza" should "pop values in last-in-first-out order2" in {
    val pizza = new Pizza
    pizza.addTopping(Topping("green olives"))
    pizza.removeTopping(Topping("green olives"))
    pizza.getToppings.size should be (0)
  }
}