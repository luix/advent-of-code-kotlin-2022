package week1

/**
 * Pangram (easy)
 * Problem Statement
 * A pangram is a sentence where every letter of the English alphabet
 * appears at least once.
 *
 * Given a string sentence containing English letters (lower or upper-case),
 * return true if sentence is a pangram, or false otherwise.
 *
 * Note: The given sentence might contain other characters like digits or spaces,
 * your solution should handle these too.
 *
 * Example 1:
 *
 * Input: sentence = "TheQuickBrownFoxJumpsOverTheLazyDog"
 * Output: true
 * Explanation: The sentence contains at least one occurrence of every letter of
 * the English alphabet either in lower or upper case.
 * Example 2:
 *
 * Input: sentence = "This is not a pangram"
 * Output: false
 * Explanation: The sentence doesn't contain at least one occurrence of every
 * letter of the English alphabet.
 */
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
