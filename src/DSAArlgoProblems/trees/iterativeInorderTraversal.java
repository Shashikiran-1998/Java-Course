package DSAArlgoProblems.trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class iterativeInorderTraversal {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};
        Node root = insertLevelOrder(arr,0);

        iterativeInorderTraversal(root,new ArrayList<>());
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

    public static void iterativeInorderTraversal(Node root, List<Integer> result) {
        Stack<Node> stack = new Stack<>();
        Node current = root;

        while (current != null || !stack.isEmpty()) {
            // Traverse to the leftmost node
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            // Process the node
            current = stack.pop();
            result.add(current.data);

            // Move to the right subtree
            current = current.right;
        }
    }

}
