package DSAArlgoProblems.Bactracking;

import java.util.Stack;

public class sortStack {

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(5);
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        System.out.println( sort(s) );
    }
    public static  Stack<Integer> sort(Stack<Integer> s) {
        // add code here.
        reverse(s);
        return s;
    }

    private static void reverse( Stack<Integer> s) {
        if( s.isEmpty() ) {
            return;
        }
        Integer temp = s.pop();
        reverse(s);
        arrangeInOrder(s,temp);
    }

    private static void arrangeInOrder( Stack<Integer> s, Integer temp) {
         if ( s.isEmpty() || s.peek() >= temp  ) {
             s.push(temp);
             return;
         }
         Integer a = s.pop();
         arrangeInOrder(s,temp);
         s.push(a);
    }


    }
