package DSAArlgoProblems.Stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class maxOfSlidingWindow {
    public static void main(String[] args) {
        int[] arr = {1,-1};
        int k=1;
        System.out.println(Arrays.toString(firstSolution(arr,k)));
    }

    public static int[] firstSolution(int[] arr,int k) {
       /// Add at bottom of stack if current is small
        // pop all elemnents from bottom if current > bottom element
        // top is bigger and is in descending order
        // remove the elements from top if it does not lie in window

        Deque<Integer> dq = new ArrayDeque<>();
        int l=0;
        int[] ans = new int[arr.length - k + 1];
        for (int i=0;i < arr.length;i++) {


            while( !dq.isEmpty() && arr[i] > arr[dq.peekLast()]) {
                dq.removeLast();
            }


            while ( !dq.isEmpty() &&  dq.peekFirst() <= i - k) {
                dq.removeFirst();
            }

            dq.addLast(i);
            // everything will be processed you're just adding here

            if( i >= k  - 1 ) {
                ans[l++] = dq.isEmpty() ? -1 : arr[dq.peekFirst()];
            }

        }

        return ans;
    }
}
