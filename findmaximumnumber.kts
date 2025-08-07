package com.example.activityone

fun main() {
    val numbers = listOf(12, 87, 45, 66, 29)
    var max = numbers[0]
    for (num in numbers) {
        if (num > max) {
            max = num
        }
    }
    println("The largest number is: $max")
}
