package week1

/**
 * Contains Duplicate (easy)
 * Problem Statement
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 *
 * Example 1:
 *
 * Input: nums= [1, 2, 3, 4]
 * Output: false
 * Explanation: There are no duplicates in the given array.
 * Example 2:
 *
 * Input: nums= [1, 2, 3, 1]
 * Output: true
 * Explanation: '1' is repeating.
 *
 */
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




