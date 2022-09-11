package slidingWindow.noRepeatSubString;

import java.util.HashMap;

/**
 * Problem Statement
 * Given a string, find the length of the longest substring which has no repeating characters.
 *
 * Example 1:
 * Input: String="aabccbb"
 * Output: 3
 * Explanation: The longest substring without any repeating characters is "abc".
 *
 * Example 2:
 * Input: String="abbbb"
 * Output: 2
 * Explanation: The longest substring without any repeating characters is "ab".
 *
 * Example 3:
 * Input: String="abccde"
 * Output: 3
 * Explanation: Longest substrings without any repeating characters are "abc" & "cde".
 *
 */

public class Main {
    public static void main(String[] args) {
        String str = "abccde";
        int windowStart = 0, windowEnd, maxLength = 0;
        int size = 1;
        HashMap<Character, Integer> myMap = new HashMap<>();

        for(windowEnd = 0; windowEnd < str.length(); windowEnd++){
            char rightChar = str.charAt(windowEnd);

            if (myMap.containsKey(rightChar)){
                windowStart =  Math.max(windowStart, myMap.get(rightChar) + 1);
            }

            myMap.put(rightChar, windowEnd);
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }
        System.out.println(maxLength); 

    }
}
