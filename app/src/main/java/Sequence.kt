import com.presentation.genricsandcollections.examples.generics.Presentation

fun main() {

//    Using asSequence
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    val numberSequence = numberList.asSequence()

//    sequenceOf
    val sequence = sequenceOf(1, 2, 3, 4, 5, 6)

//    Generate Infinite sequences
    val infiniteSequence = generateSequence(1) { it + 1 }


//    Using Sequence Constructor
    val customSequence = sequence {
        yield(1)
        yield(2)
        yield(3)
    }

//    List Processing (Eager Evaluation)
    val result = numberList.map { it * 2 }.filter { it > 4 }
//    println(result)

//    Sequence Processing (Lazy Evaluation)
    val sequenceResult = numberSequence.asSequence().map { it * 2 }.filter { it > 4 }.toList()
//    println(sequenceResult)

//    Intermediate Operations (Lazy):
//    These operations return a new sequence and are lazy (they don’t execute immediately):
//
//    toList()
//    toSet()
//    first()
//    last()
//    sum()
//    take()


    val words = "The quick brown fox jumps over the lazy dog".split(" ")
//convert the List to a Sequence
    val wordsSequence = words.asSequence()

    val lengthsSequence = wordsSequence.filter { println("filter: $it"); it.length > 3 }
        .map { println("map length: ${it.length}"); it.length }
        .take(4)

    println("Lengths of first 4 words longer than 3 chars")
// terminal operation: obtaining the result as a List
    println(lengthsSequence.toList())

}