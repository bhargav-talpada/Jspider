package DSA;

// sum of tree element from starting point to ending point.......

class Node {
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
    }
}

public class SumofTreeEle {

    static int sum = 0;
    
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

    public static void traversal(Node root, int sp, int ep){
        if (root != null) {
            if (root.data>=sp && root.data<=ep) {
                sum = sum + root.data;
            }
            traversal(root.left, sp, ep);
            traversal(root.right, sp, ep);
        }
    }

    public static void main(String[] args) {
        int[] arr = {80,45,23,69,142,90,155,48,18,36,86,97,166,99};
        Node root = new Node(arr[0]);
        BinarySearchTree bst = new BinarySearchTree();
        for(int i=1; i<arr.length; i++){
            bst.insert(root, arr[i]);
        }
        System.out.println("================================");
        traversal(root, 45, 90);
        System.out.println("Sum : "+ sum);
    }

}
