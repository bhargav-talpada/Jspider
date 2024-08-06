// Sum of Factorial number of each digit of given num is eqaul to original number is a Strong num...

import java.util.Scanner;

public class StrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rem = 0, sum = 0;
        int fact = 1;
        int n1 = n;
        while (n!=0) {
            rem = n % 10;
            for(int i=1; i<=rem; i++){
                fact = fact * i;
            }
            sum = sum + fact;
            n = n / 10;
            fact = 1;
        }
        System.out.println(n1 == sum ? "Strong Num" : "Not a Strong Num");
    }
}
