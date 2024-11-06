package DSAArlgoProblems.trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class iterativePreorder {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8};
        Node root = insertLevelOrder(arr,0);

        // iterativePreorder(root);

        List<Integer> ans = new ArrayList<>();

        iterativeInorder(root,ans);

        System.out.println( ans );


    }

    public static void iterativePreorder(Node root) {

        Stack<Node> st = new Stack<>();
        st.push( root );

        while ( !st.isEmpty() ) {

           Node temp =  st.pop();
           System.out.println(temp.data);

           if ( temp.right != null ) {
               st.push( temp.right );
           }

            if ( temp.left != null ) {
                st.push( temp.left );
            }
        }

    }

    public static void iterativeInorder(Node root, List<Integer> ans) {

        Stack<Node> st = new Stack<>();
        st.push( root );

        while ( !st.isEmpty() ) {

            Node temp = st.peek();

            if ( temp.left != null ) {
                st.push( temp.left );
            } else {
               Node t = st.pop();
               ans.add( t.data );
               st.push(t.right);
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
