package slidingWindow.smallestSubArray;

/**
 * Problem Statement:
 * Given an array of positive numbers and a positive number ‘S’,
 *  find the length of the smallest contiguous sub-array whose sum
 *  is greater than or equal to ‘S’. Return 0, if no such sub-array exists.
 *
 *  Example 1:
 *  Input: [2, 1, 5, 2, 3, 2], S=7
 *  Output: 2
 *  Explanation: The smallest sub-array with a sum greater than or equal to '7' is [5, 2].
 *
 *  Example 2:
 *  Input: [2, 1, 5, 2, 8], S=7
 *  Output: 1
 *  Explanation: The smallest sub-array with a sum greater than or equal to '7' is [8].
 *
 */

public class SmallestSubArray_BruteForce {
    public static void main(String[] args) {
        int[] array = {2, 1, 5, 2, 3, 2};   // Length = 6
        int s = 7, size, sum, minSize = array.length;

        for(int i = 0; i < array.length; i++){
            sum = 0; size = 0;
            for(int j = i; j < array.length; j++){
                sum += array[j];
                size++;

                if (sum >= s){
                    if (size < minSize) minSize = size;
                }
            }
        }
        System.out.println("Smallest sub-array with sum as " + s + ":"+ " " +minSize);
    }
}
