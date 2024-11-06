package DSAArlgoProblems.trees;

public class constructTree {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        Node root = new Node(1);


    }

    public void constructTree1(Node root,Node head,int[] arr,int ind) {
        if ( ind == arr.length ) return;
        Node left = new Node(arr[ind++]);
        Node right = new Node(arr[ind++]);
        head.left = left;
        head.right = right;
        

    }
}

class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
