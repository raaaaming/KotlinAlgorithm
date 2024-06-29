fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val n = br.readLine().toInt()
    val arr = Array(n) {
        br.readLine()
    }
    var st = ""
    var s: Char
    for (c in 0 until arr[0].length) {
        s = arr[0][c]
        for (i in 1 until n) {
            s = if (s == arr[i][c]) s else '?'
            if (s == '?') break
        }
        st += s
    }
    bw.write(st)
    bw.close()
}