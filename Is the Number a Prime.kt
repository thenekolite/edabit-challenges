
// Is the Number a Prime?

fun isPrime(number: Int): Boolean {
    val limit = Math.sqrt(number.toDouble()).toInt()
    var result = true
    for (index in 2..limit) {
        if (number % index == 0) {
            result = false
        }
    }
    return result
}

fun main() {

    println(isPrime(7))
    println(isPrime(9))
    println(isPrime(10))
}