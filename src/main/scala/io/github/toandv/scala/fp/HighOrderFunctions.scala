package io.github.toandv.scala.fp

/**
  * @author toandv
  * @since 9/18/2016.
  */
object HighOrderFunctions extends App {

  def sumInts(numbers: List[Int]): Int = {
    var acc: Int = numbers(0)
    for (i <- 1 until numbers.size) {
      acc = acc + numbers(i)
    }
    acc
  }

  def mulInts(numbers: List[Int]): Int = {
    var acc: Int = numbers(0)
    for (i <- 1 until numbers.size) {
      acc = acc * numbers(i)
    }
    acc
  }

  // high-order function
  def reduce(numbers: List[Int])(combine: ((Int, Int) => Int)): Int = {
    var acc: Int = numbers(0)
    for (i <- 1 until numbers.size) {
      acc = combine(acc, numbers(i))
    }
    acc
  }

  def sum(numbers: List[Int]) = reduce(numbers)((a, b) => a + b)
  def mul(numbers: List[Int]) = reduce(numbers)((a, b) => a * b)
}
