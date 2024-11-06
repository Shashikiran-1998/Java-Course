package DSAArlgoProblems.Bactracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ratInMaze2 {
    public static void main(String[] args) {
        int[][] q={
                {1,0},
                {1,0},
        };
        // Corrected initialization of visitedArray
        int[][] visitedArray = new int[q.length][q[0].length];
        List<String> ans = new ArrayList<>();
        findPath2(q, 0, 0, q.length, q[0].length, visitedArray, ans, "");
        System.out.println(ans);
    }

    private static void findPath2(int[][] q, int row, int col, int rowLen, int colLen, int[][] visitedArray, List<String> ans, String s) {
        // Base case: Reached the bottom-right corner
        // Check if the current cell is allowed
        if (!isAllowed(q, row, col, rowLen, colLen, visitedArray)) {
            return;
        }
        
        if (row == rowLen - 1 && col == colLen - 1) {
            ans.add(s);
            return;
        }



        // Mark the current cell as visited
        visitedArray[row][col] = 1;

        // Go right
        s = s + 'R';
        findPath2(q, row, col + 1, rowLen, colLen, visitedArray, ans, s);
        s = s.substring(0, s.length() - 1);

        // Go down
        s = s + 'D';
        findPath2(q, row + 1, col, rowLen, colLen, visitedArray, ans, s);
        s = s.substring(0, s.length() - 1);

        // Go up
        s = s + 'U';
        findPath2(q, row - 1, col, rowLen, colLen, visitedArray, ans, s);
        s = s.substring(0, s.length() - 1);

        // Go left
        s = s + 'L';
        findPath2(q, row, col - 1, rowLen, colLen, visitedArray, ans, s);
        s = s.substring(0, s.length() - 1);

        // Unmark the current cell before backtracking
        visitedArray[row][col] = 0;
    }

    // Helper function to check if the current cell is valid for traversal
    private static boolean isAllowed(int[][] q, int row, int col, int rowLen, int colLen, int[][] visitedArray) {
        // Check if row and col are within bounds, and if the cell is passable (1) and not visited
        return row >= 0 && col >= 0 && row < rowLen && col < colLen && visitedArray[row][col] == 0 && q[row][col] == 1;
    }
}
