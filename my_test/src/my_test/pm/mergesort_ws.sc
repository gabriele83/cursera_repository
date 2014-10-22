package my_test.pm

import scala.util.Random

object mergesort_ws {

  def mergsort(xs: List[Int]): List[Int] = {
    val n = xs.length / 2
    if (n == 0) xs
    else {
      def merge(xs: List[Int], ys: List[Int]): List[Int] = (xs, ys) match {
        case (Nil, ys) => ys
        case (xs, Nil) => xs
        case (x :: xs1, y :: ys1) => if (x < y) x :: merge(xs1, ys) else y :: merge(xs, ys1)
      }

      val (fst, snd) = xs.splitAt(n)
      merge(mergsort(fst), mergsort(snd))
    }
  }                                               //> mergsort: (xs: List[Int])List[Int]
  
  
  val randomList: List[Int] = List.fill(3)(Random.nextInt)
                                                  //> randomList  : List[Int] = List(1347917441, -652887634, 266470912)
  mergsort(randomList)                            //> res0: List[Int] = List(-652887634, 266470912, 1347917441)
  
  
  
}