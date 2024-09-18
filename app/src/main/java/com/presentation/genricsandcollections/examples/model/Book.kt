package com.presentation.genricsandcollections.examples.model

    data class Book(
        var bookId: Int,
        var name: String,
        var price: Double,
    ){
        override fun equals(other: Any?): Boolean {
            if (this === other) return true // Reference Equality
            if (javaClass != other?.javaClass) return false

            other as Book    // Type Equality

            if (bookId != other.bookId) return false
            if (name != other.name) return false
            if (price != other.price) return false

            return true
        }

        override fun hashCode(): Int {
            var result = bookId
            result = 31 * result + name.hashCode()
            result = 31 * result + price.hashCode()
            return result
        }
    }
