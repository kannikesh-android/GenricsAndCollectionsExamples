package com.presentation.genricsandcollections.examples.generics

class TripleWrapper<A, B, C>(private val first: A, private val second: B, private val third: C) {
    fun printAll() {
        println("First: $first, Second: $second, Third: $third")
    }

    fun getFirst(): A = first
    fun getSecond(): B = second
    fun getThird(): C = third
}

fun main(){
    val wrapper = TripleWrapper("Kotlin", 42, true)

    println("First: ${wrapper.getFirst()}")
    println("Second: ${wrapper.getSecond()}")
    println("Third: ${wrapper.getThird()}")

    wrapper.printAll()
}