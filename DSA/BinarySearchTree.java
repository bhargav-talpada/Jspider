package DSA;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
    }
}

public class BinarySearchTree {

    public void insert(Node root, int ele){
        if (ele<root.data) {
            if (root.left==null) {
                root.left = new Node(ele);
                System.out.println(ele + " had been inserted left of "+ root.data);
            }
            else{
                insert(root.left, ele);
            }
        }
        else if (ele>root.data) {
            if (root.right==null) {
                root.right = new Node(ele);
                System.out.println(ele + " had been inserted right of "+ root.data);
            }
            else{
                insert(root.right, ele);
            }
        }
    }

    public void preOrder(Node root){
        if (root != null) {
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public void inOrder(Node root){
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
    }

    public void postOrder(Node root){
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {80,45,23,69,142,90,155,48,18,36,86,97,166,99};
        Node root = new Node(arr[0]);
        BinarySearchTree bst = new BinarySearchTree();
        for(int i=1; i<arr.length; i++){
            bst.insert(root, arr[i]);
        }
        System.out.println("==================================");
        System.out.print("Pre Order --> ");bst.preOrder(root);
        System.out.println();
        System.out.print("In Order --> ");bst.inOrder(root);
        System.out.println();
        System.out.print("Post Order --> ");bst.postOrder(root);
    }
}