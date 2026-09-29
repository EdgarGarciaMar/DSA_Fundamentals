package twopointers;

import java.util.HashMap;

/**
 * The Two-Pointers Technique is a simple yet powerful strategy where you use two indices (pointers) that traverse a data structure - 
 * such as an array, list, or string - either toward each other or in the same direction to solve problems more efficiently
 */
public class pointers {
    /**
     * When to Use Two Pointers:
        -Sorted Input : If the array or list is already sorted (or can be sorted), two pointers can efficiently find pairs or ranges. Example: Find two numbers in a sorted array that add up to a target.
        -Pairs or Subarrays : When the problem asks about two elements, subarrays, or ranges instead of working with single elements. Example: Longest substring without repeating characters, maximum consecutive ones, checking if a string is palindrome.
        -Sliding Window Problems : When you need to maintain a window of elements that grows/shrinks based on conditions. Example: Find smallest subarray with sum ≥ K, move all zeros to end while maintaining order.
        -Linked Lists (Slow–Fast pointers) : Detecting cycles, finding the middle node, or checking palindrome property. Example: Floyd’s Cycle Detection Algorithm (Tortoise and Hare).
     */

    // Function to check whether any pair exists
    // whose sum is equal to the given target value
    private static boolean twoSum(int[] arr, int target){
        // Sort the array
        int left = 0, right = arr.length - 1;

        // Iterate while left pointer is less than right
        while (left < right) {
            int sum = arr[left] + arr[right];

            // Check if the sum matches the target
            if (sum == target)
                return true;
            else if (sum < target)
                left++; // Move left pointer to the right
            else
                right--; // Move right pointer to the left
        }
        // If no pair is found
        return false;
    }

    //Function to know the length of the longest substring
    private static int lengthOfLongestSubstring(String s){
        // Map to store each character and its position
        HashMap<Character, Integer> map = new HashMap<>();

        // Initialize the left pointer to 0 and max lenght to 0
        int left = 0;
        int max = 0;

        // The right pointer moves forward until the end of the string,
        // expanding the sliding window
        for (int right = 0; right < s.length(); right++) {

            // Retrieve the character at the current right pointer position
            char c = s.charAt(right);

            /**
             * If the map has already seen the character,
             * move the left pointer to the position after its previous occurrence.
             * This shrinks the window and removes the repeated character.
             */
            if (map.containsKey(c)) {
                left = Math.max(left, map.get(c) + 1);
            }

            // Store the most recent position of the character 
            map.put(c, right);

            // Update the maximum length of the substring
            max = Math.max(max, right - left + 1);
        }

        return max;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(twoSum(arr, 10));
        System.out.println( lengthOfLongestSubstring("abcabcbb"));
    }

}
