import java.util.Scanner;

public class FunRecursion {

    public static void RecName(int n){
        if (n>=1) {
            System.out.println(n+" - Bhargav");
            RecName(n-1);
        }
    }

    static int n1=0,n2=1,n3=0;    
    static void printFibonacci(int count){    
       if(count>0){    
           n3 = n1 + n2;    
           System.out.print(" "+n3);   
            n1 = n2;    
            n2 = n3;    
            printFibonacci(count-1);    
        }    
    } 
    public static void main(String[] args) {
        // RecName(10);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(n1+" "+n2);
        printFibonacci(n-2);//n-2 because 2 numbers are already printed 
    }
}
