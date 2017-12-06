import java.util.Scanner

fun main(args: Array<String>){
    val monlist = listOf(31,28,31,30,31,30,31,31,30,31,30,31)
    var t = 0
    val input = Scanner(System.`in`)
    println("month input")
    var month : Int = input.nextInt()
    println("day input")
    val day : Int = input.nextInt()
    month = month-1
    for(i in 1..month){
        t =  t + monlist[i-1]
    }
    val ans : Int = day + t
    when(ans % 7){
        1 -> println("Sunday")
        2 -> println("Monday")
        3 -> println("Tuesday")
        4 -> println("Whednsday")
        5 -> println("Tuersday")
        6 -> println("Friday")
        0 -> println("Saturday")
    }

}

/*
output  result
month input
8
day input
27
Sunday*/
