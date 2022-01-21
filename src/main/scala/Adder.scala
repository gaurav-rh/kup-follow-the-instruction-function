class Adder {
  val addInLambda: (Int, Int) => Int = (firstNumber: Int, secondNumber: Int) => firstNumber + secondNumber

  val add: Function2[Int, Int, Int] = new Function2[Int, Int, Int] {
    def apply(firstNumber: Int, secondNumber: Int): Int = firstNumber + secondNumber
  }
}
