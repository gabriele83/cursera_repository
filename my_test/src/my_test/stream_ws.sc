package my_test

import com.sun.org.apache.xml.internal.serializer.ToStream

object stream_ws {
  (1 to 1000).toStream                            //> res0: scala.collection.immutable.Stream[Int] = Stream(1, ?)
  
}