//1

fun main() {
  // Write your code below 💾
  var obsoleteTech=setOf("Rolodex", "Phonograph", "Videocassette recorder", "Video projector", "Rolodex"  )

  println(obsoleteTech)
  

}


//2
fun main() {
  // Write your code below 

  var islandsOfHawaii= setOf("Maui", "Lanai", "Oahu", "Kauai")
  println(islandsOfHawaii.elementAt(2))
  println(islandsOfHawaii.elementAtOrNull(6))
}


//3

fun main() {
  // Write your code below 👩‍🚀
var apolloLandingSites= mutableSetOf("Mare Tranquillitatis", "Fra Mauro", "Hadley/Apennines", "Descartes", "Taurus-Littrow", "Oceanus Procellarum")

println(apolloLandingSites)

}


//4
fun main() {

  var uniqueParticipants = mutableSetOf<String>() 
  var participants = listOf("elePHPant", "Gopher", "Lenny", "Moby Dock", "Codey", "Gopher")

  uniqueParticipants.addAll(participants)
  println("The talent show has ${uniqueParticipants.size} unique participants.")
  uniqueParticipants.clear()
  println(uniqueParticipants)

}


//5
fun main() {
  // Write your code below 📝
  var testGrades= mutableSetOf(65,50,72,80,53,84)
  var sum=testGrades.sum()
  var numStudents=testGrades.size
  var average=sum/numStudents

  if(average<65){
    println("Failed")
  }
  else{
    println("Passed")
  }
}
