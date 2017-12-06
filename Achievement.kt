import java.util.Scanner

fun main(args: Array<String>){
	val classDays = 16
	println("出席日数を入力してください")
	val attend : Int = Scanner(System.`in`).nextInt()
  println("成績を入力してください")
  val score : Int = Scanner(System.`in`).nextInt()

	if(attend/classDays < 11){
		println("F")
	}
	else{
		when {
			score >= 90 -> println("S")
			score >= 80 -> println("A")
			score >= 70 -> println("B")
			score >= 60 -> println("C")
			else        -> println("D")
		}
	}
}

/*
出席日数を入力してください
14
成績を入力してください
74
B
*/
