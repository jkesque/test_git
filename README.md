# This is the first step

- Add some stuff here

- I creaated a scala function that first asks the user for their name, and then says hello. the function then asks the user's age and responds with the user's : age and name 

import scala.io.StdIn._

println("Hello. What is your name?")
val name = readLine()
println("Hello " + name + ", how old are you?")
val age = readInt()
println(name + " is " + age + " years old.")
