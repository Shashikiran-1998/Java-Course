package DSAArlgoProblems.Bactracking;

import java.util.ArrayList;
import java.util.List;

public class generatePowerset {

    public static void main(String[] args) {
        int[] a = {3,1,2};
        List<Integer> ans = new ArrayList<>();
        recursivePowerset(a,0,ans);
    }

    private static void recursivePowerset(int[] a, int i, List<Integer> ans) {
        // Base case: if the index reaches the length of the array, print the current subset
        if (i == a.length) {
            System.out.println(ans);
            return;
        }

        // Include the current element (a[i]) in the subset
        ans.add(a[i]);
        // Recursive call to process the next element
        recursivePowerset(a, i + 1, ans);
        // Remove the current element after processing it
        ans.remove(ans.size() - 1);

        // Exclude the current element and proceed with the next
        recursivePowerset(a, i + 1, ans);
    }
}
