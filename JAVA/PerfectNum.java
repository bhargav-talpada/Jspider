import java.util.Scanner;

public class PerfectNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1; i<n; i++){
            if(n%i == 0){
                sum = sum + i;
            }
        }
        System.out.println(sum);
        System.out.println(sum == n ? "Perfect Num" : "Not Perfect Num");
    }
}
