package _1_declare_types

/**
 * Created by honpery on 2017/6/4.
 */
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
     * - 数字
     *    - 类型：Byte, Short, Int, Long, Float, Double
     *    - 不支持八进制数
     *    - 浮点数默认Double，Float需要F标记
     *    - 支持数字下划线增加可读性
     *
     * - 字符
     *    - 类型：Char
     *
     * - 布尔值
     *    - 类型：Boolean
     *    - 值：true, false
     */
    var num: Int = 20
    var ch: Char = 'a'
    var isDel: Boolean = false

}