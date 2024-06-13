import java.util.Scanner

fun main() {

    val sc = Scanner(System.`in`)

    var allScore = 0.0
    var sumScore = 0.0

    for (i in 0 until 20) {

        val subject = sc.next()
        val score = sc.nextDouble()
        val grade = parsedGrade(sc.next()) ?: continue

        allScore += score*grade
        sumScore += score
    }

    val result = allScore / sumScore

    println(result)
}

fun parsedGrade(grade: String?): Double? {
    if (grade == null) return 0.0
    return when(grade) {
        "A+" -> 4.5
        "A0" -> 4.0
        "B+" -> 3.5
        "B0" -> 3.0
        "C+" -> 2.5
        "C0" -> 2.0
        "D+" -> 1.5
        "D0" -> 1.0
        "F" -> 0.0
        else -> null
    }

}