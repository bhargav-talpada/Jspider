import java.util.Scanner;

public class NumPow {

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
        int Power = power(n, ex);
        System.out.println("Power of "+n+" is a "+Power);
    }
}
