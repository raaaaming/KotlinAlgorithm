fun main() {
    var sum = 0

    val first = readln().toInt()
    val second = readln()

    val arr = second.split("", limit = first + 1)

    for (i in 1..first) {

        sum += arr[i].toInt()

    }
    println(sum)
}