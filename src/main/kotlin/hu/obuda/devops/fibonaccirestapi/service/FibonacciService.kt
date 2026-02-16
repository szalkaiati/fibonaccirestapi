package hu.obuda.devops.fibonaccirestapi.service

import org.springframework.stereotype.Service

@Service
class FibonacciService {
    fun fibonacci(n: Int): Int {
        require(n >= 0) { "n must be non-negative" }

        if (n == 0) return 0
        if (n == 1) return 1

        var prev = 0
        var current = 1

        for (i in 2..n) {
            val next = prev + current
            prev = current
            current = next
        }

        return current
    }
}