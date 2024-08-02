import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = sc.nextInt();
        int rem = 0;
        int sum = 0;
        while (n!=0) {
            rem = n % 10;
            System.out.print(rem);
            sum = sum + rem;
            n = n / 10;
        }
        System.out.println(sum);
    }
}
