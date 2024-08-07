import java.util.Scanner;

public class SumPowDigit {
    static int power(int base , int ex){
        int pow = 1;
        for (int i = 1; i <= ex; i++) {
            pow = pow * base;
        }
        return pow;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num : ");
        int n = sc.nextInt();
        System.out.println("Enter Power : ");
        int ex = sc.nextInt();
        int rem = 0, sum = 0;
        while (n!=0) {
            rem = n % 10;
            sum = sum + power(rem, ex);
            n = n / 10;
        }
        System.out.println("sum : "+sum);
    }
}
