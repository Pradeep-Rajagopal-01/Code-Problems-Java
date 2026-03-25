package arrays;

//Problem Statement: Given a sorted array, find if there exists a pair whose sum = target

//Pattern : Two Pointers
public class GivenASortedArrayFindIfThereIsAPairWhoseSumIsEqualToTarget {

    public static boolean findPairWhoseSumIsEqualToTarget(int[] array, int target){

        int left=0;
        int right=array.length-1;

        while (left < right){
            int sum = array[left] + array[right];

            if (sum == target) {
                return true;
            } else if (sum > target){
                right--;
            } else  {
                left++;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] array ={1,2,3,4,6};
        System.out.println(findPairWhoseSumIsEqualToTarget(array,10));
    }
}
