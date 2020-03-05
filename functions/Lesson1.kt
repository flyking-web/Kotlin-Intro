package functions

//a block of that has a specific task e.g println()
// fun nameOfFunction(){
//code to execute
//}
fun greetings1(){
    println("Hello World")
}
fun greetings2( name:String){
    println("Hello $name")
}
fun greetings3(name:String,age:Int){
    println("Hi I am $name , am $age years old")
}


//when you call a function 1. one can take an argument and another cannot do that
// so there is an argument and a parameter
// Argument: that which is placed katikati ya function when calling a function
// Parameter: that which is placed katikati ya function when introducing a function.
fun main(args:Array<String>) {
//    to call a function use greetings1()
//    must be in the main function
    greetings1()
    println("Hello once again")
    greetings3(name = "John", age = 11)

    fun sum(num1: Int, num2: Int) {
        var sum = num1 + num2
        println(sum)
    }
    sum(num1 = 10,num2 = 12)
//    functions which takes a number if it is odd or even
    fun oddeven(num:Int){
    if(num%2==0){
        println("even")
    }else if(num%2==1){
        println("odd")
    }
}
    oddeven(num = 14)
}