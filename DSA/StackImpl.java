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

    public static void display(){
        System.out.println("========= stack data =============");
        if (top == -1) {
            System.out.println("stack is empty");
        }
        else{
            for(int i=top; i>=0; i--){
                System.out.println(stack[i]);
            }
        }
        System.out.println("======================================");
    }

    public static void pop(){
        if (top == -1) {
            System.out.println("stack underFlow error....!");
        }
        else{
            System.out.println(stack[top] + " had been deleted...");
            stack[top] = 0;
            top--;
        }
    }

    public static int peek(){
        if (top == -1) {
            return -1;
        }
        else{
            return stack[top];
        }
    }

    public static int isEmpty(){
        return top = -1;
    }

    public static boolean isFull(){
        return top == stack.length-1;
    }

    public static void clear(){
        System.out.println("All data had been deleted...");
        top = -1;
    }

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of stack : ");
        int size = sc.nextInt();
        stackCreation(size);
        while (true) {
            System.out.println("===== Menu =====");
            System.out.println("1.Push\n2.Pop\n3.Display\n4.Peek\n5.Clear\n6.isEmpty\n7.isFull\n8.Exit");
            System.out.println("Enter Your Option :- ");
            int op = sc.nextInt();
            switch (op) {
                case 1: 
                    System.out.println("Enter the element : ");
                    int ele = sc.nextInt();
                    push(ele);
                break;
                case 2: pop(); break;
                case 3: display(); break;
                case 4: System.out.println(peek()); break;
                case 5: clear(); break;
                case 6: System.out.println(isEmpty()); break;
                case 7: System.out.println(isFull()); break;
                case 8: System.out.println("Thank You...!!"); System.exit(0);
                default: System.out.println("Invalid Operation..."); break;
            }
        }

    }
}