package funsets
import FunSets._

object ws {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  // set
  var s = Set(-1000, -1, 0, 1, 2, 1000)           //> s  : scala.collection.immutable.Set[Int] = Set(0, 1, -1000, 2, 1000, -1)
  var sC = Set(1, 3, 4, 5, 7, 1000)               //> sC  : scala.collection.immutable.Set[Int] = Set(5, 1, 7, 1000, 3, 4)
  var s14 = Set(1, 2, 3, 4)                       //> s14  : scala.collection.immutable.Set[Int] = Set(1, 2, 3, 4)
  var s36 = Set(3, 4, 5, 6)                       //> s36  : scala.collection.immutable.Set[Int] = Set(3, 4, 5, 6)

  // function
  def f_true = (x: Int) => true                   //> f_true: => Int => Boolean
  def f_false = (x: Int) => false                 //> f_false: => Int => Boolean
  def f_eq2 = (x: Int) => x == 2                  //> f_eq2: => Int => Boolean
  def f_gt5_lt10 = (x: Int) => (x >= 5 && x <= 10)//> f_gt5_lt10: => Int => Boolean
  def f_even = (x: Int) => x % 2 == 0             //> f_even: => Int => Boolean

  printSet(f_gt5_lt10)                            //> {5,6,7,8,9,10}

  // union
  printSet(union(s14, s36))                       //> {1,2,3,4,5,6}
  printSet(union(s, f_false))                     //> {-1000,-1,0,1,2,1000}
  printSet(union(s36, f_eq2))                     //> {2,3,4,5,6}
  printSet(union(s14, f_gt5_lt10))                //> {1,2,3,4,5,6,7,8,9,10}

  // intersect
  printSet(intersect(s, f_true))                  //> {-1000,-1,0,1,2,1000}
  printSet(intersect(s14, f_false))               //> {}
  printSet(intersect(s14, f_eq2))                 //> {2}
  printSet(intersect(s36, f_gt5_lt10))            //> {5,6}
  printSet(intersect(s14, f_even))                //> {2,4}

  // filter
  printSet(filter(s, f_true))                     //> {-1000,-1,0,1,2,1000}
  printSet(filter(s14, f_false))                  //> {}
  printSet(filter(s14, f_eq2))                    //> {2}
  printSet(filter(s36, f_gt5_lt10))               //> {5,6}
  printSet(filter(s14, f_even))                   //> {2,4}

  // diff
  printSet(diff(s14, f_false))                    //> {1,2,3,4}
  printSet(diff(s14, f_eq2))                      //> {1,3,4}
  printSet(diff(s36, f_gt5_lt10))                 //> {3,4}

  // forall
  forall(s, f_true)                               //> res0: Boolean = true
  forall(s14, f_false)                            //> res1: Boolean = false
  forall(s14, f_eq2)                              //> res2: Boolean = false
  forall(s36, f_gt5_lt10)                         //> res3: Boolean = false
  forall(s14, f_even)                             //> res4: Boolean = false

  // exists
  exists(s, f_true)                               //> res5: Boolean = true
  exists(s14, f_false)                            //> res6: Boolean = false
  exists(s14, f_eq2)                              //> res7: Boolean = true
  exists(s36, f_gt5_lt10)                         //> res8: Boolean = true
  exists(s14, f_even)                             //> res9: Boolean = true
  

}