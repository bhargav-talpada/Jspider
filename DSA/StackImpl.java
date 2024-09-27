package DSA;

import java.util.Scanner;

/**
 * StackImpl
 */
public class StackImpl {
    static int[] stack;
    static int top;

    public static void stackCreation(int size){
        stack = new int[size];
        top = -1;
        System.out.println("Stack created with the size " + size);
    }

    public static void push(int ele){
        if (top == stack.length-1) {
            System.out.println("Stack Overflow Error...");
        }
        else{
            top++;
            stack[top] = ele;
            System.out.println(ele + " had been inserted into the stack...");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of stack : ");
        int size = sc.nextInt();
        stackCreation(size);
        while (true) {
            System.out.println("===== Menu =====");
            System.out.println("1.Push\n2.Pop\n3.Display\n4.Pee\n5.Clear\n6.isEmpty\n7.isFull\n8.Exit");
            System.out.println("Enter Your Option :- ");
            int op = sc.nextInt();
            switch (op) {
                case 1: 
                    System.out.println("Enter the element : ");
                    int ele = sc.nextInt();
                    push(ele);
                break;
                case 2: System.out.println("Need"); break;
                case 3: System.out.println("Need"); break;
                case 4: System.out.println("Need"); break;
                case 5: System.out.println("Need"); break;
                case 6: System.out.println("Need"); break;
                case 7: System.out.println("Need"); break;
                case 8: System.out.println("Thank You...!!"); System.exit(0);
                default: System.out.println("Invalid Operation..."); break;
            }
        }


    }
}