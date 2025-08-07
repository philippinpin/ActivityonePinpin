package com.example.activityone

fun reversedList(original: List<Int>): List<Int>{
    val reversed = mutableListOf<Int>()
    for (i in original.size -1 downTo 0) {
        reversed.add(original[i])
    }
    return reversed
    }

fun main() {
    val myList = listOf(1,2,3,4,5,6,7,8,9,10)
    val reversed = reversedList(myList)

    println("Original List: $myList")
    println("Reversed List $reversed")
}
