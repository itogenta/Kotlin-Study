import java.util.Scanner
fun main(args: Array<String>){
  var input =Scanner(System.`in`)
  println("Score input")
  var score : Int = input.nextInt()

    when {
      score >= 90 -> println("A")
      score >= 80 -> println("B")
      score >= 70 -> println("C")
      score >= 60 -> println("D")
      else        -> println("F")
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
