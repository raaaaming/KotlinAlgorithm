import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    var a = sc.nextInt()
    var b = sc.nextInt()
    for (i in 1..45) {
        if (b == 0) {
            b = 60
            if (--a == -1) {
                a += 24
            }
        }
        b--
    }
    println("$a $b")
}