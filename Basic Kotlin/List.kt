fun main() {
    val numbers: List<Int> = listOf(1, 2, 3, 4, 5, 6)
    //또는 자료형 추론
    //val numbers =listOf(1, 2, 3, 4, 5, 6) 
    println("List: $numbers")
    println("Size: ${numbers.size}")
    
    println("First element: ${numbers[0]}")
    println("Second element: ${numbers[1]}")
    
    println("Last index: ${numbers.size - 1}")
    println("Last element: ${numbers[numbers.size - 1]}")
    
    println("First: ${numbers.first()}")
    println("Last: ${numbers.last()}")
    
    println("Contains 4? ${numbers.contains(4)}")
    println("Contains 7? ${numbers.contains(7)}")
    println("\n===========\n")
    val colors = listOf("green", "orange", "blue")

//     컴파일 오류: List는 Update 불가
//     colors.add("purple")
//     colors[0] = "yellow"
	println("Reversed list: ${colors.reversed()}")
    println("List: $colors")
    println("Sorted list: ${colors.sorted()}")
    
    val oddNumbers = listOf(5, 3, 7, 1)
	println("List: $oddNumbers")
	println("Sorted list: ${oddNumbers.sorted()}")
    println("\n===========")
    println("===========\n")
    
	val entrees = mutableListOf<String>()
    // 또는 
    // val entrees: MutableList<String> = mutableListOf()
    println("Entrees: $entrees")
	println("Add noodles: ${entrees.add("noodles")}")
    println("Entrees: $entrees")
    
    println("Add spaghetti: ${entrees.add("spaghetti")}")
	println("Entrees: $entrees")
    
    println("\nmutableList에 List를  삽입")
    
    val moreItems = listOf("ravioli", "lasagna", "fettuccine")
    
    println("Add list: ${entrees.addAll(moreItems)}")
    println("Entrees: $entrees")
    println("\n삭제연산")
    println("\nRemove spaghetti: ${entrees.remove("spaghetti")}")
	println("Entrees: $entrees")
    
    println("Remove item that doesn't exist: ${entrees.remove("rice")}")
	println("Entrees: $entrees")
    println("\nRemove first element: ${entrees.removeAt(0)}")
	println("Entrees: $entrees\n")
    
    println("entrees.clear()")
    entrees.clear()
	println("Entrees: $entrees")
    println("Empty? ${entrees.isEmpty()}")
    
    println("\n===========")
    println("===========\n")
    
    val guestPerFamily = listOf(2, 4, 1, 3)
    var totalGuests = 0
    var index = 0
    while(index < guestPerFamily.size){
        totalGuests += guestPerFamily[index]
        index++
    }
    println("Total Guest Count: $totalGuests\n")
    
    // 또는 For in Loop 사용하면됨 아래는 For in Loop
    
    val names = listOf("Jessica", "Henry", "Alicia", "Jose")
    
    for(name in names){
        println("$name - Number of characters: ${name.length}")
    }
    
    println("\n===========")
    println("===========\n")
    
    
}