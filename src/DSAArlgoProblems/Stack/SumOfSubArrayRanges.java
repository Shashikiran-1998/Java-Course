package DSAArlgoProblems.Stack;

import java.util.Stack;

public class SumOfSubArrayRanges {

    public static void main(String[] args) {
        int[] arr = {1,3,5,1,2,8};
        System.out.println(arr);

    }

    public static int solution(int[] arr) {
        int n = arr.length;
        int[] prevLargestEle = new int[n];
        int[] nextLargestEle = new int[n];
        int[] prevSmallestEle = new int[n];
        int[] nextSmallestEle = new int[n];
        int sum = 0;
        // Sum(largest - smallest) of all sub arrays
        // Sum(largest) - Sum(smallest) -> sum of minimum problem

         // To find sum of Minimum of sub arrays
        // findPse
        // findNse
        // sum = sum + arr[i] (Pse) * (NSE )

        // To find Sum of Maximum of arrays
        // findPLe
        // findNLE
        //  sum = sum + arr[i] (Pse) * (NSE )
        long sumMinSumEle = 0 ;
        long sumMaxSumEle = 0 ;


        calculatePrevLargest(arr,prevLargestEle);
        calculatePrevSmallest(arr,prevSmallestEle);
        calculateNextLargest(arr,nextLargestEle);
        calculateNextSmallest(arr,nextSmallestEle);
        for(int i=0;i<n;i++) {
            sum = sum + (prevLargestEle[i] - nextSmallestEle[i]) + (nextLargestEle[i] - prevSmallestEle[i]);
        }
        return sum;
    }

    private static void calculateNextSmallest(int[] arr, int[] nextSmallestEle) {
        Stack<Integer> st = new Stack<>();

        for (int i=arr.length - 1;i>=0;i--) {
            int current = arr[i];
            while (!st.empty() &&  current < st.peek()) {
                st.pop();
            }
            if(st.empty()) {
                nextSmallestEle[i] = -1;
            } else {
                nextSmallestEle[i] = st.peek();
            }
            st.push(current);
        }
    }

    private static void calculateNextLargest(int[] arr, int[] nextLargestEle) {
        Stack<Integer> st = new Stack<>();

        for (int i=arr.length - 1;i>=0;i--) {
            int current = arr[i];
            while (!st.empty() &&  current > st.peek()) {
                st.pop();
            }
            if(st.empty()) {
                nextLargestEle[i] = -1;
            } else {
                nextLargestEle[i] = st.peek();
            }
            st.push(current);
        }
    }

    private static void calculatePrevSmallest(int[] arr, int[] prevSmallestEle) {
        Stack<Integer> st = new Stack<>();

        for (int i=0;i<arr.length;i++) {
            int current = arr[i];
            while (!st.empty() &&  current < st.peek()) {
                st.pop();
            }
            if(st.empty()) {
                prevSmallestEle[i] = -1;
            } else {
                prevSmallestEle[i] = st.peek();
            }
            st.push(current);
        }
    }

    private static void calculatePrevLargest(int[] arr, int[] prevLargestEle) {
        Stack<Integer> st = new Stack<>();

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
