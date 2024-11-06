package DSAArlgoProblems.Bactracking;

import java.util.ArrayList;
import java.util.List;

public class subSet2 {

    public static void main(String[] args) {
        int[] arr = {1,2,2};
        helper(arr,0,new ArrayList<>(),new ArrayList<>());
    }

    public static void helper(int[] arr, int ind, List<Integer> temp,List<List<Integer>> ans) {
          ans.add(new ArrayList<>(temp));
         if ( ind > arr.length ) return;

        for(int i = ind;i<arr.length;i++) {

            if ( i > ind && arr[i] == arr[i-1] ) {
                continue;
            }
            temp.add(arr[i]);
            helper(arr,i+1,temp,ans);
            temp.remove(temp.size()-1);
        }
    }
}
