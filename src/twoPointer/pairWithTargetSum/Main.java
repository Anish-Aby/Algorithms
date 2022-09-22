package twoPointer.pairWithTargetSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

/**
 * Problem Statement #
 * Given an array of sorted numbers and a target sum, find a pair in the array whose sum is equal to the given target.
 *
 * Example 1:
 *
 * Input: [1, 2, 3, 4, 6], target=6
 * Output: [1, 3]
 * Explanation: The numbers at index 1 and 3 add up to 6: 2+4=6
 *
 * Example 2:
 *
 * Input: [2, 5, 9, 11], target=11
 * Output: [0, 2]
 * Explanation: The numbers at index 0 and 2 add up to 11: 2+9=11
 *
 */

public class Main {
    public static int[] findPair(int[] array, int target){
        int left = 0, right = array.length - 1;

        while (left < right){
            int sum = array[left] + array[right];

            if (sum == target)
                return new int[] {left, right};
            if (sum > target)
                right--;
            if (sum < target)
                left++;
        }
        return new int[] {-1, -1};
    }

    public static void main(String[] args) {
        int[] result = findPair(new int[]{1, 2, 3, 4, 6}, 11);
        System.out.println(Arrays.toString(result));
    }
}
