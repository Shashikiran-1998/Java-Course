package DSAArlgoProblems.Bactracking;

import java.util.ArrayList;
import java.util.List;

public class combinationSum3 {

    public static void main(String[] args) {
        int k = 3;
        int n = 7;
        helper(1,k,n,new ArrayList<>(),new ArrayList<>(),Math.min(n,9));
    }

    public static void helper(  int ind,int n, int currentSum, List<Integer> temp,List<List<Integer>> ans,int s ) {
        if( currentSum <= 0) {
            if( currentSum == 0 && temp.size() == n ) {
              ans.add( new ArrayList<>(temp));
             }
            return;
        }

        if ( temp.size() > n ) return;

        for (int i = ind; i < s;i++) {
            temp.add( i );
            helper(i+1,n, currentSum - i,temp,ans,s);
            temp.remove(temp.size()-1);
        }
    }
}
