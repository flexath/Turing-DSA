import sorting.BubbleSort
import sorting.InsertionSort
import sorting.SelectionSort

fun main(args: Array<String>) {
    val itemList = intArrayOf(99,1,0, 5, 6, 3, 9, 7, 0, 10, 2, 87)
//    val selectionSort = SelectionSort()
//    val bubbleSort = BubbleSort()
    val insertionSort = InsertionSort()

    val testCases = listOf(
        intArrayOf(5, 2, 9, 1, 5, 6),
        intArrayOf(3, 7, 1, 9, 4),
        intArrayOf(1, 2, 3, 4, 5),
        intArrayOf(5, 4, 3, 2, 1),
        intArrayOf(10, 10, 10, 10, 10),
        intArrayOf(1),
        intArrayOf(),
        intArrayOf(2, 1),
        intArrayOf(1, 3, 2),
        intArrayOf(5, 2, 8, 3, 9, 1, 6)
    )

    for ((index, testCase) in testCases.withIndex()) {
        val sortedArray = insertionSort.sort(testCase.copyOf())
        println("Test Case ${index + 1}: Original array: ${testCase.joinToString()}, Sorted array: ${sortedArray.joinToString()}")
    }

}