import java.util.Scanner;

public class WhileL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N : ");
        int n = sc.nextInt();
        int i = 1;
        int factor = 1;

        while (i<=n){
            factor = factor * i;
            i++;
        }      
        System.out.println(factor);
    }
    
}