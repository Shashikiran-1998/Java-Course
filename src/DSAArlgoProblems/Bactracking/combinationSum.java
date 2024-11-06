package DSAArlgoProblems.Bactracking;

import java.util.ArrayList;
import java.util.List;

public class combinationSum {

    public static void main(String[] args) {
        int[] arr = {2,3,6};
        int targetSum = 8;
        helper(arr,0,targetSum,0,new ArrayList<>());
    }

    public static void helper(int[] arr, int currentSum, int targetSum, int ind, List<Integer> tempArr) {
        if ( currentSum >= targetSum ) {

            if ( currentSum == targetSum ) {
                System.out.println(tempArr);
            }
            return;
        }
        if ( ind >= arr.length ) {

            return;
        }



        tempArr.add( arr[ind] );
        helper(arr,currentSum + arr[ind], targetSum,ind,tempArr);
        tempArr.remove(tempArr.size() - 1);
        helper(arr,currentSum, targetSum,ind+1,tempArr);
    }
}
