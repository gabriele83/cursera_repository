package my_test

object intsets {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  val t1 = new NonEmpty(3, Empty, Empty)          //> t1  : my_test.NonEmpty = {.3.}
  val t2 = t1 include 4                           //> t2  : my_test.IntSet = {.3{.4.}}
  val t3 = t1 union t2                            //> t3  : my_test.IntSet = {.3{.4.}}

}

abstract class IntSet {

  def include(x: Int): IntSet
  def contains(x: Int): Boolean
  def union (x: IntSet): IntSet

}

// object --> singleton
object Empty extends IntSet {

  def include(x: Int): IntSet = new NonEmpty(x, Empty, Empty)
  def contains(x: Int): Boolean = false
  def union (x: IntSet): IntSet = x
  
  override def toString = "."

}

class NonEmpty(elem: Int, left: IntSet, right: IntSet) extends IntSet {

  def include(x: Int): IntSet = {
    if (x < elem) new NonEmpty(elem, left include x, right)
    else if (x > elem) new NonEmpty(elem, left, right include x)
    else this
  }

  def contains(x: Int): Boolean = {
    if (x < elem) left contains x
    else if (x > elem) right contains x
    else true
  }
  
   def union (x: IntSet): IntSet = ((left union right) union x) include elem

  override def toString = "{" + left + elem + right + "}"

}