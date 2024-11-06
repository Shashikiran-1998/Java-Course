package DSAArlgoProblems.trees;

public class constructArrayLvlOrder {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        insertLevelOrder(arr,0);

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

    public static Node insertLevelOrder(Integer[] arr, int i) {
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
