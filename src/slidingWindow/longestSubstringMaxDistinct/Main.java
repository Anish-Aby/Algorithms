package slidingWindow.longestSubstringMaxDistinct;

import java.util.HashMap;

/**
 * Given a string, find the length of the longest substring
 * in it with no more than K distinct characters.
 *
 * Example 1:
 * Input: String="araaci", K=2
 * Output: 4
 * Explanation: The longest substring with no more than '2' distinct characters is "araa".
 *
 */

public class Main {
    public static void main(String[] args) {
        String string = "araaci";
        int k = 2, windowEnd, windowStart = 0;
        HashMap<Character, Integer> myMap = new HashMap<>();

        for (windowEnd = 0; windowEnd < string.length(); windowEnd++){
            
        }
    }
}
