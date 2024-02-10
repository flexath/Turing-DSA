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


/*
1. Set MIN to location 0.
2. Search the minimum element in the list.
3. Swap with value at location MIN.
4. Increment MIN to point to next element.
5. Repeat until the list is sorted.
 */

/*
sort(arr):
    for i from 0 to arr.size - 2 do
        minIdx ← i
        for j from i + 1 to arr.size - 1 do
            if arr[j] < arr[minIdx] then
                minIdx ← j
        temp ← arr[minIdx]
        arr[minIdx] ← arr[i]
        arr[i] ← temp
    return arr
 */