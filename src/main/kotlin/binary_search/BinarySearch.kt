package binary_search

class BinarySearch : ISearchAlgorithm {

    override fun binarySearchWithIterative(target: Int, itemList: List<Int>): Int {
        var startIndex = 0
        var endIndex = itemList.lastIndex
        while (startIndex <= endIndex) {
            val middle = startIndex + (endIndex - startIndex) / 2
            if (target == itemList[middle]) {
                return middle
            } else if (target < itemList[middle]) {
                endIndex = middle - 1
            } else {
                startIndex = middle + 1
            }
        }
        return -1
    }

    override fun binarySearchWithRecursive(target: Int, itemList: List<Int>, startIndex: Int, endIndex: Int): Int {

        if(startIndex > endIndex) {
            return -1
        }

        val middle = startIndex + (endIndex - startIndex) / 2

        return if (target == itemList[middle]) {
            middle
        } else if (target < itemList[middle]) {
            binarySearchWithRecursive(target, itemList, startIndex, middle - 1)
        } else {
            binarySearchWithRecursive(target, itemList, middle + 1, endIndex)
        }
    }
}