
// Simple Circle Collision Detection

fun isCircleCollision(array: ArrayList<ArrayList<Int>>): Boolean {
    val dx = array[1][1] - array[0][1]
    val dy = array[1][2] - array[0][2]
    val radii = array[0][0] + array[1][0]
    return (dx * dx) + (dy * dy) < (radii * radii)
}

fun main() {

    // radius, x, y
    println(isCircleCollision(arrayListOf(arrayListOf(10,0,0), arrayListOf(10,10,10))))
    println(isCircleCollision(arrayListOf(arrayListOf(1,0,0), arrayListOf(1,10,10))))
}