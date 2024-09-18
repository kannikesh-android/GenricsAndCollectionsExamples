package com.presentation.genricsandcollections.examples.utils


// * is Star Projection - Unknown
fun <T : Collection<*>> printDataStructure(collection: T) {
    if (collection.isEmpty()) {
        println("No books in the ${collection::class.simpleName}.")
    } else {
        collection.forEach { book ->
            println(book.toString())
        }
    }
}