package my_test

object apply_ws {

  type Set = Int => Boolean;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(120); 

  def contains(s: Set, elem: Int): Boolean = s(elem);System.out.println("""contains: (s: my_test.apply_ws.Set, elem: Int)Boolean""");$skip(47); 
  def singletonSet(elem: Int): Set = Set(elem);System.out.println("""singletonSet: (elem: Int)my_test.apply_ws.Set""");$skip(60); 
  def union(s: Set, t: Set): Set = (x: Int) => s(x) || t(x);System.out.println("""union: (s: my_test.apply_ws.Set, t: my_test.apply_ws.Set)my_test.apply_ws.Set""");$skip(29); 

  val s1 = singletonSet(1);System.out.println("""s1  : my_test.apply_ws.Set = """ + $show(s1 ));$skip(27); 
  val s2 = singletonSet(2);System.out.println("""s2  : my_test.apply_ws.Set = """ + $show(s2 ));$skip(27); 
  val s3 = singletonSet(3);System.out.println("""s3  : my_test.apply_ws.Set = """ + $show(s3 ));$skip(29); 

  println(contains(s1, 1))}

 }
