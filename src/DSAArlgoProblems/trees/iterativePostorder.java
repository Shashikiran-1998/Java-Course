package DSAArlgoProblems.trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import static DSAArlgoProblems.trees.constructArrayLvlOrder.insertLevelOrder;

public class iterativePostorder {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        Node root = insertLevelOrder(arr,0);

        iterativePostorderTraversal(root,new ArrayList<>());
    }

    public static void iterativePostorderTraversal(Node root, List<Integer> result) {
        if (root == null) return;

        Stack<Node> stack = new Stack<>();
        Node current = root;
        Node lastVisited = null;

        while (current != null || !stack.isEmpty()) {
            // Go as far left as possible
            if (current != null) {
                stack.push(current);
                current = current.left;
            } else {
                Node peekNode = stack.peek();
                // If the right child exists and was not visited, traverse it
                if (peekNode.right != null && lastVisited != peekNode.right) {
                    current = peekNode.right;
                } else {
                    // Visit the node
                    stack.pop();
                    result.add(peekNode.data);
                    lastVisited = peekNode;
                }
            }
        }
    }


}
