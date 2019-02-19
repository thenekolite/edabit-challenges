
// Sort Numbers in Descending Order

fun getNumberResult(number: Int): String {
    var result = ""
    number.toString()
        .split("")
        .filter { it != "" }
        .sorted()
        .reversed()
        .map { result += it }
    return result
}

fun main() {

    println(getNumberResult(123))
    println(getNumberResult(1254859723))
    println(getNumberResult(73065))
}