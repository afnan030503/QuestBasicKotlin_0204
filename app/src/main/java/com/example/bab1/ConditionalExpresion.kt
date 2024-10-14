package com.example.bab1

fun ConditionalStatement(){
    println("=== Conditional Expression ===")


    // If-Else
    val number = 10
    if (number > 0){
        println("Positive number")
    } else {
        println("Negative number")
    }
    //when
    val day = 1
    when (day){
        1 -> println("Minggu")
        2 -> println("Senin")
        3 -> println("Selasa")
        4-> println("Rabu")
        5-> println("Kamis")
        6-> println("Jumat")
        7-> println("Sabtu")
        else ->println("Invalid")
    }
}
