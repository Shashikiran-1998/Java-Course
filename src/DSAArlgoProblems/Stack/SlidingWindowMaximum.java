package DSAArlgoProblems.Stack;

import java.util.Arrays;
import java.util.Stack;

public class SlidingWindowMaximum {

    public static void main(String[] args) {
        int[] q = {1,3,-1,-3,5,3,6,7};
        int k = 3;

        System.out.println( Arrays.toString( maxSlidingWindow(q,k) ) );
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans = new int[nums.length];
        int[] prevGre = new int[nums.length];
        calculatePrevLargest(nums,prevGre);

        int i = k - 1;
        int j = 0;
        while( i < nums.length ) {

           // if( prevGre[i] > nums[i] && )
        }
        return ans;
    }

    private static void calculatePrevLargest(int[] arr, int[] prevLargestEle) {
        Stack<Integer> st = new Stack<>();
     st.firstElement();
        for (int i=0;i<arr.length;i++) {
            int current = arr[i];
            while (!st.empty() &&  current > st.peek()) {
                st.pop();
            }
            if(st.empty()) {
                prevLargestEle[i] = -1;
            } else {
                prevLargestEle[i] = st.peek();
            }
            st.push(current);
        }
    }
}
