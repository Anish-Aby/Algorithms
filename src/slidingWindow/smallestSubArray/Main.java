package slidingWindow.smallestSubArray;

/*Given an array of positive numbers and a positive number ‘S’,
* Find the length of the smallest contiguous subarray whose sum
* is grater than or equal to S. Return 0, if no such subarray exists.
*
* Example 1:

Input: [2, 1, 5, 2, 3, 2], S=7
Output: 2
Explanation: The smallest subarray with a sum greater than or equal to '7' is [5, 2].
*
* */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = {2, 1, 5, 2, 3, 2};
        int s = 7, windowLength = 0, windowStart = 0,
                windowEnd, windowSum = 0,
                result = array.length;

        for(windowEnd = 0; windowEnd < array.length; windowEnd++){
            windowSum += array[windowEnd];
            windowLength++;

            while(windowSum >= s){
                if(windowLength < result) result = windowLength;
                windowSum -= array[windowStart];
                windowLength--;
                windowStart++;
            }
        }
        System.out.println("Smallest size: " + result);

    }
}
