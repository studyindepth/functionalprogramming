package io.github.toandv.scala.fp

/**
  * @author toandv
  * @since 9/18/2016.
  */
object Functions extends App {

  // assigned to a variable
  // Input: (Int, Int)
  // Output: Int
  val f: (Int, Int) => Int = (a, b) => a + b
  val add = f
  val sum = add(1, 2)

  // created dynamically
  val obj = new Object()
  val func = (s: String) => s.toUpperCase

  print()
}
