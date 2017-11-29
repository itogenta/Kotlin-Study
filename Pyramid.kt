fun main(args: Array<String>){
	for(i in 1..3){
		for(j in i downTo 1 step 1)
			if(j>1)
				print(j)
			else
				println(j)
	}
}
