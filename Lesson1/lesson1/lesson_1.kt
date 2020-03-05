package lesson1.lesson1

//kotlin code gets executed only in the main()
//main() function defines where kotlin code gets executed
//the {} defines scope of your executable code
fun main(){
//    println():prints content in a new line at the end
//    print():prints content with a continuous line
    println("Hello World")
    println("Hello World")
    println("Hello World")
    print("Hello World")
    print("Hello World")
    print("Hello World")
    println()
//explicitly defining variable types
    val country:String = "Kenya"//constant
    var county = "Machakos"
    var age:Int = 23
    var gender : String
    gender = "Male"

    county = "UG"
    print(county)
    println()
    println(country)
    println(age)

//    implicitly defining variable types
    val name = "John Doe"
    var language = "kotlin"
    println(name)
    println(language)

//    Kotlin data types
//    1.Numbers
//    1.1.Intergers:non decimal numbers
    var my_age: Int=23
    println(my_age)
    my_age=my_age +10
    println(my_age)
//    1.2.Floats:numbers with decimal points
    val height=3.56f
    println(height)
//    2.Booleans: states true or false
    val isloggedin:Boolean = true
    val isloggedout:Boolean =false
    println(isloggedin)
//    3. Strings
    var length: Int =25
    var ruler:String ="Oxford"
    println("The length of the "+ruler+" ruler is "+length+" cm")
    println("The length of the $ruler ruler is $length cm")
//    4.Character:declared using single quotes
    val first_letter ='J'

//    assignment , create two variables num 1, num 2 storing 10 and 20 respectively, and calculate the sum of the two numbers
    val num_1: Int =10
    val num_2: Int =20
    val sum= num_1+num_2
    println(sum)
//    5.Arrays
// research on two method that apply on kotlin strings::!!
}
