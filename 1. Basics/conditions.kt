fun main(args: Array<String>) {

    var greeting = "Hello world" 

    if (greeting != null){
        println("🚀")
    }else{
        println("⚠️")
    }

   // ternary operator
    var a= if (greeting != null) "🚀" else "⚠️"

    println(a)
}