
// Filter out Strings from an Array

fun filterArray(myList: ArrayList<Any>) = myList.filter { it is Int }

fun main() {

    println(filterArray(arrayListOf(1, 2, "a", "b")))
    println(filterArray(arrayListOf(1, "a", "b", 0, 15)))
    println(filterArray(arrayListOf(1, 2, "aasf", "1", "123", 123)))
}