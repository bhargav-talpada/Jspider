// ex - 121 is palindrom num becuase to read num is both side right to left or left to right is same..

import java.util.Scanner;

public class PalindromNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0, rem = 0;
        int n1 = n;
        while (n!=0) {
            rem = n % 10;
            rev = (rev * 10) + rem;
            n = n / 10;
        }
        System.out.println(rev==n1 ? "Palindrom Num" : "Not a Palindrom Num");
    }
}
