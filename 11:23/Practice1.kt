//if文の練習

import java.lang.*
import java.util.*
fun main(args: Array<String>){
  if(args.size<2){
    println("Two intergers expected")
    return
  }

  var x = Integer.parseInt(args[0])
  var y = Integer.parseInt(args[1])

  if(x!=null && y != null){
    println(x*y)
  }
}
