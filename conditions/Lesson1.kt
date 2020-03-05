package conditions

fun main(args: Array<String>) {
    val x: Int = 3
    val y: Int = 5
//1. if
    if (x < y) {
        println("$x is less than $y")
    }
//2.if...else..
    if (x > y) {
        println("$x is greater than $y")
    } else {
        println("$x is less than $y")
    }
//3.if...elseif...else
    if (x > y) {
        println("$x is greater than $y")
    } else if (y >= 5) {
        println("$y is less than or equal to 5")
    } else {
        println("Closing the program")
    }
//if statement is an expression
    val results = if (x == 3) {
        println("$x is equals to 3")
    } else if (y >= 5) {
        println("$y is less than or equal to 5")
    } else {
        println("Closing the program")
    }
    println(results)
//when statement
//    when (state) {
//        state1 -> println("Hello world")
//        state1 -> println("Hello world")
//        state1 -> println("Hello world")
//        state1 -> println("Hello world")
//    }
//    println("Enter your age : ")
//    val myAge :String = readLine()!!//ask the yser to enter data
//    val age:Int =17
//    var age_as_int:Int = myAge.toInt()
//    when(age_as_int){
//        12 -> println("Joined class 6")
//        13 -> println("Joined class 7")
//        14 -> println("Joined class 8")
//        15 -> println("Joined class Form one")
//        17 -> println("GETTING AN ID SOON")
//    }
//    println("Enter your age: ")
//    val mwaka:String = readLine()!!
//    val mwaka_kama_int: Int = mwaka.toInt()
//    mwaka_kama_int
//    when(mwaka_kama_int){
//        (mwaka_kama_int % 2 == 0)
//         0-> println("Even")
//         1-> println("Odd")
//    }
    println("Enter your age: ")
    val mwika:String = readLine()!!
    val mwika_kama_int: Int = mwika.toInt()
    val mymodulus=mwika_kama_int%2
    when(mymodulus){
        0 -> println("Even")
        1 -> println("Odd")
    }
}