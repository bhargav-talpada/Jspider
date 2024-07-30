import java.util.Scanner;

public class FactNum {
    public static long factorial(long n){
        if(n==0){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num : ");
        long n = sc.nextInt();
        long fact = 1;
        fact = factorial(n);
        System.out.println(fact);
    }
}
