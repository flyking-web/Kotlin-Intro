package operators

//Arithmetic operators
//(+, -, *, /, %)
fun main() {
    var sum: Int // declare empty variable
    var height: Int = 12
    val width: Int = 21
    sum = height + width // additional operation
    println(sum)
//comparison operators
//(<,>,<=,>=,!=,==)// Return lvalue is always boolean( true or false)
    val isEqual: Boolean = height== width
    println(isEqual)
    if(height > width){
        println("$height is > than $width")
    }else{
        println("$height is < than $width")
    }
//    fun sum(num1:Int,num2:Int){
//        val num1:Int=12
//        val num2:Int=10
//        sum=num1+num2
//        println(sum)
//    }
//Assignment operators
//(+=, -=, *=, /=, %=)
val newHeight:Int =23;
height += newHeight
    println("Total height is $height")
}