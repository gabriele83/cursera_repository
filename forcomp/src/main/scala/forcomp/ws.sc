package forcomp
import forcomp.Anagrams._

object ws {
  val x = List(('a', 1), ('d', 1), ('l', 1), ('r', 1))
                                                  //> x  : List[(Char, Int)] = List((a,1), (d,1), (l,1), (r,1))
  val y = List(('r', 1))                          //> y  : List[(Char, Int)] = List((r,1))
 // List(('a', 1), ('d', 1), ('l', 1))
  subtract(x, y)                                  //> -->(List(),(a,1))<--
                                                  //| -->(List(),(d,1))<--
                                                  //| -->(List(),(l,1))<--
                                                  //| -->(List(),(r,1))<--
                                                  //| res0: forcomp.Anagrams.Occurrences = List()
  
  
}