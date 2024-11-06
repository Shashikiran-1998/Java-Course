package DSAArlgoProblems.Bactracking;

import java.util.Stack;

public class reverseStack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(5);
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        reverse(s);
        System.out.println( s );
    }

    private static void reverse( Stack<Integer> s) {
        if( s.isEmpty() ) {
            return;
        }
        Integer temp = s.pop();
        reverse(s);
        
    }
}
