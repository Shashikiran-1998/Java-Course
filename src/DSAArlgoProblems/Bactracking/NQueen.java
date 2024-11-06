package DSAArlgoProblems.Bactracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueen {

    public static void main(String[] args) {
        int n = 4;
        char[][] chessBoard = new char[n][n];
        List<List<String>> results = new ArrayList<>();
        findQueen(chessBoard, 0, n, results);

    }


    public static void findQueen(char[][] chessBoard, int row, int n, List<List<String>> results) {
        // Base case: if all queens are placed
        if (row == n) {
            results.add(constructSolution(chessBoard, n));  // Add the solution
            return;
        }

        // Try placing a queen in all columns of the current row
        for (int col = 0; col < n; col++) {
            if (isAllowed(chessBoard, row, col, n)) {
                chessBoard[row][col] = 'Q';  // Place the queen
                findQueen(chessBoard, row + 1, n, results);  // Recurse to next row
                chessBoard[row][col] = '.';  // Backtrack by removing the queen
            }
        }
    }

    // Method to check if placing a queen is allowed at (row, col)
    private static boolean isAllowed(char[][] chessBoard, int row, int col, int n) {
        // Check the column for any queens
        for (int i = 0; i < row; i++) {
            if (chessBoard[i][col] == 'Q') {
                return false;
            }
        }

        // Check the top-left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (chessBoard[i][j] == 'Q') {
                return false;
            }
        }

        // Check the top-right diagonal
        for (int i = row, j = col; i >= 0 && j < n; i--, j++) {
            if (chessBoard[i][j] == 'Q') {
                return false;
            }
        }

        return true;  // Position is safe
    }

    // Method to construct the solution as a list of strings
    private static List<String> constructSolution(char[][] chessBoard, int n) {
        List<String> solution = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            solution.add(new String(chessBoard[i]));  // Convert each row to a string and add to the solution
        }
        return solution;
    }
}
