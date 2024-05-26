import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val a = if (sc.nextInt() > 0) 1 else -1
    val b = if (sc.nextInt() > 0) 2 else -2
    val c = when(a + b) {
        3 -> 1
        1 -> 2
        -3 -> 3
        -1 -> 4
        else -> {}
    }
    println(c)
}