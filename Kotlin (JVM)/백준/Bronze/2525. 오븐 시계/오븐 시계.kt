import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    var a = sc.nextInt()
    var b = sc.nextInt()
    val c = sc.nextInt()
    if (c/60 == 0) { b += c }
    if (c/60 > 0) {
        a += c/60
        b += c - (c/60)*60
    }
    if (b > 59) {
        a += b/60
        b -= 60*(b/60)
    }
    if (a > 23) {
        a -= 24
    }
    println("$a $b")
}