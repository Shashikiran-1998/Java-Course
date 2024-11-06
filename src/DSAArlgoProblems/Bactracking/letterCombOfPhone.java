package DSAArlgoProblems.Bactracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class letterCombOfPhone {

    public static void main(String[] args) {
        String s = "234";
        HashMap<Character, List<String>> map = new HashMap<>();
        List<String> ans = new ArrayList<>();

        map.put('2', Arrays.asList("a", "b", "c"));
        map.put('3', Arrays.asList("d", "e", "f"));
        map.put('4', Arrays.asList("g", "h", "i"));
        map.put('5', Arrays.asList("j", "k", "l"));
        map.put('6', Arrays.asList("m", "n", "o"));
        map.put('7', Arrays.asList("p", "q", "r", "s"));
        map.put('8', Arrays.asList("t", "u", "v"));
        map.put('9', Arrays.asList("w", "x", "y", "z"));

        helper(s,0,map,"");
    }

    public static void helper( String s, int ind,HashMap<Character, List<String>> map,String temp) {
        //base case
        if(temp.length() == s.length()) {
            System.out.println(temp);
            return;
        }


        for (String i: map.get(s.charAt(ind))) {
            temp = temp + i;
            helper(s,ind+1,map,temp);
            temp = temp.substring(0,temp.length()-1);
        }
    }
}
