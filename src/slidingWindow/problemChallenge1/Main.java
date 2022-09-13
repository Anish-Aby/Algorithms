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

public class Main {
    public static void main(String[] args) {
        String str = "oidbcaf", pattern = "abc";
        int windowEnd, windowStart = 0, matched = 0;
        HashMap<Character, Integer> patternMap = new HashMap<>();

        for (char chr : pattern.toCharArray()) {
            patternMap.put(chr, patternMap.getOrDefault(chr, 0) + 1);
        }

        for (windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            char rightChar = str.charAt(windowEnd);

            if (patternMap.containsKey(rightChar)) {
                patternMap.put(rightChar, patternMap.get(rightChar) - 1);

                if (patternMap.get(rightChar) == 0)
                    matched++;
            }

            if (matched == patternMap.size()) {
                System.out.println(true);
                return;
            }

            if (windowEnd >= pattern.length() - 1) {
                char leftChar = str.charAt(windowStart);
                if (patternMap.containsKey(leftChar)) {
                    if (patternMap.get(leftChar) == 0)
                        matched--;
                    patternMap.put(leftChar, patternMap.get(leftChar) + 1);
                }
            }
        }
    }
}
