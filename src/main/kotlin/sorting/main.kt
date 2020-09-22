package sorting

fun prosesSwap(dataku: MutableList<Int> = mutableListOf()) {
    var a: Int
    var b: Int
    var i = 0
    var hitungSwap = 0

    while (i < dataku.size - 1) {
        if (dataku[i] > dataku[i + 1]) {
            a = dataku[i]
            b = dataku[i + 1]
            a = b.also { b = a }
            dataku[i] = a
            dataku[i + 1] = b
            hitungSwap++
            println("$hitungSwap. [$a, $b] -> ${dataku.joinToString().replace(",", "")}")
            i = 0
        } else {
            i++
        }
    }
    println("\n Jumlah Swap : $hitungSwap")
}

fun main() {
    var hasil = mutableListOf<Int>(4, 9, 7, 5, 8, 9, 3)
    prosesSwap(hasil)
}
