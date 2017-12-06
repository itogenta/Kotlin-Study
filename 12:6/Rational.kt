fun main(args: Array<String>){

  val iterable = listOf(1,2,3,4,5)
  iterable.forEachIndexed{index,value ->println("[$index] =  $value")}
  
}
