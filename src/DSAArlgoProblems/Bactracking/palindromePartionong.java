package DSAArlgoProblems.Bactracking;

import java.util.ArrayList;
import java.util.List;

public class palindromePartionong {

    public static void main(String[] args) {
        String s = "abba";
        helper(s,0,new ArrayList<>());
    }

    public static void helper(String s, int ind, List<String> path) {

        if ( ind >= s.length() ) {
            System.out.println(path);
            return;
        }

        for(int i = ind; i< s.length();i++) {

            if (isPalindrome(s, ind,i)) {
               path.add( s.substring(ind,i+1)) ;
               helper(s,i+1,path);
               path.remove(path.size()-1);
            }
        }

    }

    private static boolean isPalindrome(String s,int start,int end) {

        while ( start <= end ) {
            if( s.charAt(start++) != s.charAt(end--) ) return false;
        }
        return true;
    }
}
