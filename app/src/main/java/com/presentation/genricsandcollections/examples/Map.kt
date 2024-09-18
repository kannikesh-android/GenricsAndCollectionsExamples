package com.presentation.genricsandcollections.examples

import com.presentation.genricsandcollections.examples.model.Book

/*
* put()
* */

fun main() {
    val bookMap = HashMap<Book, String>()

    // Creating books
    val book1 = Book(bookId = 1, name = "Interstellar", price = 25.99)
    val book2 = Book(bookId = 2, name = "Mystery of the Space", price = 19.99)
    val book3 = Book(bookId = 3, name = "The Galactic Journey", price = 29.99)

    // Using put() to add books to the HashMap
    bookMap[book1] = "Science Fiction"
    bookMap[book2] = "Mystery"
    bookMap[book3] = "Adventure"

    println("Books in HashMap:")
    printBookMap(bookMap)

    // Using put() to update an existing entry (book1)
    bookMap[book1] = "Updated Science Fiction"

    println("\nAfter updating book1:")
    printBookMap(bookMap)

    // Removing a book from the HashMap
    bookMap.remove(book2)
    println("\nAfter removing book2:")
    printBookMap(bookMap)

    // Checking if a specific book is present
    val containsBook1 = bookMap.containsKey(book1)
    println("\nHashMap contains book1: $containsBook1")

    // Clearing all elements from the HashMap
    bookMap.clear()
    println("\nBooks in HashMap after clearing:")
    printBookMap(bookMap)
}

private fun printBookMap(bookMap: HashMap<Book, String>) {
    if (bookMap.isEmpty()) {
        println("No books in the map.")
    } else {
        bookMap.forEach { (key, value) ->
            println("Book: $key, Genre: $value")
        }
    }
}
