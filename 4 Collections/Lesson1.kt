//1
fun main() {
  // Write your code below 🏊‍♀️
  var waterSports = listOf("Wind Surfing", "Sailing", "Swimming", "Jet Skiing", "Water Skiing")

  println(waterSports)


}


//2
fun main() {
  // Write your code below 🏃‍♀️
  var unitedStatesMarathons=listOf ("Boston Marathon", "Bank of America Chicago Marathon", "TCS NYC Marathon", "Marine Corps Marathon")
  println(unitedStatesMarathons[1])
}


//3


fun main() {
  // Write your code below 🎭

  var openBroadwayShows= mutableListOf("The Lion King", "Chicago", "The Cher Show",  "Les Miserables")

  openBroadwayShows[2]= "Wicked"
  println(openBroadwayShows)
}


//4

fun main() {
  // Write your code below 🍎
  var fruitTrees= mutableListOf("Apple","Plum","Pear","Cherry")
  println("I am growing ${fruitTrees.size} different types of fruit in my garden.")

}


//5
fun main() {

  val planets = mutableListOf("Mercury", "Venus", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto")

  // Write your code below 🪐
  planets.remove("Pluto")
  planets.add("Earth")
  println(planets.random())
  
}
