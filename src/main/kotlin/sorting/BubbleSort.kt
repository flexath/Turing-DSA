package sorting

class BubbleSort: ISortAlgorithm {
    override fun sort(arr: IntArray): IntArray {
        for (i in 0..<arr.size - 1) {
            for (j in 1..<arr.size-i) {
                if (arr[j] < arr[j-1]) {
                    val temp = arr[j]
                    arr[j] = arr[j-1]
                    arr[j-1] = temp
                }
            }
        }
        return arr
    }
}


/*
1 − Check if the first element in the input array is greater than the next element in the array.
2 − If it is greater, swap the two elements; otherwise move the pointer forward in the array.
3 − Repeat Step 2 until we reach the end of the array.
4 − Check if the elements are sorted; if not, repeat the same process (Step 1 to Step 3) from the last element of the array to the first.
5 − The final output achieved is the sorted array.
 */

/*
sort(arr):
    for i from 0 to arr.size - 2 do
        for j from 1 to arr.size - i - 1 do
            if arr[j] < arr[j - 1] then
                temp ← arr[j]
                arr[j] ← arr[j - 1]
                arr[j - 1] ← temp
    return arr
 */