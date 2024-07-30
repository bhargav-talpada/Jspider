/**
 * TexiFare
 * conditions : 
 * First 2km -> 30 rs
 * Next 5km -> 10rs / km
 * Next 5km -> 15rs / km
 * Next 5km -> 20rs / km
 * Next -> 25rs / km
 */
import java.util.Scanner;;

public class TexiFare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter KM : ");
        int km = sc.nextInt();
        int rs = 0;

        if(km <= 2){
            rs = 30;
        }
        else if (km <= 7) {
            rs = 30 + (km-2) * 10;
        }
        else if (km <= 12) {
            rs = 80 + (km-7) * 15;
        }
        else if (km <= 17) {
            rs = 155 + (km-12) * 20;
        }
        else{
            rs = 255 + (km-17) * 25;
        }

        System.out.println("Total Fare is : "+ rs);
    }
}