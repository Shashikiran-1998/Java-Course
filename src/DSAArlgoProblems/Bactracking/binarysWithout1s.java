package DSAArlgoProblems.Bactracking;

public class binarysWithout1s {

    public static void main(String[] args) {
        int n = 4;
        String s = "";
        solution( s, n,0);
    }

   public static void solution(String s,int n,int i) {
        //base
       if ( n == i ) {
           System.out.println(s+" -");
           return;
       }

       solution(s+"0",n,i+1);

       if (s.isEmpty() || s.charAt( s.length() - 1) == '0')
          solution(s+"1",n,i+1);
    }
}
