//# Functional Programming
//
//3 categories of operation:
//* transforms - alter data
//* filters - exclude data
//* combines - merge data


///// * transforms - alter data */////
//fun main() {
//    val animals = listOf("zebra", "elephent", "rat")
//    val babies = animals
//        .map { animal -> "A baby $animal" }
//    println(animals)
//    println(babies)

//    var newList = listOf(listOf(1,2,3), listOf(4,5,6)).flatMap { it }
//    println(newList)
//}

//* filters - exclude data
//fun main() {
//    val itemOfColors = listOf(
//        listOf("red apple","green apple"),
//        listOf("red car","blue car"),
//        listOf("yellow cup","blue cup"),
//    )
//    val redItems = itemOfColors.flatMap { colorList ->
//            colorList.filter { color ->
//                color.contains("red")
//            }
//
//    }
//    println(redItems)
//}


//* combines - merge data
fun main() {
    /// .zip ///
    val employees = listOf("jack", "sam", "sara") // keys
    val salary = listOf(1000, 4000, 2400) // values
    val empSalaries = employees.zip(salary).toMap()
    println(empSalaries)


    /// .fold ///
    // fold() is a useful method to quickly do any operation on all elements of a list or map.
    // This method comes in handy if you don’t want to use loop for iterating the elements.
    var total = listOf(1, 2, 3).fold(0) { sum, element -> sum + element }
    println("Total value: $total")
}









