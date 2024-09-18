package com.presentation.genricsandcollections.examples

import com.presentation.genricsandcollections.examples.model.Book
import com.presentation.genricsandcollections.examples.utils.printDataStructure
import java.util.Stack

fun main() {
    val bookStack = Stack<Book>()

// Pushing books onto the LinkedList
    val book1 = Book(bookId = 1, name = "Interstellar", price = 25.99)
    val book2 = Book(bookId = 2, name = "Mystery of the Space", price = 19.99)

    bookStack.push(book1)
    bookStack.push(book2)

    println("Books in Stack: ")
    printDataStructure(bookStack)

//    Popping a book from Stack
    val poppedBook = bookStack.pop()
    println("\nPopped Book: $poppedBook")

    println("\nBooks in Stack after popping: ")
    printDataStructure(bookStack)

//    Peek
    val peekedBook = bookStack.peek()
    println("\nPeeked Book: $peekedBook")

    println("\nBooks in Stack after peeking: ")
    printDataStructure(bookStack)

//    Checking if the Stack contains a specific book
    val isBookContains = bookStack.contains(book1)
    println("\nStack contains book1: $isBookContains")


//    Clearing all elements from the Stack
    bookStack.clear()

    println("\nBooks in Stack after clearing: ")
    printDataStructure(bookStack)
}