import java.text.DecimalFormat

//// extensions
//
fun String.numVowels() : Int{
    var count =0
    for (i in indices){
        when(this[i]){
            'a','e','o','u','i' -> count++
        }
    }
    return count
}

class Circle(var radius:Double){
    fun getArea():Double{
        return Math.PI * radius *radius
    }

}

fun Circle.getPer():Double{
    return 2 * Math.PI *radius
}

// fun Class.fName(){}


fun main() {
//    var str = "alij".numVowels()
    var circle = Circle(8.0)
    println(circle.getPer())

}

// some extension function examples

// remove white spaces function
fun String.removeSpaces() = replace(" ", "")

// round float function
fun Float.roundOff(): String {
    val df = DecimalFormat("##.##")
    return df.format(this)
}

// swap items in mutable list function
fun MutableList<Int>?.swap(first: Int, second: Int): Any{

    if (this == null) return "null" //Checked the null-ability here!

    else{
        val temp = this[first]
        this[first] = this[second]
        this[second] = temp
        return this
    }
}
