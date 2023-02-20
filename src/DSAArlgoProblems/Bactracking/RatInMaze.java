package DSAArlgoProblems.Bactracking;

import java.util.Arrays;

public class RatInMaze {

    public static void main(String[] args) {
        int[][] q={
                {1,1,0},
                {1,1,0},
                {1,1,1}
        };
        int[][] visitedArray=new int[q.length][q.length];
//        System.out.println(findPath(q,0,0,visitedArray));
        findPath(q,0,0,visitedArray,true);
    }

    private static boolean findPath(int[][] q,int row,int col,int[][] visitedArray) {
        if( row == q.length - 1 && col == q.length - 1 ){
//            print2DArray(visitedArray);
            return true;
        }

        if(!isValidPath(q,row,col,visitedArray)){
           return false;
        }

        // We go to all four direction we first go right
        visitedArray[row][col]=1;

        // right
        if(findPath(q,row,col+1,visitedArray)){
            return true;
        }

        // left
        if(findPath(q,row,col - 1,visitedArray)){
            return true;
        }

        // up
        if(findPath(q,row - 1,col,visitedArray)){
            return true;
        }

        // down
        if(findPath(q,row + 1,col,visitedArray)){
            return true;
        }
        visitedArray[row][col] = 0;
        return false;
    }

    private static void findPath(int[][] q,int row,int col,int[][] visitedArray,boolean isAllPathRequired) {
        if( row == q.length - 1 && col == q.length - 1 ){
            print2DArray(visitedArray);
            return;
        }

        if(!isValidPath(q,row,col,visitedArray)){
            return;
        }

        // We go to all four direction we first go right
        visitedArray[row][col]=1;

        // down
        findPath(q,row + 1,col,visitedArray,true);

        // right
        findPath(q,row,col+1,visitedArray,true);

        // left
        findPath(q,row,col - 1,visitedArray,true);

        // up
        findPath(q,row - 1,col,visitedArray,true);


        visitedArray[row][col] = 0;
    }

    private static boolean isValidPath(int[][] q,int row,int col,int[][] visitedArray) {
        return row >= 0 && col >= 0 && row < q.length && col < q.length && q[row][col] == 1 && visitedArray[row][col] == 0;
    }

    private static void print2DArray(int[][] q){
        System.out.println("printing Solution");
        q[q.length-1][q.length-1]=1;
        for (int[] i:q){
            System.out.println(Arrays.toString(i));
        }
        q[q.length-1][q.length-1]=0;

    }
}
