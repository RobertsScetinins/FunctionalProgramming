package Solution;

import java.util.stream.IntStream;

public class Solution {

    static long superDigit(long x) {
        if (x <= 0) return 0;
        long sum = x % 10;
        do {
            x = (x - (x % 10)) / 10;
            sum += x % 10;
        } while (x >= 10);
        if (sum > 10) return superDigit(sum);
        return sum;
    }

    static long shortSuperDigit(long x) {
        if (x <= 0) return 0;
        if (x < 10) {
            return x;
        } else {
            return shortSuperDigit(x % 10 + shortSuperDigit(x / 10));
        }
    }

    private static int OOP_Recursive(int x, int n, int limit) {
        if (x == 0) {
            return 1;
        }
        int combination = 0;
        for (int i = limit; i > 0; i--) {
            int nextX = x - (int) Math.pow(i, n), subSum = 0;
            for (int j = 1; j < i; j++) {
                subSum += Math.pow(j, n);
            }
            if (nextX >= 0 && subSum >= nextX) {
                combination += OOP_Recursive(nextX, n, i - 1);
            }
        }
        return combination;
    }

    private static int FP_Recursive(int x, int n, int limit) {
        if (x == 0) {
            return 1;
        } else {
            return IntStream.rangeClosed(1, limit)
                    .filter(i -> x - Math.pow(i, n) >= 0)
                    .map(i -> FP_Recursive(x - (int) Math.pow(i, n), n, i - 1))
                    .sum();
        }
    }

    static int powerSum(int x, int n) {
        if (x > 0) {
            return FP_Recursive(x, n, (int) Math.pow(x, (1.0 / n)));
        } else {
            return 0;
        }
    }

    static int powerSumOOP(int x, int n) {
        if (x > 0) {
            return OOP_Recursive(x, n, (int) Math.pow(x, (1.0 / n)));
        } else {
            return 0;
        }
    }

}