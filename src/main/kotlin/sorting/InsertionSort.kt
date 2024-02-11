package sorting

class InsertionSort : ISortAlgorithm {
    override fun sort(arr: IntArray): IntArray {
        for (i in 1..<arr.size) {
            val key = arr[i]
            var j = i
            while (j > 0 && arr[j-1] > key) {
                arr[j] = arr[j - 1]
                j--
            }
            arr[j] = key
        }
        return arr
    }
}

/*
1 − If it is the first element, it is already sorted. return 1;
2 − Pick next element
3 − Compare with all elements in the sorted sub-list
4 − Shift all the elements in the sorted sub-list that is greater than the value to be sorted
5 − Insert the value
6 − Repeat until list is sorted
 */

/*
sort(arr):
    for i from 1 to arr.size - 1 do
        key ← arr[i]
        j ← i
        while j > 0 and arr[j] > key do
            arr[j] ← arr[j-1]
            j ← j - 1
        arr[j] ← key
    return arr
 */