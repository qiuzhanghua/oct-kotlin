package com.example.talent.oct

class Problem {
    fun collect(coins: IntArray): Int {
        val n = coins.size
        if (n < 2) return 0
        if (n < 3) return coins[1]
        var f0 = 0
        var f1 = coins[1]
        var f2 = coins[1].coerceAtLeast(coins[2])
        for (i in 3 until n) {
            val f3 = f0.coerceAtLeast(f1) + coins[i]
            f0 = f1
            f1 = f2
            f2 = f3
        }
        return f1.coerceAtLeast(f2)
    }
}
