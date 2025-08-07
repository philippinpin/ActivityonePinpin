package com.example.activityone

fun main () {
    val mixedList = listOf("Hello", 42, true, 3.14, false)

    for (item in mixedList) {
        when (item) {
            is String -> println("String: \"$item\" has ${item.length} characters")
            is Int -> println("Integer: $item multiplied by 2 is ${item * 2}")
            is Boolean -> println("Boolean: $item")
            else -> println("Unknown type")
        }
    }
}
