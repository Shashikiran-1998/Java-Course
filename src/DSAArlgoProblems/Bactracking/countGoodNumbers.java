//package DSAArlgoProblems.Bactracking;
//
//public class countGoodNumbers {
//
//    public static void main(String[] args) {
//        long q = 3;
//        StringBuilder beg = new StringBuilder();
//
//        for(int i=0;i<q;i++) {
//            beg.append('0');
//        }
//
//
//    }
//
//    public static int goodNumbers(StringBuilder s,int index) {
//        if(index == s.length()) {
//            return 0;
//        }
//        int temp = s.charAt(index) - '0';
//
//        if( index % 2 == 0 ) {
//            char c = (char)(s.charAt(index) + 2);
//            s.setCharAt(index, c);
//
//            if( temp != 8 ) {
//                return 1 + goodNumbers(s,index);
//            } else {
//                return 1 + goodNumbers(s,index+1);
//            }
//        } else {
//
//        }
//
//    }
//
//
//}
