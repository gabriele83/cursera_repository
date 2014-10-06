package funsets
import FunSets._

object ws {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  def f1 = (x: Int) => true                       //> f1: => Int => Boolean
  def f2 = (x: Int) => false                      //> f2: => Int => Boolean
  def f3 = (x: Int) => x == 2                     //> f3: => Int => Boolean
  def f4 = (x: Int) => x == 10                    //> f4: => Int => Boolean
  def f5 = (x: Int) => x == 2 || x == 10          //> f5: => Int => Boolean
  def f6 = (x: Int) => x % 2 == 0                 //> f6: => Int => Boolean

  println(f3(1))                                  //> false
  println(contains(Set(1, 2, 3, 4), 1))           //> true
  println(contains(union(Set(1, 2, 3, 4), Set(6, 7, 8, 9)), 5))
                                                  //> false
  println(contains(intersect(singletonSet(2), singletonSet(2)), 2))
                                                  //> true
  println(contains(filter(Set(1, 2, 3, 4), f5), 1))
                                                  //> false
  println(contains(filter(Set(1, 2, 3, 4), f5), 2))
                                                  //> true
  println(contains(filter(Set(1, 2, 3, 4), f5), 3))
                                                  //> false
                                                  
  printSet(filter(Set(1, 2, 3, 4), f5))           //> {2}
  
  
  
  
  
}