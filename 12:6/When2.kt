import java.util.Scanner
fun main(args: Array<String>){
  var input =Scanner(System.`in`)
  println("授業出席日数")
  var attend :Int = input.nextInt()

  if(attend>=11){
    println("出席回数は満たしてます")
    println("Score input")
    var score : Int = input.nextInt()

    when {
      score >= 90 -> println("S")
      score >= 80 -> println("A")
      score >= 70 -> println("B")
      score >= 60 -> println("C")
      else        -> println("D")
    }

  }else{

    println("Score input")
    var score : Int = input.nextInt()
    println("F")
  }
}
/*
example：Let's create an evaluation program by inputting the score！！
90over A
80over B
70over C
60over D
else F

実行画面
Score input
70
C
*/
