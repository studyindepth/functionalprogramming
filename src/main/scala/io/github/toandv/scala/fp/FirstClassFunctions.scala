package io.github.toandv.scala.fp

/**
  * @author toandv
  * @since 9/18/2016.
  */
object FirstClassFunctions extends App {

  // returned as a result
  def operator(name: String): ((Int, Int) => Int) = name match {
    case "add" => (a, b) => a + b
    case "sub" => (a, b) => a - b
    case "mul" => (a, b) => a * b
    case "div" => (a, b) => a / b
    case _ => null
  }

  // passed as a parameter, high-order function
  def reduce(numbers: List[Int], combiner: ((Int, Int) => Int)): Int = {
    var acc: Int = numbers(0)
    for (i <- 1 until numbers.size) {
      acc = combiner(acc, numbers(i))
    }
    acc
  }

  val add = operator("add");
  val mul = operator("mul")

  val sum = reduce(List(1, 2, 3, 4, 5), add)
  val product = reduce(List(1, 2, 3, 4, 5), mul)

}
