import java.util.Scanner;

public class FactorialNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        int c = 0;
        for(int i=1; i<=n; i++){
            if (n%i==0) {
                System.out.print(i+" ");
                c++;
            }
        }
        System.out.println("");
        System.out.println("Factorial Count is : "+ c);
    }    
}