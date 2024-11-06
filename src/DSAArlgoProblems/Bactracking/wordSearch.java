package DSAArlgoProblems.Bactracking;

import java.util.Arrays;

public class wordSearch {

    public static void main(String[] args) {
        Character[][] c = {{ 'A','B','C','E'}, {'S','F','C','S'},{'A','D','E','E'}};
        String searchWord = "SEE";
        int rowLen = c.length;
        int colLen = c[0].length;
        for(int i=0;i<rowLen;i++) {
            for (int j=0;j<colLen;j++) {
                int[][] visit = new int[rowLen][colLen];
                if ( c[i][j] == searchWord.charAt(0)) {
                    searchWord(c,i,j,rowLen,colLen,visit,searchWord,0);
                }
            }
        }
    }

    public static boolean searchWord( Character[][] c, int row, int col, int rowLen,int colLen,int[][] visited,String s,int ind ) {
        //base case
        //
        if ( ind == s.length()  )  {
            return true;
        }

       if ( !isAllowed(c,row,col,rowLen,colLen,visited,s,ind) ) {
           return false;
       }


        if (  s.charAt(ind) != c[row][col] ) {
            return false;
        }
       visited[row][col] = 1;

        boolean found =
       // Go Left
        searchWord(c,row,col - 1,rowLen,colLen,visited,s,ind + 1) ||
        // Go Right
        searchWord(c,row,col + 1,rowLen,colLen,visited,s,ind + 1) ||
        // Go Up
        searchWord(c,row - 1,col,rowLen,colLen,visited,s,ind + 1) ||
        // Go Down
        searchWord(c,row + 1,col,rowLen,colLen,visited,s,ind + 1) ;

        visited[row][col] = 0;
        return found;
    }

    private static boolean isAllowed(Character[][] c, int row, int col, int rowLen, int colLen, int[][] visited, String s, int ind) {
        return row >= 0 && col >= 0 &&  row < rowLen && col < colLen && visited[row][col] != 1  ;
    }
}
