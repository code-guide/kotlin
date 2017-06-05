package _3_statement

fun main(args: Array<String>) {

    /**
     * 分支
     * - if 表达式
     * - when表达式
     */

    val a = 10
    val b = 20

    if (a > b) {
        println("a > b")
    } else {
        println("a <= b")
    }

    if (a > b) println("a > b") else println("a <= b")

    val result = if (a > b) 1 else 2
    println(result)


//    固定值
    val size = "xs"
    when(size) {
        "big" -> println(2)
        "normal" -> println(1)
        "small", "xs" -> println(0)
        else -> println("err size.")
    }


//    范围
    val score = 77
    when (score) {
        in 1..60 -> println("bad")
        in 61..100 -> println("good")
        else -> println("err score.")
    }

    /**
     * 循环
     * - for 循环: for (item in arr) statements
     * - while 循环: while () {}, do{}while()
     */
    val arr = Array(5, {i -> i})
    for (item in arr) println(item)

    /**
     * 跳转
     * - return
     * - break
     * - continue
     */

}