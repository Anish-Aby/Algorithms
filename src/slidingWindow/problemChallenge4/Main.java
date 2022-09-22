package slidingWindow.problemChallenge4;

import java.util.HashMap;

/**
 * Given a string and a list of words, find all the starting indices
 * of substrings in the given string that are a concatenation of all the given words
 * exactly once without any overlapping of words.
 * It is given that all words are of the same length.
 *
 * Example 1:
 *
 * Input: String="catfoxcat", Words=["cat", "fox"]
 * Output: [0, 3]
 * Explanation: The two substring containing both the words are "catfox" & "foxcat".
 * Example 2:
 *
 * Input: String="catcatfoxfox", Words=["cat", "fox"]
 * Output: [3]
 * Explanation: The only substring containing both the words is "catfox".
 */

public class Main {
    public static void main(String[] args) {
        String str = "catfoxbatfoxcat";
        String[] words = {"cat", "fox", "bat"};
        HashMap<String, Integer> wordsMap = new HashMap<>();
        int windowStart = 0, windowEnd, windowSize = 0, matched = 0, wordSizeCounter = 0, wordSize = 3;
        String compareString = "", compareString2 = "";
        final long startTimer = System.nanoTime();

        for (String s : words)
            wordsMap.put(s, wordsMap.getOrDefault(s, 0) + 1);

        for (windowEnd = 0; windowEnd < str.length(); windowEnd++){
            char rightChar = str.charAt(windowEnd);
            compareString += rightChar;
            wordSizeCounter++; windowSize++;

            if (wordSizeCounter == wordSize){
                wordsMap.put(compareString, wordsMap.get(compareString) - 1);
                if (wordsMap.get(compareString) == 0)
                    matched++;
                wordSizeCounter = 0;
                compareString = "";
            }

            if (windowSize == (3 * words.length)){

                if (matched == wordsMap.size()){
                    System.out.println(windowStart);
                }
                for (int i = 0; i < 3; i++){
                    char leftChar = str.charAt(windowStart);
                    windowStart++;
                    compareString2 += leftChar;
                }

                if (wordsMap.containsKey(compareString2)){
                    if (wordsMap.get(compareString2) == 0)
                        matched--;
                    wordsMap.put(compareString2, wordsMap.get(compareString2) + 1);
                    compareString2 = "";
                }
                windowSize -= 3;
            }

        }
        System.out.println(compareString);
        final long endTimer = System.nanoTime();
        System.out.println(endTimer - startTimer);
    }
}
