package slidingWindow.problemChallenge2;

import java.util.HashMap;

/**
 * Given a string and a pattern, find all anagrams of the pattern in the given string.
 *
 * Example 1:
 *
 * Input: String="ppqp", Pattern="pq"
 * Output: [1, 2]
 * Explanation: The two anagrams of the pattern in the given string are "pq" and "qp".
 * Example 2:
 *
 * Input: String="abbcabc", Pattern="abc"
 * Output: [2, 3, 4]
 * Explanation: The three anagrams of the pattern in the given string are "bca", "cab", and "abc".
 *
 */

public class Main {
    public static void main(String[] args) {
        String str = "ppqp", pattern = "pq";
        int windowEnd, windowStart = 0, matched = 0, counter = 0;
        int[] result = new int[str.length()];
        HashMap<Character, Integer> patternMap = new HashMap<>();

        for (char chr : pattern.toCharArray())
            patternMap.put(chr, patternMap.getOrDefault(chr, 0) + 1);

        for (windowEnd = 0; windowEnd < str.length(); windowEnd++){
            char rightChar = str.charAt(windowEnd);

            if (patternMap.containsKey(rightChar)){
                patternMap.put(rightChar, patternMap.get(rightChar) - 1);

                if (patternMap.get(rightChar) == 0){
                    matched++;
                }
            }

            if (matched == patternMap.size())
                result[counter] = windowEnd - pattern.length() + 1; counter++;

            if (windowEnd >= pattern.length() - 1){
                char leftChar = str.charAt(windowStart);
                windowStart++;
                if (patternMap.containsKey(leftChar)){
                    if (patternMap.get(leftChar) == 0) {
                        matched--;
                    }
                    patternMap.put(leftChar, patternMap.get(leftChar) + 1);
                }
            }
        }
        for (int i : result) { if ( i != 0 ) System.out.println(i);}
    }
}
