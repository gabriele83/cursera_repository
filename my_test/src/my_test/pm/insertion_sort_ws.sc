package my_test.pm

object insertion_sort_ws {

  def ins_sort(xs: List[Int]): List[Int] = xs match {
    case List() => List()
    case y :: ys => insert(y, ins_sort(ys))
  }                                               //> ins_sort: (xs: List[Int])List[Int]

  def insert(x: Int, xs: List[Int]): List[Int] = xs match {
    case List() => List(x)
    case y :: ys => if (x > y) {
      x :: xs
    } else {
      y :: insert(x, ys)
    }
  }                                               //> insert: (x: Int, xs: List[Int])List[Int]

  ins_sort(List(1, 2, 3, 4, 5))                   //> res0: List[Int] = List(5, 4, 3, 2, 1)
  ins_sort(List(1, 3, 2, 5, 4))                   //> res1: List[Int] = List(5, 4, 3, 2, 1)
  ins_sort(List(5, 4, 3, 2, 1))                   //> res2: List[Int] = List(5, 4, 3, 2, 1)

}