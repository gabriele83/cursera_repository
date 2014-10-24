package my_test.pm

import scala.util.Random
import scala.annotation.tailrec
import scala.math.Ordering

object map_and_list_ws {

  /*
	operazione principali
	List: head e Tail
	Vector: index
	Set: contains
	*/

  val myList: List[Int] = List(1, -1, 2, -2, 3)   //> myList  : List[Int] = List(1, -1, 2, -2, 3)
  myList filter (x => x > 0)                      //> res0: List[Int] = List(1, 2, 3)
  myList filterNot (x => x > 0)                   //> res1: List[Int] = List(-1, -2)
  myList partition (x => x > 0)                   //> res2: (List[Int], List[Int]) = (List(1, 2, 3),List(-1, -2))
  myList takeWhile (x => x > 0)                   //> res3: List[Int] = List(1)
  myList dropWhile (x => x > 0)                   //> res4: List[Int] = List(-1, 2, -2, 3)
  myList span (x => x > 0)                        //> res5: (List[Int], List[Int]) = (List(1),List(-1, 2, -2, 3))

  val data: List[Char] = List('a', 'a', 'a', 'b', 'c', 'c', 'a')
                                                  //> data  : List[Char] = List(a, a, a, b, c, c, a)

  def pack[T](xs: List[T]): List[List[T]] = xs match {
    case Nil => Nil
    case x :: xs1 => {
      val (fst, rst) = xs span (y => y == x)
      fst :: pack(rst)
    }
  }                                               //> pack: [T](xs: List[T])List[List[T]]

  pack(data)                                      //> res6: List[List[Char]] = List(List(a, a, a), List(b), List(c, c), List(a))

  def encode[T](xs: List[T]): List[(T, Int)] = pack(xs) map (ys => (ys.head, ys.length))
                                                  //> encode: [T](xs: List[T])List[(T, Int)]

  encode(data)                                    //> res7: List[(Char, Int)] = List((a,3), (b,1), (c,2), (a,1))

  myList reduceLeft ((x, y) => x + y)             //> res8: Int = 3
  myList reduceLeft (_ + _)                       //> res9: Int = 3
  myList reduceLeft ((x, y) => x * y)             //> res10: Int = 12
  myList reduceLeft (_ * _)                       //> res11: Int = 12

  val emptyList: List[Int] = List()               //> emptyList  : List[Int] = List()
  emptyList.foldLeft(-1)(_ + _)                   //> res12: Int = -1
  myList reduceLeft (_ + _)                       //> res13: Int = 3
  myList.foldLeft(-1)(_ + _)                      //> res14: Int = 2

  myList reduceRight (_ + _)                      //> res15: Int = 3
  myList.foldRight(-1)(_ + _)                     //> res16: Int = 2

  /* reduceLeft e reduceRight sono quivalenti solo per operazioni associtive e comulative */

  val l1: List[Int] = List(1, 2, 3)               //> l1  : List[Int] = List(1, 2, 3)
  val l2: List[Int] = List(4, 5, 6)               //> l2  : List[Int] = List(4, 5, 6)
  val l3: List[Int] = List(7, 8, 9)               //> l3  : List[Int] = List(7, 8, 9)

  l1 ++ l2 ++ l3                                  //> res17: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
  l1 ::: l2 ::: l3                                //> res18: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
  1 :: l1                                         //> res19: List[Int] = List(1, 1, 2, 3)

  val s: String = "Ciao Mondo!!!"                 //> s  : String = Ciao Mondo!!!

  s exists (c => c.isUpper)                       //> res20: Boolean = true
  s forall (c => c.isUpper)                       //> res21: Boolean = false
  s filter (c => c.isUpper)                       //> res22: String = CM
  val pair1: List[(Int, Char)] = l1 zip s         //> pair1  : List[(Int, Char)] = List((1,C), (2,i), (3,a))
  val pair2: IndexedSeq[(Char, Int)] = s zip l1   //> pair2  : IndexedSeq[(Char, Int)] = Vector((C,1), (i,2), (a,3))
  pair1.unzip                                     //> res23: (List[Int], List[Char]) = (List(1, 2, 3),List(C, i, a))
  pair2.unzip                                     //> res24: (IndexedSeq[Char], IndexedSeq[Int]) = (Vector(C, i, a),Vector(1, 2, 
                                                  //| 3))

  s flatMap (c => List('.', c))                   //> res25: String = .C.i.a.o. .M.o.n.d.o.!.!.!
  s map (c => List('.', c))                       //> res26: scala.collection.immutable.IndexedSeq[List[Char]] = Vector(List(., C
                                                  //| ), List(., i), List(., a), List(., o), List(.,  ), List(., M), List(., o), 
                                                  //| List(., n), List(., d), List(., o), List(., !), List(., !), List(., !))
  def isPrime(n: Int): Boolean = (2 until n) forall (x => n % x != 0)
                                                  //> isPrime: (n: Int)Boolean

  val n: Int = 10                                 //> n  : Int = 10

  // (1 until n) map (i => (1 until i) map (j => (i, j)))
  // (1 until n) map (i => (1 until i) map (j => (i, j))) flatten
  //(1 until n) flatMap (i => (1 until i) map (j => (i, j)))

  ((1 until n) flatMap (i => (1 until i) map (j => (i, j)))).filter(pair => isPrime(pair._1 + pair._2))
                                                  //> res27: scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((2,1), (3
                                                  //| ,2), (4,1), (4,3), (5,2), (6,1), (6,5), (7,4), (7,6), (8,3), (8,5), (9,2), 
                                                  //| (9,4), (9,8))

  for {
    i <- 1 until n
    j <- 1 until i
    if (isPrime(i + j))
  } yield (i, j)                                  //> res28: scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((2,1), (3
                                                  //| ,2), (4,1), (4,3), (5,2), (6,1), (6,5), (7,4), (7,6), (8,3), (8,5), (9,2), 
                                                  //| (9,4), (9,8))

  def scalarProduct(xs: List[Double], ys: List[Double]): Double = (for { (x, y) <- (xs zip ys) } yield x * y).sum
                                                  //> scalarProduct: (xs: List[Double], ys: List[Double])Double

  val names: List[String] = List("Mario", "Luca", "Sandro", "Laura")
                                                  //> names  : List[String] = List(Mario, Luca, Sandro, Laura)
  names groupBy (_.head)                          //> res29: scala.collection.immutable.Map[Char,List[String]] = Map(S -> List(Sa
                                                  //| ndro), M -> List(Mario), L -> List(Luca, Laura))

}