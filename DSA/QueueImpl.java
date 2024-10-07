package DSA;

import java.util.Scanner;

public class QueueImpl {
    static int[] queue;
    static int front, rear;

    public static void CreateQueue(int size){
        queue = new int[size];
        front = 0;
        rear = 0;
        System.out.println("Queue had been created with size "+ size);
    }

    public static void enQueue(int ele){
        if (rear == queue.length) {
            System.out.println("Queue is full...");
        }
        else{
            queue[rear] = ele;
            rear++;
            System.out.println(ele+" had been inserted inside queue");
        }
    }

    public static void display(){
        System.out.println("============ Queue data ================");
        if (rear == front) {
            System.out.println("Queue is empty...");
        }
        else{
            for(int i=front; i<rear; i++){
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
        System.out.println("========================================");
    }

    public static void deQueue(){
        if (rear == front) {
            System.out.println("Queue is empty...");
        }
        else{
            System.out.println(queue[front]+" had been deleted...");
            for(int i=front; i<rear-1; i++){
                queue[i] = queue[i+1];
            }
            rear--;
        }
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter size of queue : ");
        // int size = sc.nextInt();
        // CreateQueue(size);
        // display();
        // for(int i=0; i<queue.length; i++){
        //     System.out.println("Enter queue element : ");
        //     int ele = sc.nextInt();
        //     enQueue(ele);
        // }
        // display();
        // deQueue();
        // display();
        // deQueue();
        // display();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of stack : ");
        int size = sc.nextInt();
        CreateQueue(size);
        while (true) {
            System.out.println("===== Menu =====");
            System.out.println("1.Enqueue\n2.Dequeue\n3.Display\n4.Exit");
            System.out.println("Enter Your Option :- ");
            int op = sc.nextInt();
            switch (op) {
                case 1: 
                    System.out.println("Enter the element : ");
                    int ele = sc.nextInt();
                    enQueue(ele);
                break;
                case 2: deQueue(); break;
                case 3: display(); break;
                case 4: System.out.println("Thank You...!!"); System.exit(0);
                default: System.out.println("Invalid Operation..."); break;
            }
        }
    }
}
