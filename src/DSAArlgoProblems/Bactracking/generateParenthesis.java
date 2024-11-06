package DSAArlgoProblems.Bactracking;

public class generateParenthesis {

    public static void main(String[] args) {
        int n = 3;
        generate("(",n,1,0);
    }

    public static void generate(String s,int n,int i,int j) {
        if ( i + j == 2 * n ) {
            if ( i == j) {
                System.out.println(s);
            }
            return;
        }

        if ( j < n  && i > j ) {
            generate(s+")",n,i,j+1);
        }

        if ( i < n    ) {
            generate(s + "(", n, i + 1, j);
        }

    }
}
