fun main() {
    // 변수명 : 함수유형 (매개변수) -> 반환타입
    //val triple: (Int) -> Int = { a: Int -> a * 3 }
    //단일 매개변수의 람다는 약식 방법 가능
    val triple: (Int) -> Int = {it * 3}
    println("${triple(5)}\n\n")
    
    
    val peopleNames = listOf("Fred", "Ann", "Barbara", "Joe")
    println(peopleNames.sorted())
    
    println(peopleNames.sortedWith { str1: String, str2: String -> str1.length - str2.length })
    
    println() 
    println()
    
    val words = listOf("about", "acute", "awesome", "balloon", "best", "brief", "class", "coffee", "creative")
    // b로 시작하고 대소문자 구별 없이
    var filteredWords = words.filter { it.startsWith("b", ignoreCase = true) }
    println(filteredWords)
    
    // shuffled() 사용하여 무작위로 섞기
    filteredWords = words.filter { it.startsWith("b", ignoreCase = true) }
        .shuffled()
    println(filteredWords)
    
    // take(2) 사용하여 처음 2개만 가져오기
    filteredWords = words.filter { it.startsWith("b", ignoreCase = true) }
        .shuffled()
        .take(2)
    println(filteredWords)
    
    // sorted() 사용하여 정렬하기
    filteredWords = words.filter { it.startsWith("b", ignoreCase = true) }
        .shuffled()
        .take(2)
        .sorted()
    println(filteredWords)
}