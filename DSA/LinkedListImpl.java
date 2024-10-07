package DSA;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }
}

public class LinkedListImpl {
    static Node head;
    public static void insert(int ele){
        Node n = new Node(ele);
        if (head == null) {
            head = n;
        }
        else{
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = n;
        }
        System.out.println(ele+" has been inserted...");
    }

    public static void display(){
        System.out.println("================= LinkedList data ==================");
        if (head == null) {
            System.out.println("LinkedList is empty....");
        }
        else{
            Node temp = head;
            while (temp.next != null) {
                System.out.print(temp.data+ " -> ");
                temp = temp.next;
            }
            System.out.println(temp.data);
        }
        System.out.println("====================================================");
    }

    public static void insertFront(int ele){
        Node n = new Node(ele);
        if (head == null) {
            head = n;
        }
        else{
            n.next = head;
            head = n;
        }
        System.out.println(ele+" has been inserted in front...");
    }

    public static void delete(){
        if (head == null) {
            System.out.println("LinkedList is empty...");
        }
        else if (head.next == null) {
            System.out.println(head.data+" had been deleted...");
            head = null;
        }
        else{
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            System.out.println(temp.next.data+" had been deleted...");
            temp.next = null;
        }
    }

    public static void deleteFront(){
        if (head == null) {
            System.out.println("LinkedList is empty....");
        }
        else {
            System.out.println(head.data+" had been deleted....");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        // LinkedListImpl li = new LinkedListImpl();

        Scanner sc = new Scanner(System.in);
            while (true) {
            System.out.println("===== Menu =====");
            System.out.println("1.Insert\n2.InsertFront\n3.Display\n4.Delete\n5.DeleteFront\n6.Exit");
            System.out.println("Enter Your Option :- ");
            int op = sc.nextInt();
            switch (op) {
                case 1: 
                    System.out.println("Enter the element : ");
                    int ele = sc.nextInt();
                    insert(ele);
                break;
                case 2:
                    System.out.println("Enter the element : ");
                    int ele2 = sc.nextInt();
                    insertFront(ele2); break;
                case 3: display(); break;
                case 4: delete(); break;
                case 5: deleteFront(); break;
                case 6: System.out.println("Thank You...!!"); System.exit(0);
                default: System.out.println("Invalid Operation..."); break;
            }
        }

    }
}
