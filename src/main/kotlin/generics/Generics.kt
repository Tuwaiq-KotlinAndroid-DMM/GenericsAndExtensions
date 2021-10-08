package generics//**** Generics ****//

/******
 Generics are the powerful features that allow us to define classes, methods and properties which
 are accessible using different data types while keeping a check of the compile-time type safety.

 /*** Advanteges of using generics ***/
 1. Type-safety: Generic allows to hold only single type of object.
 Generic does not allow to store other object.
 2. Type casting is not required: There is no need to typecast the object.
 3. Compile time checking: Generics code is checked at compile time so that it can avoid any problems at runtime.

 *******/

// Generic classes
//////   normal way  ////////////////////////
//class Person(_age: Int) {
//    var age: Int = _age
//
//    init {
//        this.age = age
//        println(age)
//    }
//
//
//}
//
//fun main(args: Array<String>) {
//    var ageInt: Person = Person(30)
//    var ageString: Person = Person("40") // error
//
//}

///// generic way /////////////////////////////
//class Person<T>(age: T) {
//    var age: T = age
//
//    init {
//        this.age = age
//        println(age)
//    }
//}
//
//fun main(args: Array<String>) {
//    var ageInt: Person<Int> = Person<Int>(30)
//    var ageString: Person<String> = Person<String>("40")
//}
/////////////////////////////////////////////////

///////////* Generic function */////////////////

///// normal function ////
fun printInt(list: List<Int>) {
    for (el in list) {
        println(el)
    }
}

// Generic function ////
fun <T> printValue(list: List<T>) {
    for (el in list) {
        println(el)
    }

}
fun main() {
    var lstInt = listOf(2,5,7,8)
    var lst = listOf<String>("Sam", "Ali")
    var floatList = listOf(10.5f, 5.0f, 25.5f)
    // print normal
    printInt(lstInt)

    // print generics
    printValue(lst)
    printValue(floatList)
    printValue(lstInt)
}
/////////////////////////////////////////////////