fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    repeat(br.readLine().toInt()) {
        val (a, b) = br.readLine().split(" ").map { it.toInt() }
        var num = a % 10
        repeat(b - 1) {
            num *= a
            num %= 10
        }
        if (num == 0) bw.write("10\n") else bw.write("${num}\n")
    }
    bw.flush()
    bw.close()
    br.close()
}