package patternSlidingWindow;

/*Given an array, find the average of all contiguous subarrays of size ‘K’ in it.
* Array: [1, 3, 2, 6, -1, 4, 1, 8, 2], K=5
* Output: [2.2, 2.8, 2.4, 3.6, 2.8]*/

import java.util.Scanner;

public class ContiguousSubArray {
    public static void main(String[] args) {
        int k, windowSum = 0, windowEnd, windowStart = 0;
        int[] arr = {1, 3, 2, 6, -1, 4, 1, 8, 2};
        System.out.println("Enter the k value: ");
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        double[] results = new double[arr.length-k+1];
        for (windowEnd = 0; windowEnd < arr.length; windowEnd++){
            windowSum += arr[windowEnd];

            if(windowEnd>= k-1){
                results[windowStart] = (double) windowSum/ k ;
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }
        for(int i = 0; i < results.length; i++){
            System.out.println(results[i]);
        }
    }
}
