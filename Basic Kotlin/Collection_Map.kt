fun main(){
    val peopleAges = mutableMapOf<String, Int>(
    	"Fred" to 30,
    	"Ann" to 23)
    //put Method 사용
    peopleAges.put("Barbara", 42)
    
    // 약식 표기법 Map[Key] = Value
    peopleAges["Joe"] = 51
    // 이미 존재하는 key의 value 업데이트
    peopleAges["Fred"] = 31
    
    peopleAges.forEach{ print("${it.key} is ${it.value}, ")}
    println()
    // map 함수를 이용하여 , 로 결합 및 출력
    println(peopleAges.map { "${it.key} is ${it.value}" }.joinToString(", ") )
    println()
    // filter() 함수 사용
    
    val filteredNames = peopleAges.filter { it.key.length < 4}
    //맵에 필터를 적용하면 LinkedHashMap으로 반환됨
    println(filteredNames)
    
    
}