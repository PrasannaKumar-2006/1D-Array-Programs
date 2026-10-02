package lc2574_java;

import java.util.Arrays;

public class Solution {
    public int[] leftRightDifference(int[] nums) {
        int a[] = new int[nums.length];
        
        for (int i = 0; i < nums.length; i++) {
            int l = 0;
            int r = 0;
            
            for (int j = 0; j < i; j++) {
                l += nums[j];
            }
            
            for (int j = i + 1; j < nums.length; j++) {
                r += nums[j];
            }
            
            int ab = Math.abs(l - r);
            a[i] = ab;
        }
        
        return a;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {10, 4, 8, 3}; // Sample input
        int[] result = sol.leftRightDifference(nums);
        
        System.out.println(Arrays.toString(result));
    }
}
