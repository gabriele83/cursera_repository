package my_test.pm

import scala.util.Random
import scala.annotation.tailrec
import scala.math.Ordering

object mergesort_ws {

  def mergsort[T](xs: List[T])(implicit ordering: Ordering[T]): List[T] = {
    val n = xs.length / 2
    if (n == 0) xs
    else {
    
      def merge(xs: List[T], ys: List[T]): List[T] = (xs, ys) match {
        case (Nil, ys) => ys
        case (xs, Nil) => xs
        case (x :: xs1, y :: ys1) => if (ordering.lt(x, y)) x :: merge(xs1, ys) else y :: merge(xs, ys1)
      }

      val (fst, snd) = xs.splitAt(n)
      merge(mergsort(fst), mergsort(snd))
    }
  }                                               //> mergsort: [T](xs: List[T])(implicit ordering: scala.math.Ordering[T])List[T]
                                                  //| 

  val randomList: List[Int] = List.fill(3)(Random.nextInt)
                                                  //> randomList  : List[Int] = List(1933740267, -421367162, 850592800)
  mergsort(randomList)(Ordering.Int)              //> res0: List[Int] = List(-421367162, 850592800, 1933740267)
}