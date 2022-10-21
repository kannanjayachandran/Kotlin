fun main(args: Array<String>) {
    
    // we can create variables using 'var'

    var name: String = "Ben Tennyson"
    var watchName = "Omnitrix"

    // we can use 'val' to create immutable variables
    val job = "Hero" 
    var age = 10
    
    println("Name is "+ name + " with the watch "+ watchName)
    println("Job is " + job + " Age is " + age)

    // we can add a '?' to explicity create a null value
    var home: String? = null 
    
    println("Value of null: " + home)  
}