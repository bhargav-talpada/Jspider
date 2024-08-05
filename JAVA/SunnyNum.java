import java.util.Scanner;

public class SunnyNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = n + 1;
        int c = 0;
        for (int i = 0; i < n1; i++) {
            if (i*i == n1) {
                c++;
            }
        }
        System.out.println(c == 1 ? "Sunny Num" : "Not Sunny Num");
    }
}
