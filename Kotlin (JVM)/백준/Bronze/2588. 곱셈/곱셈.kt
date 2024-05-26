import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val ints = listOf(b - 100*(b/100) - 10*(b/10 - (b/100)*10), b/10 - (b/100)*10, b/100)
    for (element in ints) {
        println(a * element)
    }
    println(a * b)
}