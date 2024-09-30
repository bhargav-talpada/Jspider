package DSA;

import java.util.Scanner;

public class BracketBalancing {

    static char[] stack;
    static int top = -1;

    public static void push(char ele){
        top++;
        stack[top] = ele;
    }

    public static void pop(){
        top--;
    }
    public static void main(String[] args) {
        String str = "((()))";
        stack = new char[str.length()];
        boolean flag = true;
        for(int i=0; i<str.length(); i++){
            if (str.charAt(i) == '(') {
                push('(');
            }
            else if (str.charAt(i) == ')' && top != -1) {
                pop();
            }
            else if (str.charAt(i) == ')' && top == -1) {
                flag = false; break;
            }
        }
        if (top == -1 && flag == true) {
            System.out.println("balanced...");
        }
        else{
            System.out.println("unbalanced...");
        }
    }
}
