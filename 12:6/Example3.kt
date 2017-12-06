import java.*;
fun main(args: Array<String>){
 println((1..5).toList())
 println((5..1).reversed().toList())
 println((5 downTo 1).toList())

 var list = arrayOf(1,2,3)

 list[0] = list[1] + list[2]

 for(item in list){
   println(item)
 }
}
