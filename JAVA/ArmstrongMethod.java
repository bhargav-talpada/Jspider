import java.util.Scanner;

public class ArmstrongMethod {
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
        int a = n, b = n;
        int rem = 0, sum = 0, c = 0;
        while (a!=0) {
            a = a / 10;
            c++;
        }
        while (n!=0) {
            rem = n % 10;
            sum = sum + power(rem, c);
            n = n / 10;
        }
        if (b == sum) {
            System.out.println("Armstrong Num");
        }
        else{
            System.out.println("Not a Armstrong Num");
        }
    }
}
