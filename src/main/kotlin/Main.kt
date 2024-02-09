import binary_search.BinarySearch
import sorting.SelectionSort


fun main(args: Array<String>) {
    val itemList = intArrayOf(1, 5, 6, 3, 9, 7, 0)
    val newList = SelectionSort().sort(itemList)

    println("Result: ${newList.toList()}")
}