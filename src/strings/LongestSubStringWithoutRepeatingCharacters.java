package strings;

import java.util.HashSet;
import java.util.Set;

/*
Problem Statement:
Given a string s, find the length of the longest substring without repeating characters
 */
public class LongestSubStringWithoutRepeatingCharacters {

    public static int longestStringWithoutRepeatingCharacters(String s){
        if (s == null || s.length() == 0) return 0;

        Set<Character> set = new HashSet<>();
        int maxLength=0;
        int left=0;

        for (int right = 0; right < s.length() ; right++) {

            while (set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {

        String s = "abcdeabk";
        System.out.println(longestStringWithoutRepeatingCharacters(s));
    }
}














