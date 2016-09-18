package io.github.toandv.scala.fp

/**
  * @author toandv
  * @since 9/18/2016.
  */
object FirstClassFunctions extends App {
  val add: (Int, Int) => Int = (a, b) => a + b
  val sub: (Int, Int) => Int = (a, b) => a - b
  val added = add(1, 2)

  // created dynamically
  val obj = new Object()
  val f = (s: String) => s.toUpperCase

  // passed as a parameter, high-order function
  def reduce(numbers: List[Int], combiner: ((Int, Int) => Int)): Int = {
    var acc: Int = 0
    for (n <- numbers) {
      acc = combiner(acc, n)
    }
    acc
  }

  val r = reduce _

  reduce(List(1, 2, 3, 4), add) // 10
  reduce(List(1, 2, 3, 4), sub)

  // 6

  // returned as a result
  def operator(name: String): ((Int, Int) => Int) = name match {
    case "add" => (a, b) => a + b
    case "sub" => (a, b) => a - b
    case "mul" => (a, b) => a * b
    case "div" => (a, b) => a / b
    case _ => null
  }

  val mul = operator("mul")
  val multiplied = mul(2, 4)

  // returned as a result
  val operator1: (String => (Int, Int) => Int) = name => {
    name match {
      case "add" => (a, b) => a + b
      case "sub" => (a, b) => a - b
      case "mul" => (a, b) => a * b
      case "div" => (a, b) => a / b
      case _ => null
    }
  }


}
