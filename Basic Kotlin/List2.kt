open class Item(val name: String, val price: Int)

class Noodles : Item("Noodles", 10){
    override fun toString(): String{
        return name
    }
}

// 매개변수 하나만 vararg 사용가능
class Vegetables(vararg val toppings: String) : Item("Vegetables", 5){
     override fun toString(): String{
         if(toppings.isEmpty()){
             return "$name Chef's Choice"
         }else{
             return name + " " + toppings.joinToString(" | ")
             // joinToString의 인자로 구분자를 지정해줬다 | 
         }
        
     }
}

fun main() {
    val noodles = Noodles()
    val vegetables = Vegetables("Cabbage", "Sprouts", "Onion")
    val vegetables2 = Vegetables()
    
    println(noodles)
    println(vegetables)
    println(vegetables2)
}