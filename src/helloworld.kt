import java.util.*
fun feedTheFish() {
     val day = randomDay()
     val food = fishFood(day)

     println ("Today is $day and the fish eat $food")
 }
 fun fishFood (day : String) : String {
     val food : String
     when (day) {
         "Monday" -> food = "flakes"
         "Wednesday" -> food = "redworms"
         "Thursday" -> food = "granules"
         "Friday" -> food = "mosquitoes"
         "Sunday" -> food = "plankton"
         else -> food = "nothing"
     }
     return food
 }
 fun main(args: Array<String>) {
     feedTheFish()
 }
 fun randomDay(): String {
     var week = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday",
         "Friday", "Saturday", "Sunday")
     return week[java.util.Random().nextInt(week.size)]
 }