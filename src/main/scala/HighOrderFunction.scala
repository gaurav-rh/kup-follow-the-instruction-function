class HighOrderFunction {
  val higherOrderFunctionLambda: (Int => Int, Int) => Int = (f: (Int => Int), num: Int) => f(num)

  val higherOrderFunction: Function2[Function1[Int, Int], Int, Int] = new Function2[Function1[Int, Int], Int, Int] {
    def apply(f: (Int => Int), number: Int): Int = f(number)
  }

  def square(integer: Int): Int = integer * integer

  val cube: Int => Int = (number: Int) => number * number * number
}
