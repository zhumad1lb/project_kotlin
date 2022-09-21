import java.util.*
fun swim(speed: String = "fast") {
    println("swimming $speed")
}
fun main(args: Array<String>){
    swim()   // uses default speed
    swim("slow")   // positional argument
    swim(speed="turtle-like")   // named parameter
}