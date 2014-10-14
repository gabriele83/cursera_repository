package my_test.list

trait List[+T] {
  def isEmpty: Boolean
  def head: T
  def tail: List[T]
  def prepend[U >: T](elem: U): List[U] = new Cons(elem, this)
}

object Nil extends List[Nothing]{
  def isEmpty: Boolean = true
  def head: Nothing = throw new NoSuchElementException
  def tail: Nothing = throw new NoSuchElementException
}

class Cons[T] (val head: T, val tail: List[T]) extends List[T]{
  def isEmpty: Boolean = false  
}

object List{
 def apply[T](x: T, y: T): List[T] = new Cons(x, new Cons(y, Nil))
 def apply[T](): List[T] = Nil
 
}