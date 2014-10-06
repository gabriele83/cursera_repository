object ws1 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  def m1: Int = 3 + 2                             //> m1: => Int
  def m2(): Int = 3 + 2                           //> m2: ()Int
  m2                                              //> res0: Int = 5
  
  def m3(x:Int) = x+3                             //> m3: (x: Int)Int
  val f1 = (x:Int) => x+3                         //> f1  : Int => Int = <function1>
  f1                                              //> res1: Int => Int = <function1>
  
  /*metodo*/
  def abs1(x : Double) = if(x<0) -x else x        //> abs1: (x: Double)Double
  abs1(10)                                        //> res2: Double = 10.0
  
  /*funzione*/
  val abs2 = (x : Double) => if(x<0) -x else x    //> abs2  : Double => Double = <function1>
  abs2                                            //> res3: Double => Double = <function1>
  abs2(10)                                        //> res4: Double = 10.0
  
  val f2 = m1 _                                   //> f2  : () => Int = <function0>
  
  def negativeAbs(x : Double => Double, v:Double) = {
  	-x(v)
  }                                               //> negativeAbs: (x: Double => Double, v: Double)Double
  
  negativeAbs(abs2, 10)                           //> res5: Double = -10.0
 	/* abs1 è un metodo ma viene trasformato in funzione */
  negativeAbs(abs1, 10)                           //> res6: Double = -10.0
  
  
  
  
  
  
  
  
  
  
   
}