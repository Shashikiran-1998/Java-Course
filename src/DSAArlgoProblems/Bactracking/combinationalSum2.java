package DSAArlgoProblems.Bactracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationalSum2 {

    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3};
        int targetSum = 3;
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        helperOptimised(arr,0,targetSum,new ArrayList<>(),ans);
        System.out.println(ans);
        // helper(arr,0,targetSum,new ArrayList<>());

    }

    public static void helper(int[] arr, int ind, int currentSum, List<Integer> tempArray) {
        if ( currentSum <= 0 ) {
            if ( currentSum == 0 ) {
                System.out.println(tempArray);
            }
            return;
        }
        if (ind == arr.length) {

            return;
        }


        tempArray.add(arr[ind]);
        helper(arr,ind+1,currentSum - arr[ind],tempArray);
        tempArray.remove(tempArray.size() - 1);
        helper(arr,ind+1,currentSum,tempArray);

     // as this uses set sp time complexity is more
    }

    public static void helperOptimised(int[] arr,int ind,int currentSum,List<Integer> temp,List<List<Integer>> ans) {

        if (currentSum <= 0 ) {

            if (currentSum == 0 && temp.size() > 0) {
                System.out.println(temp);
            }
            return;
        }

        if (ind >= arr.length) return;

        for ( int i = ind ;i < arr.length; i++  ) {

            if(i > ind && arr[i -1] == arr[i]) continue;
            temp.add(arr[i]);
            helperOptimised(arr,i+1,currentSum - arr[i],temp,ans);
            // hO(0,
            if( temp.size() > 0)
              temp.remove(temp.size()-1);
        }
    }
}
