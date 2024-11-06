package DSAArlgoProblems.Bactracking;

public class powerRecursive {

    public static void main(String[] args) {
        double p=0.00001;
        int n = 2147483647;
        System.out.println(powOptimised( p,n ) );
    }

    public static double pow(double p,int n) {
        // o(n) solution will get screwed if n is big
        if( n == 0) {
            return 1;
        }
        if( n < 0) {
            return pow(1/p,-n);
        }
        return p * pow(p,n-1);
    }

    public static double powOptimised(double p,int n) {
        // o(n) solution will get screwed if n is big
        if( n == 0) {
            return 1;
        }
        if (n == Integer.MIN_VALUE) {
            // Special case: handle overflow when flipping the sign of Integer.MIN_VALUE
            p = 1 / p;
            n = Integer.MAX_VALUE; // Use MAX_VALUE and account for extra factor
            return p * powOptimised(p, n); // We multiply by p once more to handle the extra reduction
        }
        if( n < 0) {
            return powOptimised(1/p,-n);
        }
        double half = powOptimised(p,n/2);

        if( n % 2 == 0) {
            return half * half;
        } else {
            return p * half * half;
        }
    }

    public static double pow1(double p, int n) {
        if (n == 0) {
            return 1; // Base case: any number to the power of 0 is 1
        }
        if (n < 0) {
            return pow1(1 / p, -n); // Handle negative exponent
        }

        // Use exponentiation by squaring to reduce recursion depth
        double half = pow1(p, n / 2); // Recursively compute half power

        if (n % 2 == 0) {
            return half * half; // If n is even, result is half * half
        } else {
            return p * half * half; // If n is odd, multiply once more by p
        }
    }

}
