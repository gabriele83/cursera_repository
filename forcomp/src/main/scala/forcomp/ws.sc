package forcomp
import forcomp.Anagrams._

object ws {
  val x = List(('a', 1), ('d', 1), ('l', 1), ('r', 1))
                                                  //> x  : List[(Char, Int)] = List((a,1), (d,1), (l,1), (r,1))
  val y = List(('r', 1))                          //> y  : List[(Char, Int)] = List((r,1))
 // List(('a', 1), ('d', 1), ('l', 1))
  subtract(x, y)                                  //> res0: forcomp.Anagrams.Occurrences = List((a,1), (d,1), (l,1), (r,1))
  
}