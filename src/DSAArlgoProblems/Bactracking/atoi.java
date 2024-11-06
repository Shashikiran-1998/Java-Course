package DSAArlgoProblems.Bactracking;

public class atoi {

    public static void main(String[] args) {
        String ques = "  -4b13";

        String s = ques.trim();


        // Observation
        // reject empty spaces and 0 at beginning of string
        // if there is sign at beginning use it
        // if there is any character after digit added then break and return

       System.out.println( recursiveApproach( s ) );
    }

    private static int  iterationMethod(String ques) {
            int digit = 0;
            boolean isDigitDetected = false;
            boolean isNegative = false;
            boolean signDetected = false;
            for (Character c : ques.toCharArray()) {
                int temp = c - '0';
                boolean isDigit = temp >= 0 && temp <= 9;
                if( isDigit ) {
                    isDigitDetected = true;
                }


                if ((temp == 0 || c == ' ') && !isDigitDetected && !signDetected) {
                    continue;
                }





                if ((c == '-' || c == '+') && !isDigitDetected && !signDetected) {
                    isNegative = c == '-';
                    signDetected = true;
                    continue;
                }

                if (isDigit && digit > (Integer.MAX_VALUE - temp) / 10) {
                    return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }



                if (isDigit) {
                    digit = (digit * 10) + temp;
                }




                if ( !isDigit  ) {
                    break;
                }

            }

            return isNegative ? -digit : digit;
    }


    private static int recursiveApproach(String s) {
        // Base condition: if the string is empty, return 0
        if (s.length() == 0) {
            return 0;
        }

        // Check if the first character is a '+', skip it and continue parsing
        if (s.charAt(0) == '+') {
            return recursiveApproach(s.substring(1));
        }

        // Check if the first character is a '-', handle negative numbers
        if (s.charAt(0) == '-') {
            return -recursiveApproach(s.substring(1));
        }

        // Convert the first character to a digit and stop if it's not a digit
        int firstChar = s.charAt(0);
        if (firstChar < '0' || firstChar > '9') {
            // Stop parsing on encountering a non-digit character
            return 0;
        }

        // Convert the character to an integer
        int firstDigit = firstChar - '0';

        // Recursive call for the rest of the string and stop at the first non-numeric character
        int temp = recursiveApproach(s.substring(1));

        return (10 * temp) + firstDigit;
    }

//    public int myAtoi(String s) {
//        int digit = 0;
//        boolean isNegative = false;
//        boolean signDetected = false;
//        boolean isDigitDetected = false;
//        int i = 0;
//
//        // Skip leading whitespaces
//        while (i < s.length() && s.charAt(i) == ' ') {
//            i++;
//        }
//
//        // Check if the first character is '+' or '-'
//        if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
//            isNegative = s.charAt(i) == '-';
//            signDetected = true;
//            i++;
//        }
//
//        // Process each character
//        while (i < s.length()) {
//            char c = s.charAt(i);
//            if (c < '0' || c > '9') {  // Stop at the first non-digit character
//                break;
//            }
//
//            int temp = c - '0';
//
//            // Check for overflow before updating the digit
//            if (digit > (Integer.MAX_VALUE - temp) / 10) {
//                return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
//            }
//
//            digit = digit * 10 + temp;
//            isDigitDetected = true;
//            i++;
//        }
//
//        // If no digits were detected, return 0
//        if (!isDigitDetected) {
//            return 0;
//        }
//
//        return isNegative ? -digit : digit;
//    }

}
