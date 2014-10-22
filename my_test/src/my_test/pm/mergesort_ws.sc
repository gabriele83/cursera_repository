package my_test.pm

import scala.util.Random
import scala.annotation.tailrec

object mergesort_ws {
	
  def mergsort[T](xs: List[T])(lt: (T,T) => Boolean): List[T] = {
    val n = xs.length / 2
    if (n == 0) xs
    else {
      def merge(xs: List[T], ys: List[T]): List[T] = (xs, ys) match {
        case (Nil, ys) => ys
        case (xs, Nil) => xs
        case (x :: xs1, y :: ys1) => if (lt(x,y)) x :: merge(xs1, ys) else y :: merge(xs, ys1)
      }

      val (fst, snd) = xs.splitAt(n)
      merge(mergsort(fst)(lt), mergsort(snd)(lt))
    }
  }                                               //> mergsort: [T](xs: List[T])(lt: (T, T) => Boolean)List[T]
  
  
  val randomList: List[Int] = List.fill(3)(Random.nextInt)
                                                  //> randomList  : List[Int] = List(-2086992103, -2074444658, 1555830762)
  mergsort(randomList)((a: Int,b: Int) => a < b)  //> res0: List[Int] = List(-2086992103, -2074444658, 1555830762)
  
  
  
}