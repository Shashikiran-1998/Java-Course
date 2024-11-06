package DSAArlgoProblems.Bactracking;

public class isSumSubsetPresent {

    public static void main(String[] args) {
        int[] arr = {4, 3, 5, 2};
        int k = 18;
        int n = arr.length;
      System.out.println(  isSumSubsetPresent1(arr,0,0,k) );;
    }

    public static  boolean isSumSubsetPresent1(int[] arr,int ind,int currentSum,int targetSum) {
        if ( ind == arr.length ) {

            return targetSum == currentSum;
        }

        if ( isSumSubsetPresent1(arr, ind + 1, currentSum + arr[ind], targetSum) ) {
            return true;
        }

        return isSumSubsetPresent1(arr, ind + 1, currentSum, targetSum);
    }
}
