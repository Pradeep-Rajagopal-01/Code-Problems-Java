package arrays;


public class SmallestSubArrayWhoseSumIsGreaterOrEqualToTarget {

    public static int smallestSubArrayWhoseSumIsGreaterOrEqualToTarget(int[] array, int target ){
        if (array == null || array.length == 0) return 0;
        int minlength=0;
        int left=0;
        int sum=0;
//        HashMap<Integer,Integer> map = new HashMap<>(array.length);

        for (int right = 0; right < array.length; right++) {

            if (sum < target ){
                sum += array[right];
            }else {
                minlength = Math.max(minlength, right - left + 1);
                left=right;
            }
        }
        return minlength;
    }


    public static void main(String[] args) {

        int[] array = {2,3,1,2,4,3};
        System.out.println(smallestSubArrayWhoseSumIsGreaterOrEqualToTarget(array,7));
    }














}
