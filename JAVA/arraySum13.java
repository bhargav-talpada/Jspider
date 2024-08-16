import java.util.Scanner;

public class arraySum13 {
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
        int sum = 0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i]==13) {
                i++;
                continue;
            }
            sum = sum + arr[i];
        }
        System.out.println("Sum of array element : "+ sum);
    }
}
