package DSAArlgoProblems.Bactracking;

import java.util.ArrayList;
import java.util.List;

public class subsetSum {

    public static void main(String[] args) {
        int[] arr = {1,2,1};
        helper( arr, -1,0);
        List<Integer> ans = new ArrayList<>();
    }

    public static void helper(int [] arr, int ind, int sum) {
        System.out.println(sum);
        if(ind >= arr.length) return;;
        for ( int i = ind ;i<arr.length - 1;i++) {
            helper(arr,i+1,sum + arr[i+1]);
        }
    }
}
