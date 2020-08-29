package com.example.talent.oct

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class ProblemTests {
    @DisplayName("1级台阶")
    @Test
    fun test_collect() {
        val problem = Problem()
        Assertions.assertEquals(problem.collect(intArrayOf(3)), 0)
    }

    @DisplayName("2级台阶")
    @Test
    fun test_collect_02() {
        val problem = Problem()
        Assertions.assertEquals(problem.collect(intArrayOf(3, 2)), 2)
    }

    @DisplayName("3级台阶")
    @Test
    fun test_collect_03() {
        val problem = Problem()
        Assertions.assertEquals(problem.collect(intArrayOf(4, 6, 5)), 6)
    }

    @DisplayName("4级台阶")
    @Test
    fun test_collect_04() {
        val problem = Problem()
        Assertions.assertEquals(problem.collect(intArrayOf(2, 3, 100, 50)), 100)
    }

    @DisplayName("5级台阶")
    @Test
    fun test_collect_05() {
        val problem = Problem()
        Assertions.assertEquals(problem.collect(intArrayOf(0, 2, 55, 100, 50)), 105)
    }
}