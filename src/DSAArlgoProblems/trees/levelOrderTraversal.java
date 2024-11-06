package DSAArlgoProblems.trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class levelOrderTraversal {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12};
        Node root = insertLevelOrder(arr,0);

        levelOrderTraversal(root);

        List<List<Integer>> ans = new ArrayList<>();

        levelOrderTraversal(root,ans);

        System.out.println(ans);

    }

    public static void levelOrderTraversal(Node root,List<List<Integer>> ans) {
        Queue<Node> temp = new ArrayDeque<>();
        temp.add(root);


        while ( !temp.isEmpty() ) {

            int size = temp.size();

            List<Integer> level = new ArrayList<>();

            for (int i = 0 ;i< size;i++) {
                Node t = temp.remove();
                level.add( t.data );
                if ( t.left != null ) {
                    temp.add( t.left );
                }

                if ( t.right != null ) {
                    temp.add( t.right );
                }
            }

            ans.add( level );
        }

    }

    public static void levelOrderTraversal(Node root) {
        Queue<Node> temp = new ArrayDeque<>();
        temp.add(root);
        while ( !temp.isEmpty() ) {


            Node t = temp.remove();
            System.out.println(t.data);
            if ( t.left != null ) {
                temp.add( t.left );
            }

            if ( t.right != null ) {
                temp.add( t.right );
            }


        }
    }

    public static Node insertLevelOrder(int[] arr, int i) {
        if (i >= arr.length) {
            return null;
        }

        Node root = new Node(arr[i]);

        // Recursively assign the left and right children
        root.left = insertLevelOrder(arr, 2 * i + 1);
        root.right = insertLevelOrder(arr, 2 * i + 2);

        return root;
    }
}
