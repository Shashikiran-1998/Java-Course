package DSAArlgoProblems.Bactracking;

import java.util.Arrays;

public class expressionAndOper {

    public static void main(String[] args) {
        String num = "123";  // Example input
        int target = 6;       // Example target
        helper(num, "", target, 0, 0);
    }

    public static void helper(String s, String temp, int target, int currentTarget, int ind) {
        // Base case: if we've reached the end of the string
        if (ind == s.length()) {
            // If currentTarget matches the target, print the expression
            if (currentTarget == target) {
                System.out.println(temp);
            }
            return;
        }

        // Loop through the digits, treating each digit one by one
        for (int i = ind; i < s.length(); i++) {
            // Get the current number as a substring from ind to i+1
            String currentNumStr = s.substring(ind, i + 1);
            int currentNum = Integer.parseInt(currentNumStr);

            // For the first number, we don't add any operator in front of it
            if (ind == 0) {
                helper(s, temp + currentNumStr, target, currentNum, i + 1);
            } else {
                // Add '+' operator
                helper(s, temp + "+" + currentNumStr, target, currentTarget + currentNum, i + 1);

                // Add '-' operator
                helper(s, temp + "-" + currentNumStr, target, currentTarget - currentNum, i + 1);

                // Add '*' operator
                helper(s, temp + "*" + currentNumStr, target, currentTarget * currentNum, i + 1);
            }
        }
    }



}
