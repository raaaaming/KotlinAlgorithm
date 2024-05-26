import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = when {
        a%4 == 0 && a%100 != 0 -> 1
        a%400 == 0 -> 1
        else -> 0
    }
    println(b)
}