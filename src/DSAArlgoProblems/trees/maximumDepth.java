package DSAArlgoProblems.trees;

import static DSAArlgoProblems.trees.constructArrayLvlOrder.insertLevelOrder;

public class maximumDepth {

    public static void main(String[] args) {
        Integer[] arr = {3,9,20,null,null,15,7};
        Node root = insertLevelOrder(arr,0);

        System.out.println( depthTraversal(root,0));



    }

    public static int depthTraversal( Node tree, int level ) {
        if ( tree == null ) return 0;

       int leftHeight = depthTraversal( tree.left , level + 1) ;
       int rightHeight = depthTraversal( tree.right , level + 1) ;
       return Math.max(leftHeight,rightHeight) + 1;
    }
}
