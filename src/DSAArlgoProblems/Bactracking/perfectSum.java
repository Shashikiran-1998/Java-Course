package DSAArlgoProblems.Bactracking;

import java.util.ArrayList;
import java.util.List;

public class perfectSum {

    public static void main(String[] args) {

        int[] arr = {5, 2, 3, 10, 6, 8};
        int k = 10;
        List<Integer> ans = new ArrayList<>();
        System.out.println( recursiveHelper1(arr,0,0,k,ans) );
    }

    public static void recursiveHelper(int[] arr, int ind, int currentSum, int targetSum, List<Integer> count) {
        // Base case: if we've gone through all elements
        if (ind == arr.length) {
            // If the current sum is equal to the target sum, count this subset
            if (currentSum == targetSum) {
                count.add(1); // Adding a marker to count the valid subset
            }
            return;
        }

        // Include the current element in the subset
        recursiveHelper(arr, ind + 1, currentSum + arr[ind], targetSum, count);

        // Exclude the current element from the subset
        recursiveHelper(arr, ind + 1, currentSum, targetSum, count);
    }

    public static int recursiveHelper1(int[] arr, int ind, int currentSum, int targetSum, List<Integer> count) {
        // Base case: if we've gone through all elements
        if (ind == arr.length) {
            // If the current sum is equal to the target sum, count this subset
            if (currentSum == targetSum) {
                count.add(1); // Adding a marker to count the valid subset
            }
            return 0;
        }

        // Include the current element in the subset
        int includes = recursiveHelper1(arr, ind + 1, currentSum + arr[ind], targetSum, count);

        // Exclude the current element from the subset
        int excludes = recursiveHelper1(arr, ind + 1, currentSum, targetSum, count);
        return includes + excludes;
    }
}
