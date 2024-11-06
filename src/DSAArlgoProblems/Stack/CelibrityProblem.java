package DSAArlgoProblems.Stack;

import java.util.Stack;

public class CelibrityProblem {

    public static void main(String[] args) {
        int[][] q = {
                {0,1,0},
                {0,0,0},
                {0,1,0} };
      System.out.println(optimisedSol(q));
    }

    private static int bruteForce(int[][] q) {
        int[] theyKnow = new int[q.length];
        int[] iKnow = new int[q.length];
        // For him to be celebrity theyNow be must be n - 1 (as him knowing himself wont count)
        // and iKnow must be 0

        for( int i=0;i<q.length;i++) {
            for(int j=0;j<q.length;j++) {
                if(q[i][j] == 1) {
                    theyKnow[j] = theyKnow[j] + 1;
                    iKnow[i] = iKnow[i] + 1;
                }
            }
        }

        for (int i=0;i<q.length;i++) {
            if(theyKnow[i] == q.length - 1 && iKnow[i] == 0) {
                return i;
            }
        }
        return -1;
    }

    private static int stackBasedSolution(int[][] q) {
        // you put n numbers in stack then pop 2 at a time and check if either knows each other
        //Only 1 celebrity can be there as if there are 2 celebrities either of them should know each other or else they are not celebrity

        Stack<Integer> st = new Stack<>();

        for(int i=0;i<q.length;i++) {
            st.push(i);
        }

        while (!st.empty() && st.size() > 1) {
            int first = st.pop();
            int second = st.pop();

            if( q[first][second] == 1 ) {
                st.push(second);
            } else {
                st.push(first);
            }
        }

        int celeb = st.pop();

        // Verify Celebrity

        for (int i=0;i<q.length;i++) {
            if(q[celeb][i] == 1) return -1;
        }

        for (int i=0;i<q.length;i++) {
            if(q[i][celeb] == 0 && celeb != i) return -1;
        }

        return celeb;
    }

    private static int optimisedSol(int[][] q) {
        // you put n numbers in stack then pop 2 at a time and check if either knows each other
        //Only 1 celebrity can be there as if there are 2 celebrities either of them should know each other or else they are not celebrity

        int i = 0;
        int j = q.length - 1;
        while ( i < j) {
          if( q[i][j] == 1) {
              i++;
            } else {
              j--;
          }
        }

        int celeb = i;

        // Verify Celebrity

        for (int i1=0;i1<q.length;i1++) {
            if(q[celeb][i1] == 1) return -1;
        }

        for (int i1=0;i1<q.length;i1++) {
            if(q[i1][celeb] == 0 && celeb != i1) return -1;
        }

        return celeb;
    }
}
