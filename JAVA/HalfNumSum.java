import java.util.Scanner;

public class HalfNumSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rem, sum = 0, c = 0;
        int newNum = n;
        while (n!=0) {
            rem = n % 10;
            c++;
            n = n / 10;
        }
        int newC = c / 2;
        int firstPart = newNum / (int)Math.pow(10, newC);
        int lastPart = newNum % (int)Math.pow(10, newC);
        sum = firstPart + lastPart;
        System.out.println(sum);
    }
}
