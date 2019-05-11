package com.zhujiaqqq.pear;

class Solution {
    public int countPrimes(int n) {
        if (n < 3) {
            return 0;
        }
        int[] nums = new int[n];
        nums[0] = 1;
        nums[1] = 1;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (nums[i] == 0) {
                for (int j = i * i; j < n; j += i) {
                    nums[j] = 1;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                count++;
            }
        }
        return count;
    }
}