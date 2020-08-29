package com.example.talent.oct

class Problem {
    fun collect(coins: IntArray): Int {
        val n = coins.size
        if (n < 2) return 0
        val dp = IntArray(n)
        dp[1] = coins[1]
        for (i in 0 until n - 2) {
            dp[i + 2] = Math.max(dp[i + 2], dp[i] + coins[i + 2])
            if (i + 3 < n) dp[i + 3] = Math.max(dp[i + 3], dp[i] + coins[i + 3])
        }
//        println(dp.joinToString(",", "[", "]"))
        return Math.max(dp[n - 1], dp[n - 2])
    }
}