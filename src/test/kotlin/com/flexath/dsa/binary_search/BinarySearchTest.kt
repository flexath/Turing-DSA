package com.flexath.dsa.binary_search

import binary_search.BinarySearch
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class BinarySearchTest {

    private val binarySearch = BinarySearch()

    @Test
    fun binarySearchWithIterativeBestCase() {
        val itemList = listOf(1, 3, 5, 6, 9, 12, 20)
        val index = binarySearch.binarySearchWithIterative(1,itemList)
        assertEquals(0,index)
    }

    @Test
    fun binarySearchWithIterativeWorstCase() {
        val itemList = listOf(1, 3, 5, 6, 9, 12, 20)
        val index = binarySearch.binarySearchWithIterative(20,itemList)
        assertEquals(6,index)
    }

    @Test
    fun binarySearchWithIterativeAverageCase() {
        val itemList = listOf(1, 3, 5, 6, 9, 12, 20)
        val index = binarySearch.binarySearchWithIterative(9,itemList)
        assertEquals(4,index)
    }

    @Test
    fun binarySearchWithIterativeEdgeCase() {
        val itemList = listOf(1, 3, 5, 6, 9, 12, 20)
        val index = binarySearch.binarySearchWithIterative(9,itemList)
        assertNotEquals(-1,index)
    }
}