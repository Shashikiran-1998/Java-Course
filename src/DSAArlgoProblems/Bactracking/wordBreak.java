package DSAArlgoProblems.Bactracking;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class wordBreak {

    public static void main(String[] args) {
        String s = "applepenapple";
        List<String> wordDict = Arrays.asList("apple", "pen");
        Map<String,Boolean> map = new HashMap<String, Boolean>();
        System.out.println( helper(s,wordDict,map) );

    }

    public static boolean helper( String s,List<String> wordList,Map<String,Boolean> map) {
        if ( s.length() == 0) {
            return true;
        }

        if ( map.containsKey(s) ) return map.get(s);

        for (String i:wordList) {

            if ( s.length() >= i.length() && i.equals( s.substring(0,i.length()) ) ) {
               if ( helper(s.substring( i.length() ),wordList,map) ) {
                   map.put(s,true);
                   return true;
               }
            }
        }
        map.put(s,false);
        return false;
    }
}
