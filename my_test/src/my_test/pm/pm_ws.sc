package my_test.pm

object pm_ws {
  val n1 = Number(1)                              //> n1  : my_test.pm.Number = Number(1)
  val n2 = Number(2)                              //> n2  : my_test.pm.Number = Number(2)
  val n3 = Number(3)                              //> n3  : my_test.pm.Number = Number(3)
  val n4 = Number(4)                              //> n4  : my_test.pm.Number = Number(4)
  val n5 = Number(5)                              //> n5  : my_test.pm.Number = Number(5)
  val n6 = Number(6)                              //> n6  : my_test.pm.Number = Number(6)

  val exp1 = Sum(n1, n2)                          //> exp1  : my_test.pm.Sum = Sum(Number(1),Number(2))
  val exp2 = Sum(n2, n3)                          //> exp2  : my_test.pm.Sum = Sum(Number(2),Number(3))
  val exp3 = Sum(n4, n5)                          //> exp3  : my_test.pm.Sum = Sum(Number(4),Number(5))
  val exp4 = Sum(exp1, exp2)                      //> exp4  : my_test.pm.Sum = Sum(Sum(Number(1),Number(2)),Sum(Number(2),Number(3
                                                  //| )))
  val exp5 = Sum(exp4, n6)                        //> exp5  : my_test.pm.Sum = Sum(Sum(Sum(Number(1),Number(2)),Sum(Number(2),Numb
                                                  //| er(3))),Number(6))
  
  exp5.eval                                       //> res0: Int = 14
  exp5.show                                       //> res1: String = (((1+2)+(2+3))+6)
  
  
  

}