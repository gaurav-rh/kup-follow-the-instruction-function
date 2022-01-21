class ListAdder {
  val sumOfListLambda: List[Int] => Int = (list: List[Int]) => list.sum

  val sumOfList: Function1[List[Int], Int] = new Function[List[Int], Int] {
    def apply(list: List[Int]): Int = list.sum
  }
}
