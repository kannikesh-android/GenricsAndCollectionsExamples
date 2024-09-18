package com.presentation.genricsandcollections.examples

import com.presentation.genricsandcollections.examples.model.Book
import com.presentation.genricsandcollections.examples.utils.printDataStructure
import java.util.concurrent.ConcurrentLinkedDeque


fun main() {
    // Creating a ConcurrentLinkedDeque for Book objects (used as a queue)
    val bookQueue = ConcurrentLinkedDeque<Book>()

    // Enqueuing books onto the queue
    val book1 = Book(bookId = 1, name = "Interstellar", price = 25.99)
    val book2 = Book(bookId = 2, name = "Mystery of the Space", price = 19.99)

    bookQueue.add(book1)  // Enqueue book1 to the queue
    bookQueue.add(book2)  // Enqueue book2 to the queue

    println("Books in Queue: ")
    printDataStructure(bookQueue)  // Print the queue

    // Dequeuing a book from the queue (removes and returns the first element)
    val dequeuedBook = bookQueue.poll()  // poll() removes the first element in the queue
    println("\nDequeued Book: $dequeuedBook")

    println("\nBooks in Queue after dequeuing: ")
    printDataStructure(bookQueue)

    // Peeking a book from the queue (retrieves but doesn't remove the first element)
    val peekedBook = bookQueue.peek()  // peek() returns the first element without removing it
    println("\nPeeked Book: $peekedBook")

    println("\nBooks in Queue after peeking: ")
    printDataStructure(bookQueue)

    // Checking if the queue contains a specific book
    val isBookContains = bookQueue.contains(book1)
    println("\nQueue contains book1: $isBookContains")

    // Clearing all elements from the queue
    bookQueue.clear()
    println("\nBooks in Queue after clearing: ")
    printDataStructure(bookQueue)
}