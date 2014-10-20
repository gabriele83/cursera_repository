package patmat

import patmat.Huffman._

object ws {
  val ct: CodeTree = createCodeTree("abc".toList) //> ct  : patmat.Huffman.CodeTree = Fork(Fork(Leaf(c,1),Leaf(a,1),List(c, a),2),
                                                  //| Leaf(b,1),List(c, a, b),3)
  val bar: List[Bit] = List(0, 1, 1, 1, 0, 0, 0, 1, 0, 1)
                                                  //> bar  : List[patmat.Huffman.Bit] = List(0, 1, 1, 1, 0, 0, 0, 1, 0, 1)
  
  decode(ct, bar)                                 //> res0: List[Char] = List(a, b, c, a)
 
  

}