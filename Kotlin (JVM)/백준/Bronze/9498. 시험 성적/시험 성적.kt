import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = when {
        a in 90..100 -> "A"
        a in 80..89 -> "B"
        a in 70..79 -> "C"
        a in 60..69 -> "D"
        else -> "F"
    }
    println(b)
}