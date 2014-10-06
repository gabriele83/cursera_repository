package my_test

object apply_ws {

  type Set = Int => Boolean

  def contains(s: Set, elem: Int): Boolean = s(elem)
                                                  //> contains: (s: my_test.apply_ws.Set, elem: Int)Boolean
  def singletonSet(elem: Int): Set = Set(elem)    //> singletonSet: (elem: Int)my_test.apply_ws.Set
  def union(s: Set, t: Set): Set = (x: Int) => s(x) || t(x)
                                                  //> union: (s: my_test.apply_ws.Set, t: my_test.apply_ws.Set)my_test.apply_ws.Se
                                                  //| t

  val s1 = singletonSet(1)                        //> s1  : my_test.apply_ws.Set = Set(1)
  val s2 = singletonSet(2)                        //> s2  : my_test.apply_ws.Set = Set(2)
  val s3 = singletonSet(3)                        //> s3  : my_test.apply_ws.Set = Set(3)

  println(contains(s1, 1))                        //> true

 }