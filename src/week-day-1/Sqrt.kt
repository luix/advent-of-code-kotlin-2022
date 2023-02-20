package week1

import kotlin.math.sqrt

/**
 * Sqrt (easy)
 * Problem Statement
 * Given a non-negative integer x, return the square root of x rounded
 * down to the nearest integer. The returned integer should be non-negative as well.
 *
 * You must not use any built-in exponent function or operator.
 *
 * For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
 *
 * Example 1:
 *
 * Input: x = 8
 * Output: 2
 * Explanation: The square root of 8 is 2.8284, and since we need to
 * return the floor of the square root (integer), hence we returned 2.
 * Example 2:
 *
 * Input: x = 4
 * Output: 2
 * Explanation: The square root of 4 is 2.
 * Example 3:
 *
 * Input: x = 2
 * Output: 1
 * Explanation: The square root of 2 is 1.414, and since we need to return
 * the floor of the square root (integer), hence we returned 1.
 */


/*
  public int mySqrt(int x) {
    if (x < 2)
      return x; // return x if it is 0 or 1

    int left = 2, right = x / 2; // initialize left and right pointers
    int pivot;
    long num; // use long to store result of pivot * pivot to prevent overflow
    while (left <= right) { // binary search for the square root
      pivot = left + (right - left) / 2; // find the middle element
      num = (long) pivot * pivot;
      if (num > x)
        right = pivot - 1; // if pivot * pivot is greater than x, set right to pivot - 1
      else if (num < x)
        left = pivot + 1; // if pivot * pivot is less than x, set left to pivot + 1
      else
        return pivot; // if pivot * pivot is equal to x, return pivot
    }

    return right; // return right after the loop
  }
 */
class Sqrt {
    fun sqrt(x: Int): Int {
        if (x < 2) return x

        var left = 2
        var right = x / 2
        var pivot: Int
        // use Double to store result of pivot * pivot to prevent overflow
        var num: Double
        while (left <= right) { // binary search for the square root
            pivot = left + (right - left) / 2  // find the middle element
            num = (pivot * pivot).toDouble()
            if (num > x) {
                // if pivot * pivot is greater than x, set right to pivot - 1
                right = pivot - 1
            } else if (num < x) {
                // if pivot * pivot is less than x, set left to pivot + 1
                left = pivot + 1
            } else {
                // if pivot * pivot is equal to x, return pivot
                return pivot
            }
        }
        // return right after the loop
        return right
    }
}

fun main() {
    val solution = Sqrt()
    val tests = listOf(8, 4, 2, 3, 15, 16, 32, 64, 128, 256, 512, 1024, 4096)

    tests.forEach {
//        assert(solution.sqrt(it) == sqrt(it.toDouble()).toInt())
        println("The square root of $it is: ${solution.sqrt(it)}")
    }
}
