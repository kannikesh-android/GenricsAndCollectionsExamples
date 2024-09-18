package com.presentation.genricsandcollections.examples

import com.presentation.genricsandcollections.examples.model.Book
import com.presentation.genricsandcollections.examples.utils.printDataStructure

fun main() {
    val bookSet = HashSet<Book>()

    // Adding books to the HashSet
    val book1 = Book(bookId = 1, name = "Interstellar", price = 25.99)
    val book2 = Book(bookId = 2, name = "Mystery of the Space", price = 19.99)
    val book3 = Book(bookId = 3, name = "Why Color Derived From White", price = 9.99)
    val book4 = Book(bookId = 4, name = "Cat or Car", price = 0.99)

    bookSet.add(book1)
    bookSet.add(book2)
    bookSet.add(book3)
    bookSet.add(book4)

    println("Books in HashSet: ")
    printDataStructure(bookSet)

    // Adding duplicate book (won't be added since HashSet doesn't allow duplicates)
    val duplicateBook = book1.copy()
    bookSet.add(duplicateBook)
    println("\nAfter attempting to add a duplicate book: ")
    printDataStructure(bookSet)

    // Removing a book from the HashSet
    bookSet.remove(book2)
    println("\nBooks in HashSet after removing a book: ")
    printDataStructure(bookSet)

    // Checking if the HashSet contains a specific book
    val isBookInSet = bookSet.contains(book1)
    println("\nHashSet contains book1: $isBookInSet")


    // Clearing all elements from the HashSet
    bookSet.clear()
    println("\nBooks in HashSet after clearing: ")
    printDataStructure(bookSet)
}