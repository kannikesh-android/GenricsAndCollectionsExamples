package com.presentation.genricsandcollections.examples.manager

import com.presentation.genricsandcollections.examples.model.Book

object BookManager {
    fun getBookList(): ArrayList<Book> {
        val book1 = Book(bookId = 1, name = "Interstellar", price = 25.99)
        val book2 = Book(bookId = 2, name = "Mystery of the Space", price = 19.99)
        val book4 = Book(bookId = 3, name = "The Galactic Journey", price = 29.99)
        val book5 = Book(bookId = 4, name = "Why Color Derived From White", price = 9.99)
        val book6 = Book(bookId = 5, name = "Cat or Car", price = 0.99)

        return arrayListOf(book1, book2, book4, book5, book6)
    }
}