package DSAArlgoProblems.Stack;

import java.util.Stack;

public class RemoveKdigits {

    public static void main(String[] args) {
        String digit = "143219";
        int k = 3;
        System.out.println(solution(digit,k));
    }

    private static String solution(String digits, int k) {
        Stack<Character> digitSt = new Stack<>();

        for(Character digit : digits.toCharArray()) {
            while (!digitSt.empty() && digit < digitSt.peek() && k > 0 ) {
                digitSt.pop();
                k--;
            }
            digitSt.push(digit);
        }

        while(k>0) {
            digitSt.pop();
            k--;
        }
        StringBuilder ans= new StringBuilder();
        while (!digitSt.empty()) {
            Character t = digitSt.pop();
             ans.insert(0, t);
        }
        // Remove leading zeros
        while (ans.length() > 0 && ans.charAt(0) == '0') {
            ans.deleteCharAt(0);
        }
        if(ans.toString().equals("")) return "0";
        return ans.toString();
    }
}
