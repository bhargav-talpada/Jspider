import java.util.Scanner;

/**
 * NestedFor
 */
public class NestedFor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for (int j=1; j<=n; j++) {
                // System.out.print(i +" X "+ j + " = " + i*j + " ");
                System.out.print(j + "*"+i + "=" + j*i + "  ");
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}