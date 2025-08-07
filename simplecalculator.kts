package com.example.activityone

fun calculator (num1: Double,num2: Double, operator: Char): Double{
    return when(operator) {
        '+' -> num1 + num2
        '-' -> num1 - num2
        '*' -> num1 * num2
        '/' -> if (num2 != 0.0) num1 / num2 else Double.NaN
        else -> {
            println("Invalid Operator")
            Double.NaN
        }
    }
}



fun main(){
val number1 = 5.0
    val number2 = 90.0
    val operator = '*'
    val result = calculator (number1, number2, operator)
    println("Calculator Result: $number1 $operator $number2 = $result")
}
