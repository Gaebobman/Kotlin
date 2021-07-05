fun main() {
    //IntRange, 시작..끝(정수의 범위를 나타냄)
    val diceRange = 1..6
    //val diceRange:IntRange = 1..6로 해석됨
    val randomNumber = diceRange.random()
    println("Random Number: ${randomNumber}")
}