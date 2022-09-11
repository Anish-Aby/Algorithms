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
 * Example 2:
 * Input: String="araaci", K=1
 * Output: 2
 * Explanation: The longest substring with no more than '1' distinct characters is "aa".
 *
 * Example 3:
 * Input: String="cbbebi", K=3
 * Output: 5
 * Explanation: The longest substrings with no more than '3' distinct characters are "cbbeb" & "bbebi".
 *
 */

public class Main {
    public static void main(String[] args) {
        String str = "araaci";
        int k = 2, windowStart = 0, windowEnd, maxSize = 0;
        /* making a hashmap to keep track of the frequency of the characters. */
        HashMap<Character, Integer> myMap = new HashMap<>();

        for (windowEnd = 0; windowEnd < str.length(); windowEnd++){
            char rightChar = str.charAt(windowEnd);
            myMap.put(rightChar, myMap.getOrDefault(rightChar, 0) + 1); // adding the character to the hashmap.

            // Reducing the size of the hashmap.
            while(myMap.size() > k){
                char leftChar = str.charAt(windowStart);
                myMap.put(leftChar, myMap.get(leftChar) - 1); // Reducing the window from the left side.
                if(myMap.get(leftChar) == 0) myMap.remove(leftChar);
                windowStart++;  // pushing the start of the window forward.
            }
            maxSize = Math.max(maxSize, windowEnd - windowStart + 1);   // capturing the max size of the window which has only k different characters.
        }
        System.out.printf("%-20s %d %s: %d", "Max size containing only", k, "element", maxSize);
    }
}
