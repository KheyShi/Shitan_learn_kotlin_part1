//1
fun main() {
  // Write your code below 🏞
 var codeysMap = mapOf("valley" to "scorpions", "creek" to "snakes", "forest" to "bears")
  println(codeysMap)
  
}


//2
fun main() {
  var uniqueTransport = mapOf("India" to "Tuktuk", "Egypt" to "Felucca", "Peru" to "Totora Boat", "Hong Kong" to "Junk Boat")

  // Write your code below 🚜
  println("A unique mode of transportation that exists in Peru is ${uniqueTransport["Peru"]}.")
  println(uniqueTransport.keys)
  println(uniqueTransport.values)
}


//3

fun main() {
  // Write your code below 📺
var tvShows= mutableMapOf("The Big Bang Theory" to 278, "Modern Family" to 250, "Bewitched" to 254, "That '70s Show" to 200)
tvShows["The Big Bang Theory"]=279
println(tvShows)
}


//4

fun main() {
  // Write your code below 🖼

  var momaPaintings = mutableMapOf("Les Demoiselles d'avignon" to "Pablo Picasso", "The Starry Night" to "Vincent Van Gogh", "Mona Lisa" to "Leonardo Da Vinci", "The Persistance of Memory" to "Salvador Dali")

  if (!momaPaintings.containsValue("Claude Monet")) {
    // Write your code for Step 1 here 
    momaPaintings.put("Water Lillies", "Claude Monet")
 
  }
    // Write your code for Step 2 here
    momaPaintings.remove("Mona Lisa")
    println(momaPaintings)
  
}
