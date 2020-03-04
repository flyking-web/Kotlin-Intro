package Lesson1.lesson1
//Kotlin code gets executed/run only when in the main()
//main() function defines where kotlin code gets executed
//the {} defines the scope of your executable code
fun main() {
//    println() : prints content in a new line at the end
//    print() : prints content with a continuous code
    println("Hello World")
    println("Craig Kinyanjui")
    print("hello world ")
    print("hello world ")
    print("hello world ")
    println()
//    Explicitly defining a variable types
    val country:String = "Kenya"//CONSTANT
    var county:String ="Machakos"
    var age:Int =23
    var gender : String
    gender = "male"

    county = "UG"
    println(country)
    println(county)
    println(age)


//    Implicitly defining variable types
    val name = "John Doe"
    var language = "Kotlin"
    println(name)
    println(language)

//  kotlin datatypes
//  1.Numbers
//    1.1 Intergers: Non decimal numbers
        var my_age:Int =23
            println(my_age)
            my_age =my_age + 10
            println(my_age)
//    1.2 Floats:decimal numbers
        var height = 3.56F
        println(height)

//  2.Booleans:State true or false
        var isloggedin:Boolean = true
        var isloggedout:Boolean = false

//  3.Strings
    var length:Int = 25
    var ruler:String ="Oxford "

    println("The length of the " +ruler+ "ruler is "+length+ "cm ")
    println("The length of the $ruler ruler is $length cm ")
    println("")
//  4.Characters:declared using single quotes
        val first_letter = 'J'

//    Assignment, create two variables num1 and num2 storing 10 and 20 respectively and calculate the sum of the two numbers
        val num1:Int =10
        val num2:Int =20
        val sum:Int = num1 + num2
        println(sum)
//  5.Arrays


}