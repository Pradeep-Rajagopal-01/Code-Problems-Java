package arrays;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithSumK {

    /*
Problem:
Given an array of integers, return the length of the longest subarray with sum = k.

Example:
Input: nums = [1, -1, 5, -2, 3], k = 3
Output: 4
Explanation: [1, -1, 5, -2] sums to 3
     */

    public static int longestSubArrayLength(int[] array, int k){

        Map<Integer,Integer> map = new HashMap<>();
        int sum=0;
        int maxlLength=0;

        for (int i = 0; i <array.length ; i++) {
            sum += array[i];

            // Case 1: The sum from the very beginning equals k
             if (sum == k){
                maxlLength = i+1;
            }


        // Case 2: If (currentSum - k) exists in the map,
        // it means the subarray between that index and i sums to k.
            if (map.containsKey(sum - k)){
                int length = i - map.get(sum - k);
                maxlLength = Math.max(maxlLength,length);
            }

        // Case 3: Only add the sum to the map if it doesn't exist.
        // We want the OLDEST index to get the LONGEST length.
            if (!map.containsKey(sum - k)){
                map.put(sum,i);
            }
        }
        return maxlLength;


// Below code does the same work but its o(n2) square. The above approach is much efficient o(n).
        //        int longestSubArraylength=1;
//        int tempLength;
//
//        for (int i = 0; i <array.length ; i++) {
//            int sum=0;
//            tempLength=0;
//            for (int j = i; j <array.length ; j++) {
//                sum += (array[j]);
//                if (sum == k){
//                    tempLength = j - i +1;
//                    if (tempLength > longestSubArraylength) longestSubArraylength = tempLength;
//                }
//            }
//        }
//        return longestSubArraylength;
    }

    public static void main(String[] args) {

        int[] array = {1,-1,5,-2,3};
//        int[] array = {1,2,5,3,7};

        System.out.println(longestSubArrayLength(array,3));
    }
}
