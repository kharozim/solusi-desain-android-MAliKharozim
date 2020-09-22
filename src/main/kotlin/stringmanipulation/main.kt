package stringmanipulation

fun manipulasi(acak: String, urutan: List<String>): String {
    var kataBenar :String = ""
    for (i in urutan) {
        if (i.toLowerCase() in acak) {
           kataBenar = kataBenar + "$i "
        }
    }
    return kataBenar
}

fun main() {
    var kata: String = "milkshakepizzachickenfriescokeburgerpizzasandwichmilkshakepizza"
    var urut: List<String> = mutableListOf(
        "Burger", "Fries", "Chicken",
        "Pizza", "Sandwich", "Onionrings",
        "Milkshake", "Coke",
    )
    var hasil = manipulasi(kata,urut)
    print(hasil)
}

//fun manipulasi2(kalimat: String): List<String> {
//    val array = listOf("Burger", "Fries", "Chicken", "Pizza", "Sandwich", "Onionrings", "Milkshake", "Coke")
//    val hasil = mutableListOf<String>()
//    for (i in array) {
//        var n = 0
//        while (kalimat.indexOf(i.toLowerCase(), n) >= 0) {
//            n = kalimat.indexOf(i.toLowerCase(), n)
//            hasil.add(i)
//            n++
//        }
//    }
//    return hasil
//}

//fun main() {
//    var hasil = manipulasi2("pizzachickenfriesburgercokemilkshakefriessandwich")
//    print(hasil)
//
//}