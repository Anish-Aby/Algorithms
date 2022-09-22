package twoPointer.removeDuplicates;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Input: [2, 3, 3, 3, 6, 9, 9]
 * Output: 4
 * Explanation: The first four elements after removing the duplicates will be [2, 3, 6, 9].
 *
 * Input: [2, 2, 2, 11]
 * Output: 2
 * Explanation: The first two elements after removing the duplicates will be [2, 11].
 */
public class UsingHashMaps {
    public static List<Integer> removeDuplicates(int[] array){
        List<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < array.length; i++){
            int currNum = array[i];

            if(numMap.containsKey(currNum))
                continue;
            else {
                numMap.put(currNum, numMap.getOrDefault(currNum, 0) + 1);
                result.add(currNum);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> result = removeDuplicates(new int[] {2, 2, 2, 11});
        System.out.println(result.size());
    }
}
