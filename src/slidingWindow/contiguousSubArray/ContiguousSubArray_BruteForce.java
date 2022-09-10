package slidingWindow.contiguousSubArray;

/**
 * This is done using brute force method.
 * This method is not advised as it takes more time.
 * Time complexity is O(N∗K) where ‘N’ is the number of elements in the input array.
 * Instead, we use the sliding window method.
 * Array: [1, 3, 2, 6, -1, 4, 1, 8, 2], K=5
 */

public class ContiguousSubArray_BruteForce {
    public static void main(String[] args) {
        final long startTime = System.nanoTime();
        int[] array = {1, 3, 2, 6, -1, 4, 1, 8, 2};     // len = 9
        int k = 5;
        double avg, sum;
        double[] result = new double[array.length-k+1]; // Check the size later

        for(int i = 0; i <= array.length-k; i++){   // 9 - 5 = 4
            sum = 0; avg = 0;
            for(int j = i; j < k+i; j++){
                sum += array[j];
            }
            avg = sum / k;
            result[i] = avg;
        }
        for(double i : result)
            System.out.println(i);
        final long endTime = System.nanoTime();
        System.out.println("Total time taken: "+ (endTime-startTime)+ " ns");
    }
}
