import java.util.Scanner;;

public class SqureNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       
        System.out.println("Enter Number : ");
        int n = sc.nextInt();
        int c = 0;
        for (int i=1; i<n; i++) {
            if(i*i == n){
                c++;
                break;
            }
            if(i*i>n){
                break;
            }
        }
        System.out.println(c==1?"Squre No":"Not Squre No");
    }
}
