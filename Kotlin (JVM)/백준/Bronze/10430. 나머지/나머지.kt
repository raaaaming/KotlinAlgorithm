import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val A = sc.nextInt()
    val B = sc.nextInt()
    val C = sc.nextInt()
    println((A+B)%C)
    println(((A%C) + (B%C))%C)
    println((A*B)%C)
    println(((A%C) * (B%C))%C)
}