import java.util.Scanner;

public class Exscanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num :-");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Text :-");
        String s = sc.nextLine();
        System.out.println("Text : "+ s);
        System.out.println("Num : "+ n);
    }
}
