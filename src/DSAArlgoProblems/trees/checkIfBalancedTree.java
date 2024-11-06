package DSAArlgoProblems.trees;

import static DSAArlgoProblems.trees.constructArrayLvlOrder.insertLevelOrder;

public class checkIfBalancedTree {

    public static void main(String[] args) {

    Integer[] arr = {3, 9, 20, null, null, 15, 7};
    Node root = insertLevelOrder(arr, 0);

        System.out.println( checkIfBalanced( root,0) );

}

    public static boolean checkIfBalanced( Node tree, int level ) {
        if ( tree == null ) return true;

        if ( !checkIfBalanced( tree.left , level + 1) )  {
            return false;
        }
        if ( !checkIfBalanced( tree.right , level + 1) )  {
            return false;
        }

        int diffHeigh = Math.abs( rightHeight - leftHeight);
        return diffHeigh <= 1;
    }

}
