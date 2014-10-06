object ws1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(56); 
  println("Welcome to the Scala worksheet");$skip(22); 
  def m1: Int = 3 + 2;System.out.println("""m1: => Int""");$skip(24); 
  def m2(): Int = 3 + 2;System.out.println("""m2: ()Int""");$skip(5); val res$0 = 
  m2;System.out.println("""res0: Int = """ + $show(res$0));$skip(25); 
  
  def m3(x:Int) = x+3;System.out.println("""m3: (x: Int)Int""");$skip(26); 
  val f1 = (x:Int) => x+3;System.out.println("""f1  : Int => Int = """ + $show(f1 ));$skip(5); val res$1 = 
  f1;System.out.println("""res1: Int => Int = """ + $show(res$1));$skip(59); 
  
  /*metodo*/
  def abs1(x : Double) = if(x<0) -x else x;System.out.println("""abs1: (x: Double)Double""");$skip(11); val res$2 = 
  abs1(10);System.out.println("""res2: Double = """ + $show(res$2));$skip(65); 
  
  /*funzione*/
  val abs2 = (x : Double) => if(x<0) -x else x;System.out.println("""abs2  : Double => Double = """ + $show(abs2 ));$skip(7); val res$3 = 
  abs2;System.out.println("""res3: Double => Double = """ + $show(res$3));$skip(11); val res$4 = 
  abs2(10);System.out.println("""res4: Double = """ + $show(res$4));$skip(19); 
  
  val f2 = m1 _;System.out.println("""f2  : () => Int = """ + $show(f2 ));$skip(70); 
  
  def negativeAbs(x : Double => Double, v:Double) = {
  	-x(v)
  };System.out.println("""negativeAbs: (x: Double => Double, v: Double)Double""");$skip(27); val res$5 = 
  
  negativeAbs(abs2, 10);System.out.println("""res5: Double = """ + $show(res$5));$skip(82); val res$6 = 
 	/* abs1 è un metodo ma viene trasformato in funzione */
  negativeAbs(abs1, 10);System.out.println("""res6: Double = """ + $show(res$6))}
  
  
  
  
  
  
  
  
  
  
   
}
