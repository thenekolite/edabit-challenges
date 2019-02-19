
// Return the Last Item in an Array

fun getLastItem(array: ArrayList<Int>) : Int {
    return array.last()
}

fun main() {

    println(getLastItem(arrayListOf(1, 2, 3)))
    println(getLastItem(arrayListOf(0)))
    println(getLastItem(arrayListOf(-1, -3)))
}