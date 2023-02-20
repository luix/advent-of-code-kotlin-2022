package week1

class Pangram {

    private val alphabet = "abcdefghijklmnopqrstuvwxyz"
    fun isPangram(string: String): Boolean {
        val set = alphabet.toHashSet()
        string.lowercase().forEach {
            set.remove(it)
        }
        return set.isEmpty()
    }
}

fun main() {
    val solution = Pangram()

    val tests = listOf(
        "TheQuickBrownFoxJumpsOverTheLazyDog",
        "This is not a pangram"
    )

    tests.forEach {
        assert(solution.isPangram(it))
        println("$it is pangram: ${solution.isPangram(it)}")
    }
}
