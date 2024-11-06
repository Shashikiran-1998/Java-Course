package DSAArlgoProblems.Stack;

import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollision {

    public static void main(String[] args) {
        int[] arr = {-2,2,1,-2};
        System.out.println(Arrays.toString( solution(arr) ) );
    }

    private static int[] solution( int[] arr ) {
        Stack<Integer> st = new Stack<>();

        for (int current : arr) {

            while (!st.isEmpty() && current < 0 && st.peek() > 0) {
                // collision
                if( current > st.peek() ) {
                    st.pop();
                } else if(current == st.peek()) {
                    st.pop();
                    current = 0;
                } else {
                    current=0;

                }
            }
            if(current != 0) {
                st.push(current);
            }
        }
        return stackToIntArray(st);
    }

    public static int[] stackToIntArray(Stack<Integer> stack) {
        // Convert the Stack to an array of Integer
        Integer[] tempArray = stack.toArray(new Integer[0]);

        // Create an int array of the same length
        int[] intArray = new int[tempArray.length];

        // Copy the elements from the Integer array to the int array
        for (int i = 0; i < tempArray.length; i++) {
            intArray[i] = tempArray[i];
        }

        // Return the int array
        return intArray;
    }
}
