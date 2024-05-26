import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = when {
        a > b -> ">"
        a < b -> "<"
        else -> "=="
    }
    println(c)
}