package patterns.slidingwindow.arrays;

public class Max_Sum_SubArray_Of_Size_K {

//This is a fixed-size window problem.
    public static int maxSumSubArrayOfSizeK(int[] array, int k){
        int maxSum = Integer.MIN_VALUE;
        int left = 0;
        int subArraySum = 0;

        for (int right = 0; right < array.length; right++) {
            subArraySum = subArraySum + array[right];

            if (right - left + 1 == k){
                maxSum = Math.max(maxSum,subArraySum);
                subArraySum = subArraySum - array[left];
                left++;
            }
        }
        return maxSum;
    }


    public static void main(String[] args) {
        int[] array = {2,1,5,1,3,2};
        System.out.println(maxSumSubArrayOfSizeK(array,3));
    }
}
