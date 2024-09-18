package com.presentation.genricsandcollections.examples.generics

import com.presentation.genricsandcollections.examples.manager.BookManager

fun main() {
//    createConcurrentModificationException()
//    concurrentModificationExceptionFix()
}

fun createConcurrentModificationException() {
    val books = BookManager.getBookList()

    // This will throw ConcurrentModificationException
    for (item in books) {
        if (item.bookId == 3) {
            books.remove(item) // Structural modification during iteration
        }
    }
}

fun concurrentModificationExceptionFix() {
    val myList = BookManager.getBookList()
    val iterator = myList.iterator()

    while (iterator.hasNext()) {
        if (iterator.next().bookId == 3) {
            iterator.remove() // Safe removal using the iterator
        }
    }

    println(myList)
}