package twoPointer.pairWithTargetSum;

import java.util.Arrays;
import java.util.HashMap;

public class BetterSolution {
    public static int[] findPair(int[] array, int target){
        HashMap<Integer, Integer> compMap = new HashMap<>();
        for (int i = 0; i < array.length; i++){
            int currNum = array[i];

            if (compMap.containsKey(target - currNum))
                return new int[] {compMap.get(target-currNum), i};

            else {
                compMap.put(array[i], i);
            }
        }
        return new int[] {-1, -1};
    }

    public static void main(String[] args) {
        int[] result = findPair(new int[] {1, 2, 3, 4, 6}, 9);
        System.out.println(Arrays.toString(result));
    }
}
