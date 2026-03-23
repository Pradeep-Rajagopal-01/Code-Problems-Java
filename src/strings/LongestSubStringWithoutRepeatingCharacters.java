package strings;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithoutRepeatingCharacters {

    public static int longestStringWithoutRepeatingCharacters(String string){
        if (string == null || string.length() == 0) return 0;

        int maxLength=0;
        char[] chars = string.toCharArray();
        Map<Character ,Integer> map = new HashMap<>();

        int length = 0;
        for (int i = 0; i <string.length(); i++) {
            if (!map.containsKey(chars[i])) {
                map.put(chars[i], i);
                length++;
            }else {
                maxLength = Math.max(maxLength, length);
                map.remove(chars[i]);
                length--;
                i--;
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {

        String s = "abcdeabk";
        System.out.println(longestStringWithoutRepeatingCharacters(s));
    }
}














