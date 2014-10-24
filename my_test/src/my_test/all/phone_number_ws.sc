package my_test.all

import my_test.all.Cellphone._

object phone_number_ws {

  wordCode("Java")                                //> res0: String = 5282
  translate("5282")                               //> res1: Set[String] = Set(Java, lava)
  
  wordCode("Scalaisfun")                          //> res2: String = 7225247386
  translate("7225247386")                         //> res3: Set[String] = Set(sack air fun, pack ah re to, pack bird to, Scala ire
                                                  //|  to, Scala is fun, rack ah re to, pack air fun, sack bird to, rack bird to, 
                                                  //| sack ah re to, rack air fun)


}