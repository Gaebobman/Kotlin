fun main(){
    val squareCabin = SquareCabin(6)
    with(squareCabin){
    println("\nSquare Cabin \n============")
    println("Capacity: ${capacity}")
    println("Material: ${buildingMaterial}")
    println("Has room? ${hasRoom()}")        
    }
    
    val roundHut = RoundHut(3)
    with(roundHut){
    println("\nRound Hut \n============")
    println("Capacity: ${capacity}")
    println("Material: ${buildingMaterial}")
    println("Has room? ${hasRoom()}")        
    }

    val roundTower = RoundTower(4)
    with(roundTower){
    println("\nRound Tower \n============")
    println("Capacity: ${capacity}")
    println("Material: ${buildingMaterial}")
    println("Has room? ${hasRoom()}")        
    }

    
}

abstract class Dwelling(private var residents : Int){

   abstract val buildingMaterial : String
   abstract val capacity : Int

   fun hasRoom() : Boolean {
       return residents < capacity
   }
}

// class SquareCabin constructor(residents : Int) 와 같음
class SquareCabin (residents : Int): Dwelling(residents){
    override val buildingMaterial = "Wood"
    override val capacity = 6
}

open class RoundHut(residents : Int) : Dwelling(residents){
	override val buildingMaterial = "Straw"
    override val capacity = 4
}

class RoundTower(
    residents: Int,
	val floors: Int = 2) : RoundHut(residents){
	override val buildingMaterial = "Stone"
    override val capacity = 4 * floors
}