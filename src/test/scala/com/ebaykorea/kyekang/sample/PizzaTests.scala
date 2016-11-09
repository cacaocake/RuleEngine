package com.ebaykorea.kyekang.sample

import junit.framework.TestCase
//import org.junit.Test
import org.junit.Assert._
/**
  * Created by kyekang on 2016-11-08.
  */
class PizzaTests extends TestCase{

  var pizza: Pizza = _

  override def setUp() = {
    pizza = new Pizza
  }

  def testOneTopping() = {
    pizza.addTopping(Topping("green olives"))
    assertEquals(pizza.getToppings.size, 1)
  }

  def testAddingAndRemovingToppings() = {
    pizza.addTopping(Topping("green olives"))
    pizza.removeTopping(Topping("green olives"))
    assertEquals(pizza.getToppings.size, 0)
  }
}
