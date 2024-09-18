package com.presentation.genricsandcollections.examples

import com.presentation.genricsandcollections.examples.model.Book
import com.presentation.genricsandcollections.examples.utils.printDataStructure
import java.util.LinkedList

/*
* addAll()
* addFirst()
* addLast()
* removeAll()
* removeFirst()
* removeLast()
* peekFirst()
* peekLast()
* retainAll()
* */

fun main() {
    val bookLinkedList = LinkedList<Book>()

// Pushing books onto the LinkedList
    val book1 = Book(bookId = 1, name = "Interstellar", price = 25.99)
    val book2 = Book(bookId = 2, name = "Mystery of the Space", price = 19.99)

    bookLinkedList.push(book1)
    bookLinkedList.push(book2)

//    println(listOf(1, 2, 3, 4, 5).reduce { acc, i ->
//        println(i)
//        acc + i
//    })

    println("Books in LinkedList: ")
    printDataStructure(bookLinkedList)

//    Popping a book from LinkedList
    val poppedBook = bookLinkedList.pop()
    println("\nPopped Book: $poppedBook")

    println("\nBooks in LinkedList after popping: ")
    printDataStructure(bookLinkedList)

//    Peek
    val peekedBook = bookLinkedList.peek()
    println("\nPeeked Book: $peekedBook")

    println("\nBooks in LinkedList after peeking: ")
    printDataStructure(bookLinkedList)


//    Checking if the LinkedList contains a specific book
    val isBookContains = bookLinkedList.contains(book1)
    println("\nLinkedList contains book1: $isBookContains")


//    Clearing all elements from the LinkedList
    bookLinkedList.clear()

    println("\nBooks in LinkedList after clearing: ")
    printDataStructure(bookLinkedList)
}