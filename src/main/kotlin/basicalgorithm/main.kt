package basicalgorithm

import kotlin.math.tan

fun multiplicationTable(n: Int): List<IntArray> {
    var array = Array(n) { IntArray(n) }
    for (i in 0 until n) {
        for (j in 0 until n) {
            array[i][j] = (i + 1) * (j + 1)
        }
    }
    return array.toList()
}

fun main() {

    print("masukan angka yang anda inginkan : ")
    val input = readLine()!!.toInt()
    var tabel = multiplicationTable(input)
    tabel.forEach { println(it.toList()) }

//    for (i in tabel) {
//        println(i.toList())
//    }

}