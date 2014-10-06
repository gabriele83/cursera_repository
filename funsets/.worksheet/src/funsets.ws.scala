package funsets
import FunSets._

object ws {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(90); 
  println("Welcome to the Scala worksheet");$skip(30); 

  def f1 = (x: Int) => true;System.out.println("""f1: => Int => Boolean""");$skip(29); 
  def f2 = (x: Int) => false;System.out.println("""f2: => Int => Boolean""");$skip(30); 
  def f3 = (x: Int) => x == 2;System.out.println("""f3: => Int => Boolean""");$skip(31); 
  def f4 = (x: Int) => x == 10;System.out.println("""f4: => Int => Boolean""");$skip(41); 
  def f5 = (x: Int) => x == 2 || x == 10;System.out.println("""f5: => Int => Boolean""");$skip(34); 
  def f6 = (x: Int) => x % 2 == 0;System.out.println("""f6: => Int => Boolean""");$skip(19); 

  println(f3(1));$skip(40); 
  println(contains(Set(1, 2, 3, 4), 1));$skip(64); 
  println(contains(union(Set(1, 2, 3, 4), Set(6, 7, 8, 9)), 5));$skip(68); 
  println(contains(intersect(singletonSet(2), singletonSet(2)), 2));$skip(52); 
  println(contains(filter(Set(1, 2, 3, 4), f5), 1));$skip(52); 
  println(contains(filter(Set(1, 2, 3, 4), f5), 2));$skip(52); 
  println(contains(filter(Set(1, 2, 3, 4), f5), 3));$skip(91); 
                                                  
  printSet(filter(Set(1, 2, 3, 4), f5))}
  
  
  
  
  
}
