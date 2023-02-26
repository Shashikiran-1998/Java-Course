package DSAArlgoProblems.Bactracking;

public class sudukoSolver {

    private static void sudukoSolve(int[][] q, int row, int col) {
        if(row == q.length - 1 && col == q.length - 1) {
            System.out.println("Yes");
            return;
        }
        int rowNew = 0;
        int columNew = 0;
        rowNew=row;
        columNew=col +1;
        if(columNew > q.length - 1){
            rowNew=rowNew+1;
            columNew=0;
        }
        if(q[row][col] != 0){
            sudukoSolve(q,rowNew,columNew);
            return;
        }

        for(int i=1;i<10;i++){
            if(isValid(q,row,col,i)){
                q[row][col] = i;
                sudukoSolve(q,rowNew,columNew);
                q[row][col] = 0;
            }
        }
    }

    private static boolean isValid(int[][] q, int row, int col,int i) {
         if(row > q.length -1 || col > q.length -1 || row < 0 || col < 0){
             return false;
         }
         // row  and col wise check
         for(int j=0;j<9;j++){
            if(q[row][j] == i) {
                return false;
            }
             if(q[j][col] == i) {
                 return false;
             }
         }

         // block check
        int blockNumberRow= row/3;// start will blockNumberRow * 3
        int blockNumberCol= col/3;
        for(int k=0;k<3;k++){
            for (int l=0;l<3;l++){
               if(q[blockNumberRow * 3 + k][blockNumberCol * 3 + l] == i){
                   return false;
               }
            }
        }
         return true;

    }

    public static void main(String[] args) {
        // 9 4 1 3 2 6 7 5 8
        int[][] q = {
                {9, 0, 0 ,0 ,2 ,0, 7, 5, 0},
                {6, 0, 0 ,0 ,5 ,0, 0, 4, 0},
                {0, 2, 0 ,4 ,0 ,0, 0, 1, 0},
                {2, 0, 8 ,0 ,0 ,0, 0, 0, 0},
                {0, 7, 0 ,5 ,0 ,9, 0, 6, 0},
                {0, 0, 0 ,0 ,0 ,0, 4, 0, 1},
                {0, 1, 0 ,0 ,0 ,5, 0, 8, 0},
                {0, 9, 0 ,0 ,7 ,0, 0, 0, 4},
                {0, 8, 2 ,0 ,4 ,0, 0, 0, 6},
        };
//        int[][] q={ {3, 0, 6, 5, 0, 8, 4, 0, 0},
//                {5, 2, 0, 0, 0, 0, 0, 0, 0},
//                {0, 8, 7, 0, 0, 0, 0, 3, 1},
//                {0, 0, 3, 0, 1, 0, 0, 8, 0},
//                {9, 0, 0, 8, 6, 3, 0, 0, 5},
//                {0, 5, 0, 0, 9, 0, 6, 0, 0},
//                {1, 3, 0, 0, 0, 0, 2, 5, 0},
//                {0, 0, 0, 0, 0, 0, 0, 7, 4},
//                {0, 0, 5, 2, 0, 6, 3, 0, 0} };
        sudukoSolve(q,0,0);
    }


}
