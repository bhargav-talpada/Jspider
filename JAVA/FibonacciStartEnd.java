import java.util.Scanner;

public class FibonacciStartEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting point: ");
        int start = sc.nextInt();
        System.out.print("Enter the ending point: ");
        int end = sc.nextInt();
        int n1 = 0, n2 = 1;
        int n3;
        while (n1 <= end) {
            if (n1 >= start) {
                System.out.print(n1 + " ");
            }
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
    }
}
