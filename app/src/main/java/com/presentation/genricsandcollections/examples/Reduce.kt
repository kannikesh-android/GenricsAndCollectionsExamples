package com.presentation.genricsandcollections.examples

fun main(){
    val numbers = listOf(1, 2, 3, 4, 5)
    val sum = numbers.reduce { acc, number -> acc + number }
    println(sum) // Output: 15

//    var su = 0
//    numbers.forEach{
//        su += it
//    }
//
//    println(su)
}