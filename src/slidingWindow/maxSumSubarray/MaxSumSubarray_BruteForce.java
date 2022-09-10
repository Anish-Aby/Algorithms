package slidingWindow.maxSumSubarray;

/**
 * Problem Statement :
 * Given an array of positive numbers and a positive number ‘k’,
 *  find the maximum sum of any contiguous subarray of size ‘k’.
 *
 *  test example 1: Input: [2, 1, 5, 1, 3, 2], k=3
 *  Output: 9
 *  Explanation: Subarray with maximum sum is [5, 1, 3].
 *
 * test example 2: Input: [2, 3, 4, 1, 5], k=2
 * Output: 7
 * Explanation: Subarray with maximum sum is [3, 4].
 *
 *  Here, we try the brute force method.
 */

public class MaxSumSubarray_BruteForce {
    public static void main(String[] args) {
        int[] inputArray = {2, 3, 4, 1, 5};  // len = 6
        int k = 2, sum = 0, max = 0;

        for(int i = 0; i <= inputArray.length - k; i ++){    // 6 - 3 = 3
            sum = 0;
            for(int j = i; j < k + i; j++){
                sum += inputArray[j];
            }
            if(sum > max)   max = sum;
        }
        System.out.println(max);
    }
}
