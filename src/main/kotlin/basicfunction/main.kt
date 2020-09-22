package basicfunction

fun hello(name: String): String {
    return if (name.isEmpty()) {
        ("Hello, World")
    } else {
        ("Hello, $name")
    }
}

fun main() {
    print("masukan nama : ")
    var inputName = readLine().toString()
    println(hello(inputName))
}