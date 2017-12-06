fun main(args: Array<String>){
    val hoge = 2

    when{
      hoge == 0 -> {
        println("0")
      }
      hoge ==1 || hoge ==2 ->{
        println("1,2")
      }
      else ->{
        println("else")
      }
    }


}
