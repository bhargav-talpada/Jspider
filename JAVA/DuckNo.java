import java.util.Scanner;

/**
 * Duck No : It must contains zero as a digit that number as called as Duck No.
 */
public class DuckNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0, rem = 0;
        while (n!=0) {
            rem = n % 10;
            if (rem == 0) {
                c++;
            }
            n = n / 10;
        }
        System.out.println(c);
        System.out.println(c>=1 ? "Duck No" : "Not a Duck No");
    }
}