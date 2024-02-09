package sorting

class SelectionSort : ISortAlgorithm {

    override fun sort(arr: IntArray): IntArray {
        for (i in 0..<arr.size - 1) {
            var minIdx = i
            for (j in i + 1..<arr.size) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j
                }
            }
            val temp = arr[minIdx]
            arr[minIdx] = arr[i]
            arr[i] = temp
        }
        return arr
    }
}