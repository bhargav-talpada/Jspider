import java.util.Scanner;

public class FactorialSumDigit {
    
    public static int factorial(int r){
        int i = 1;
        int factor = 1;
        while (i<=r) {
            factor = factor * i;
            i++;
        }
        return factor;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num : ");
        int n = sc.nextInt();
        int n1 = n;
        int rem, sum = 0;
        while (n!=0) {
            rem = n % 10;
            sum = sum + factorial(rem);
            n = n / 10;
        }
        System.out.println(sum);
        System.out.println(sum == n1 ? "Strong Num" : "No Strong Num");
    }
}
