fun main() {
    fun part1(input: List<String>): Int {
        var max = 0
        var sum = 0
        input.forEach {
            if (it == "") {
                max = if (sum > max) sum else max
                sum = 0
            } else {
                sum += it.toInt()
            }
        }
        return max
    }

    fun part2(input: List<String>): Int {
        val items = mutableListOf<Int>()
        var sum = 0

        input.forEach {
            if (it == "") {
                items.add(sum)
                sum = 0
            } else {
                sum += it.toInt()
            }
        }

        println(items)

        items.sort()
        items.reverse()

        println(items)

        return (items[0] + items[1] + items[2])
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01_test")
    check(part1(testInput) == 24000)
    check(part2(testInput) == 45000)

    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}
