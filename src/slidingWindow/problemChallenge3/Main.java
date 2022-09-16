package slidingWindow.problemChallenge3;

import java.util.HashMap;

/**

 Example 1:

 Input: String="aabdec", Pattern="abc"
 Output: "abdec"
 Explanation: The smallest substring having all characters of the pattern is "abdec"
 Example 2:

 Input: String="abdabca", Pattern="abc"
 Output: "abc"
 Explanation: The smallest substring having all characters of the pattern is "abc".
 Example 3:

 Input: String="adcad", Pattern="abc"
 Output: ""
 Explanation: No substring in the given string has all characters of the pattern.
 */

public class Main {
    public static void main(String[] args) {
        String str = "aabdec", pattern = "abc";
        HashMap<Character, Integer> patternMap = new HashMap<>();
        int windowStart = 0, matched = 0, minLength = str.length();

        for (char c : pattern.toCharArray())
            patternMap.put(c, patternMap.getOrDefault(c, 0) + 1);

        System.out.println(patternMap);

        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++){
            char rightChar = str.charAt(windowStart);

            if (patternMap.containsKey(rightChar)){
                patternMap.put(rightChar, patternMap.getOrDefault(rightChar, 0) - 1);

                if (patternMap.get(rightChar) == 0)
                    matched++;
            }
            System.out.println(patternMap);
        }
    }
}
