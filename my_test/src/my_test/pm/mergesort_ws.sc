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
                                                  //> randomList  : List[Int] = List(1422108322, -244092162, -189559989)
  mergsort(randomList)(Ordering.Int)              //> res0: List[Int] = List(-244092162, -189559989, 1422108322)

  val myList: List[Int] = List(1, -1, 2, -2, 3)   //> myList  : List[Int] = List(1, -1, 2, -2, 3)
  myList filter (x => x > 0)                      //> res1: List[Int] = List(1, 2, 3)
  myList filterNot (x => x > 0)                   //> res2: List[Int] = List(-1, -2)
  myList partition (x => x > 0)                   //> res3: (List[Int], List[Int]) = (List(1, 2, 3),List(-1, -2))
  myList takeWhile (x => x > 0)                   //> res4: List[Int] = List(1)
  myList dropWhile (x => x > 0)                   //> res5: List[Int] = List(-1, 2, -2, 3)
  myList span (x => x > 0)                        //> res6: (List[Int], List[Int]) = (List(1),List(-1, 2, -2, 3))

  val data: List[Char] = List('a', 'a', 'a', 'b', 'c', 'c', 'a')
                                                  //> data  : List[Char] = List(a, a, a, b, c, c, a)

  def pack[T](xs: List[T]): List[List[T]] = xs match {
    case Nil => Nil
    case x :: xs1 => {
      val (fst, rst) = xs span (y => y == x)
      fst :: pack(rst)
    }
  }                                               //> pack: [T](xs: List[T])List[List[T]]

  pack(data)                                      //> res7: List[List[Char]] = List(List(a, a, a), List(b), List(c, c), List(a))
                                                  //| 

  def encode[T](xs: List[T]): List[(T, Int)] = pack(xs) map (ys => (ys.head, ys.length))
                                                  //> encode: [T](xs: List[T])List[(T, Int)]

  encode(data)                                    //> res8: List[(Char, Int)] = List((a,3), (b,1), (c,2), (a,1))

  myList reduceLeft ((x, y) => x + y)             //> res9: Int = 3
  myList reduceLeft (_ + _)                       //> res10: Int = 3
  myList reduceLeft ((x, y) => x * y)             //> res11: Int = 12
  myList reduceLeft (_ * _)                       //> res12: Int = 12

  val emptyList: List[Int] = List()               //> emptyList  : List[Int] = List()
  emptyList.foldLeft(-1)(_ + _)                   //> res13: Int = -1
  myList reduceLeft (_ + _)                       //> res14: Int = 3
  myList.foldLeft(-1)(_ + _)                      //> res15: Int = 2

  myList reduceRight (_ + _)                      //> res16: Int = 3
  myList.foldRight(-1)(_ + _)                     //> res17: Int = 2

  /* reduceLeft e reduceRight sono quivalenti solo per operazioni associtive e comulative */

  val l1: List[Int] = List(1, 2, 3)               //> l1  : List[Int] = List(1, 2, 3)
  val l2: List[Int] = List(4, 5, 6)               //> l2  : List[Int] = List(4, 5, 6)
  val l3: List[Int] = List(7, 8, 9)               //> l3  : List[Int] = List(7, 8, 9)

  l1 ++ l2 ++ l3                                  //> res18: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
  l1 ::: l2 ::: l3                                //> res19: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
  1 :: l1                                         //> res20: List[Int] = List(1, 1, 2, 3)

  val s: String = "Ciao Mondo!!!"                 //> s  : String = Ciao Mondo!!!

  s exists (c => c.isUpper)                       //> res21: Boolean = true
  s forall (c => c.isUpper)                       //> res22: Boolean = false
  s filter (c => c.isUpper)                       //> res23: String = CM
  val pair1: List[(Int, Char)] = l1 zip s         //> pair1  : List[(Int, Char)] = List((1,C), (2,i), (3,a))
  val pair2: IndexedSeq[(Char, Int)] = s zip l1   //> pair2  : IndexedSeq[(Char, Int)] = Vector((C,1), (i,2), (a,3))
  pair1.unzip                                     //> res24: (List[Int], List[Char]) = (List(1, 2, 3),List(C, i, a))
  pair2.unzip                                     //> res25: (IndexedSeq[Char], IndexedSeq[Int]) = (Vector(C, i, a),Vector(1, 2, 
                                                  //| 3))

  s flatMap (c => List('.', c))                   //> res26: String = .C.i.a.o. .M.o.n.d.o.!.!.!
  s map (c => List('.', c))                       //> res27: scala.collection.immutable.IndexedSeq[List[Char]] = Vector(List(., C
                                                  //| ), List(., i), List(., a), List(., o), List(.,  ), List(., M), List(., o), 
                                                  //| List(., n), List(., d), List(., o), List(., !), List(., !), List(., !))
  def isPrime(n: Int): Boolean = (2 until n) forall (x => n % x != 0)
                                                  //> isPrime: (n: Int)Boolean
}