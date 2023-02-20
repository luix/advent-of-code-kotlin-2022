package week1

class ContainsDuplicate {
    // This will solve in O(n log n) time | O(1) space
    fun containsDuplicate(nums: List<Int>): Boolean {
        val sorted = nums.sorted()
        for (i in 1 until sorted.size) {
            if (sorted[i - 1] == sorted[i]) return true
        }
        return false
    }
}

fun main() {
    val solution = ContainsDuplicate()

    val tests = listOf(
        listOf(1, 2, 3, 4),
        listOf(1, 2, 3, 1),
        listOf(),
        listOf(1, 1, 1, 1)
    )

    tests.forEach {
        assert(solution.containsDuplicate(it))
        println("$it contains duplicate: ${solution.containsDuplicate(it)}")
    }
}




