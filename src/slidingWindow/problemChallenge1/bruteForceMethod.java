package slidingWindow.problemChallenge1;

import java.util.HashMap;

/**
 * Given a string and a pattern, find out if the string contains any permutation of the pattern.
 *
 * Example 1:
 * Input: String="oidbcaf", Pattern="abc"
 * Output: true
 * Explanation: The string contains "bca" which is a permutation of the given pattern.
 *
 * Example 2:
 * Input: String="odicf", Pattern="dc"
 * Output: false
 * Explanation: No permutation of the pattern is present in the given string as a substring.
 *
 * Example 3:
 * Input: String="bcdxabcdy", Pattern="bcdyabcdx"
 * Output: true
 * Explanation: Both the string and the pattern are a permutation of each other.
 *
 * Example 4:
 * Input: String="aaacb", Pattern="abc"
 * Output: true
 * Explanation: The string contains "acb" which is a permutation of the given pattern.
 *
 */

public class bruteForceMethod {
    public static void main(String[] args) {
        String str = "aaacb", pattern = "abc";
        int windowEnd;
        HashMap<Character, Integer> patternMap = new HashMap<>();
        HashMap<Character, Integer> matchedMap = new HashMap<>();

        // Populating the patternMap
        for (int i = 0; i < pattern.length(); i++){
            char rightChar = pattern.charAt(i);
            patternMap.put(rightChar, patternMap.getOrDefault(rightChar, 0) + 1);
        }

        for (windowEnd = 0; windowEnd < str.length(); windowEnd++){
            char rightChar = str.charAt(windowEnd);

            if (patternMap.containsKey(rightChar)){
                for (int i = windowEnd; i < windowEnd + pattern.length(); i++){
                    char newRightChar = str.charAt(i);
                    matchedMap.put(newRightChar, matchedMap.getOrDefault(newRightChar, 0) + 1);
                }
                if (matchedMap.equals(patternMap)){
                    System.out.println(true);
                    return;
                }
                matchedMap.clear();
            }
        }

    }
}
