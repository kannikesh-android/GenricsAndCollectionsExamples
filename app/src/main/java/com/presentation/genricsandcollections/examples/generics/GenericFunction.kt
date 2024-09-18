package com.presentation.genricsandcollections.examples.generics

fun calculateSumInt(a: Int, b: Int): Int {
    return a + b
}

fun calculateSumDouble(a: Double, b: Double): Double {
    return a + b
}

fun <T : Number> calculateSum(a: T, b: T) : Double {
    return when {
        a is Int && b is Int -> (a + b).toDouble()
        a is Float && b is Float -> (a + b).toDouble()
        a is Double && b is Double -> a + b
        a is Long && b is Long -> (a + b).toDouble()
        // Handle mixed types by converting both to Double
        else -> a.toDouble() + b.toDouble()
    }
}


fun <T> sortCollection(collection: Collection<T>) where T: Comparable<T> {
    val sortedCollection = collection.sorted()
    println(sortedCollection)
}

fun main() {
    val sum = calculateSum(10, 10.0)
    println(sum) // Output will be 20.0
}