package binary_search

interface ISearchAlgorithm {
    fun binarySearchWithIterative(target: Int, itemList: List<Int>): Int
    fun binarySearchWithRecursive(target: Int, itemList: List<Int>, startIndex: Int, endIndex: Int): Int
}