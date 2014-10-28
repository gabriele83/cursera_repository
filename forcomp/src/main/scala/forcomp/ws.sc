package forcomp
import forcomp.Anagrams._

object ws {

	sentenceAnagrams(List())                  //> java.lang.UnsupportedOperationException: empty.reduceLeft
                                                  //| 	at scala.collection.LinearSeqOptimized$class.reduceLeft(LinearSeqOptimiz
                                                  //| ed.scala:124)
                                                  //| 	at scala.collection.immutable.List.reduceLeft(List.scala:84)
                                                  //| 	at forcomp.Anagrams$.sentenceOccurrences(Anagrams.scala:42)
                                                  //| 	at forcomp.Anagrams$.sentenceAnagrams(Anagrams.scala:169)
                                                  //| 	at forcomp.ws$$anonfun$main$1.apply$mcV$sp(forcomp.ws.scala:6)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at forcomp.ws$.main(forcomp.ws.scala:4)
                                                  //| 	at forcomp.ws.main(forcomp.ws.scala)
  sentenceAnagrams(List("Linux", "rulez"))

}