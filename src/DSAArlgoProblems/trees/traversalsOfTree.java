package DSAArlgoProblems.trees;

import java.util.ArrayList;
import java.util.List;

public class traversalsOfTree {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        Node root = insertLevelOrder(arr,0);

        List<Integer> inorderAns = new ArrayList<>();

        inorderTraversal(root,inorderAns);

        System.out.println("inorder ans ="+inorderAns);

        List<Integer> preorderAns = new ArrayList<>();

        preOrderTraversal(root,preorderAns);

        System.out.println("preOrder = " + preorderAns);

        List<Integer> postOrderAns = new ArrayList<>();

        postOrderTraversal(root,postOrderAns);

        System.out.println("postOrder = "+ postOrderAns);

    }

    public static void inorderTraversal(Node root, List<Integer> ans) {
        if ( root == null ) return;

        inorderTraversal(root.left,ans);
        ans.add(root.data);
        inorderTraversal(root.right,ans);
    }

    public static void preOrderTraversal(Node root, List<Integer> ans) {
        if ( root == null ) return;

        ans.add(root.data);
        preOrderTraversal(root.left,ans);
        preOrderTraversal(root.right,ans);
    }

    public static void postOrderTraversal(Node root, List<Integer> ans) {
        if ( root == null ) return;

        postOrderTraversal(root.left,ans);
        postOrderTraversal(root.right,ans);
        ans.add(root.data);

    }
//
//    private static void traverse(Node root, List<Integer> inorder, List<Integer> preorder, List<Integer> postorder) {
//        if (root == null) {
//            return;
//        }
//
//        // Pre-order: process root before its children
//        preorder.add(root.data);
//
//        // In-order: process left subtree, root, and then right subtree
//        traverse(root.left, inorder, preorder, postorder);
//        inorder.add(root.data);
//        traverse(root.right, inorder, preorder, postorder);
//
//        // Post-order: process children before the root
//        postorder.add(root.data);
//    }


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
