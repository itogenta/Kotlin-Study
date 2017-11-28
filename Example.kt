//二次関数を解いてみる　ax^2 + bx +c =0
/*kotlin Example 1 -8 12
1x*x + -8x + 12
        解 x1 = 6.0
        解 x2 = 2.0*/

	/*kotlin Example 1 2 1
			1x*x + 2x + 1
      解 x1 = -1.0
	    解 x2 = -1.0*/
			
internal object Example {
    @JvmStatic
    fun main(args: Array<String>) {
        print(args[0] + "x*x + ")
        print(args[1] + "x + ")
        println(args[2])
        //引数を double 型に変換
        val a = java.lang.Double.parseDouble(args[0])
        val b = java.lang.Double.parseDouble(args[1])
        val c = java.lang.Double.parseDouble(args[2])
        //メソッドの戻り値を配列で定義
        val x: DoubleArray
        //メソッド呼び出し
        x = kai(a, b, c)
        println("\t解 x1 = " + x[0])
        println("\t解 x2 = " + x[1])
    }

    fun kai(a: Double, b: Double, c: Double): DoubleArray {
        //解の配列を定義
        val x = doubleArrayOf(0.0, 0.0)
        //判別式の変数を定義
        var d2:Double = 0.0
        var d:Double = 0.0
        //判別式
        d2 = b * b - 4.0 * a * c
        if (d2 < 0) {    //虚数解ならば
            println("虚数解！ 判別式 = " + d2)
        } else {    //実数解ならば
            //java.lang.Math クラスの静的メソッド sqrt()
            //d2 の平方根（ルート）計算
            d = Math.sqrt(d2)
            x[0] = (-b + d) / (2 * a)    //解１
            x[1] = (-b - d) / (2 * a)    //解２
        }
        return x    //解を配列で戻す
    }
}
