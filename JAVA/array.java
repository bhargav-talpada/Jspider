import java.util.Scanner;

/**
 * array
 */
public class array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of your array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array element : ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("your array element : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int max = arr[0];
        System.out.println("maximum array element : ");
        for(int i=0; i<arr.length; i++){
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
        int min = arr[0];
        System.out.println("minimum array element : ");
        for(int i=0; i<arr.length; i++){
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min);
        int sum = 0;
        System.out.println("sum of array element : ");
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}