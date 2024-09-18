package com.presentation.genricsandcollections.examples

import com.presentation.genricsandcollections.examples.manager.BookManager

fun main(){
    val bookList = BookManager.getBookList()
    val bookIterator = bookList.iterator()

    while (bookIterator.hasNext()){
        val book = bookIterator.next()
        println(book)
    }
}