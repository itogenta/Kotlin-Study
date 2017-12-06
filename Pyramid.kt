//for (i in 4 downTo 1) print(i) // "4321"と表示される//
//for (i in 1..4 step 2) print(i)  "13"と表示される
//for (i in 4 downTo 1 step 2) print(i) // "42"と表示される
fun main(args: Array<String>){
	for(i in 1..4){
		for(j in 4 downTo i){
			print(j)
		}
		/*for(j in  1..4){
			println(j)
		}*/
		println()

	}
}
