import java.util.*;

public class While1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N : ");
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;

        while (i<=n) {
            sum = sum + i;
            i++;
        }
        System.out.print(sum);
    }    
}