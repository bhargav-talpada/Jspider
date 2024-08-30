import java.util.Scanner;

public class NumToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rem = 0;
        String str = "";
        String[] arr = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Night"};
        while (n != 0) {
            rem = n % 10;
            str = arr[rem] + str;
            n = n / 10;
        }
        System.out.println(str);
    }
}