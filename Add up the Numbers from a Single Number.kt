
// Add up the Numbers from a Single Number

fun addUp(num: Int): Int {
    var result = 0
    for (index in 1..num) {
        result += index
    }
    return result
}

fun main() {

    println(addUp(4))
    println(addUp(13))
    println(addUp(600))
}



































