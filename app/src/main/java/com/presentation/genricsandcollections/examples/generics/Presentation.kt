package com.presentation.genricsandcollections.examples.generics

import com.presentation.genricsandcollections.examples.manager.BookManager
import com.presentation.genricsandcollections.examples.model.Book

class Presentation<T>(private var value: T) {
    fun show(){
        println("Presentation of value: $value")
    }

    fun update(value: T){
        this.value = value
        println("Updated Value: $value")
    }

    fun getValue(): T {
        return value
    }
}

fun main(){
//    Using Presentation class with different types

//    Using Presentation with Int
    val intPresentation = Presentation(100)
    intPresentation.show()
    intPresentation.update(500)

//    Using Presentation with Book
    val bookPresentation = Presentation(BookManager.getBookList().first())
    bookPresentation.show()
    bookPresentation.update(BookManager.getBookList().last())
}