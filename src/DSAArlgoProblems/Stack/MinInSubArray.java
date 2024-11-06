package DSAArlgoProblems.Stack;

import java.util.Stack;

public class MinInSubArray {

    public static void main(String[] args) {
        int[] arr = {71,55,82,55};
        System.out.println(optimizedSolution(arr));
    }

    public static int bruteForce(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            int min=Integer.MAX_VALUE;
            for (int j = i; j < arr.length; j++) {
                min = Math.min(min,arr[j]);
                sum = sum+ min;
            }

        }
        return sum;
    }

    private static int optimizedSolution( int[] arr ) {
        // 3,1,2,4
        // we find how much of sub array given element contribute to
        // - 1 - -    -> 1 is contributing from 0th index to last index hence total contribution from 1 -> 2 * 3 = (1 - 0 + 1) * (4 - 1) = 6
        // 3,1,2,4
        // we add it up
        // Pseudo code
        // for 1 -> N
        // sum =0
        // findPse
        // findNse
        // sum = sum + (findPse - i + 1) * (NSE - i)



        int n = arr.length;
        int sum = 0;
        int[] nse = new int[n];
        int[] pse = new int[n];
        findPse(arr,pse);
        findNse(arr,nse);

        for( int i =0;i<n;i++ ) {
            int temp1 = i - pse[i] ;
            int temp = nse[i] - i ;
            sum = sum + (arr[i] * temp * temp1);
        }
        return sum;
    }

    private static void findPse(int [] arr,int[] ans) {
        Stack<Integer> st = new Stack<>();
        for (int i=0;i<arr.length;i++) {
            int current = arr[i];
            while( !st.empty() && current < arr[st.peek()]) {
                st.pop();
            }

            if(st.empty()) {
               ans[i] = -1;
            } else {
                ans[i] = st.peek();
            }
            st.push(i);
        }
    }

    private static void findNse(int [] arr,int[] ans) {
        Stack<Integer> st = new Stack<>();
        for (int i=arr.length-1;i>=0;i--) {
            int current = arr[i];
            while( !st.empty() && current < arr[st.peek()]) {
                st.pop();
            }

            if(st.empty()) {
                ans[i] = arr.length;
            } else {
                ans[i] = st.peek();
            }
            st.push(i);
        }
    }
}
