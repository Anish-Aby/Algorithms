package slidingWindow.maxSumSubarray;

/**
 * We use the sliding window technique to overcome the time complexity problem.
 */

public class Main {
    public static void main(String[] args) {
        final long startTime = System.nanoTime();

        int[] array = {2, 3, 4, 1, 5};    // Length = 6.
        int k = 2, windowStart = 0, windowEnd, sum = 0, max = 0;

        for(windowEnd = 0; windowEnd <= array.length - k + 1; windowEnd++){  // 6 - 3 = 3.
            sum += array[windowEnd];

            if(windowEnd >= k - 1){
                if (sum > max) { max = sum;}
                sum -= array[windowStart];
                windowStart++;
            }
        }
        System.out.println(max);
        final long endTime = System.nanoTime();

        System.out.println("Execution time: " + (endTime - startTime) + "ns.");

    }
}
