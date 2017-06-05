package _1_declare_types

import com.sun.org.apache.xpath.internal.operations.Bool

fun main(args: Array<String>) {

    /**
     * 声明
     * - 变量：var name: type = value
     * - 常量：val name: type = value
     * - 支持类型推导
     */
    var name = "demo"
    val MAX_NUM = 20

    /**
     * 基本类型
     *
     * 1. 数字
     * - 类型：Double, Float, Long, Int, Short, Byte
     * - 不支持八进制
     * - 浮点数默认Double，Float需后缀
     * - 支持数字下划线增加可读性
     * - 数字装箱：Int?
     *
     */
    var num:Int = 33333_3

    var numObj1: Int? = num
    var numObj2: Int? = num

    println(numObj1 === numObj2)        // false
    println(numObj1 == numObj2)         // true


    /**
     * 2. 字符
     * - 类型：Char
     */
    var ch: Char = 'a'


    /**
     * 3. 布尔值
     * - 类型：Boolean
     * - 值：true, false
     */
    var isDeleted: Boolean = false


    /**
     * 类型转换
     * - 不支持隐式类型转换
     * - 转换方法：toByte(), toShort(), toInt(), toLong(), toFloat(), toDouble(), toChat()
     */

    /**
     * 类型检测
     * - is操作符
     */

}