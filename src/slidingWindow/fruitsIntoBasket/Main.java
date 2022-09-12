package slidingWindow.fruitsIntoBasket;

import java.util.HashMap;

/**
 * Problem Statement
 * Given an array of characters where each character represents a fruit tree,
 * you are given two baskets and your goal is to put maximum number of fruits in each basket.
 * The only restriction is that each basket can have only one type of fruit.
 *
 * You can start with any tree, but once you have started you can’t skip a tree.
 * You will pick one fruit from each tree until you cannot, i.e.,
 * you will stop when you have to pick from a third fruit type.
 *
 * Example 1:
 * Input: Fruit=['A', 'B', 'C', 'A', 'C']
 * Output: 3
 * Explanation: We can put 2 'C' in one basket and one 'A' in the other from the sub-array ['C', 'A', 'C']
 *
 * Example 2:
 * Input: Fruit=['A', 'B', 'C', 'B', 'B', 'C']
 * Output: 5
 * Explanation: We can put 3 'B' in one basket and two 'C' in the other basket.
 * This can be done if we start with the second letter: ['B', 'C', 'B', 'B', 'C']
 *
 */

public class Main {
    public static void main(String[] args) {
        char[] array = {'A', 'B', 'C', 'B', 'B', 'C'};
        int basketSize = 2, windowEnd, windowStart = 0, maxFruits = 0;
        HashMap<Character, Integer> myMap = new HashMap<>();    // Creating a hash-map.

        for (windowEnd = 0; windowEnd < array.length; windowEnd++){
            char rightChar = array[windowEnd];
            myMap.put(rightChar, myMap.getOrDefault(rightChar, 0) + 1);     // Adding a new element to the window.

            /* Reducing the size of the window. */
            while (myMap.size() > basketSize){
                char leftChar = array[windowStart];
                myMap.put(leftChar, myMap.get(leftChar) - 1);
                if (myMap.get(leftChar) == 0) myMap.remove(leftChar);
                windowStart++;      // Pushing the window start forward.
            }
            maxFruits = Math.max(maxFruits, windowEnd - windowStart + 1);       // Capturing the max size.
        }
        System.out.printf("%-30s %d\n", "The max number of fruits is:", maxFruits);     // Displaying the max size.
    }
}
