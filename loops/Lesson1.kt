package loops

//for loop
//syntax
fun main(args: Array<String>) {
//    incrementing by 2
    for (i in 0..5 step 2){
        if (i == 4){
            println("$i is equals to 4")
        }else{
            println("$i is not equal to 4")
            println(i)
        }
    }
//    printing in a reverse order

    for ( i in 20 downTo 1){
        println(i)
    }
    var a = 0
    while(a < 10){
        println(a)
        a++
    }
    var b = 1
    do{
        println(b)
        b++
    }while (b < 10)
//    assignment : FIZZBUZZ
    var x:Int = 0
    for(x in 0..100 step 1){
        if(x % 15 ==0){
            println("$x if fizzbuzz")
        }else if(x % 3==0){
            println("$x if fizz")
        }else if(x % 5==0){
            println("$x is buzz")
        }
    }
//    Arrays
//    functions
}