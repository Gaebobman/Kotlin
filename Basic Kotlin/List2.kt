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

class Order(val orderNumber: Int){
    private val itemList = mutableListOf<Item>()
    
    fun addItem(newItem: Item): Order{
        itemList.add(newItem)
        return this
	}
    
    fun addAll(newItems : List<Item>): Order{
        itemList.addAll(newItems)
        return this
    }
    
    fun print(){
        println("Order #${orderNumber}")
        var total = 0
        for(item in itemList){
            println("${item}: $${item.price}")
            total += item.price
        }
        println("Total: $${total}")
	}
}

fun main() {
   val orderList = mutableListOf<Order>()
   	
   val order1 = Order(1)
   order1.addItem(Noodles())
   orderList.add(order1)
   
   println()
   
   val order2 = Order(2)
   order2.addItem(Noodles())
   order2.addItem(Vegetables())
   orderList.add(order2)
   
   println()
   
   val order3 = Order(3)
   val items = listOf(Noodles(), Vegetables("Carrot", "Beans", "Celery"))
   order3.addAll(items)
   orderList.add(order3)
   
   //Builder Pattern 1
   val order4 = Order(4).addItem(Noodles()).addItem(Vegetables("Cabbage", "Onion"))
   orderList.add(order4)
   
   //Builder Pattern 2 그러나 변수에 저장없이 생성 후 orderList에 바로 저장
   
   orderList.add(
   		Order(5)
        	.addItem(Noodles())
            .addItem(Noodles())
            .addItem(Vegetables("Spinach"))
   )
   
   
    for (order in orderList) {
        order.print()
        println()
    }
   
  
   
}