import java.util.Scanner;

/**
 * Rorate90DegMatrix2D
 */
public class Rorate90DegMatrix2D {

    public static void revreseArray(int[] arr){
        int l = 0;
        int h = arr.length-1;
        int temp = 0;
        while (l < h) {
            temp = arr[l];
            arr[l] = arr[h];
            arr[h] = temp;
            l++; h--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] arr = new int[n][m];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // transpose of matrix
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr[i].length; j++){
                int temp = arr[j][i];
                arr[j][i] = arr[i][j];
                arr[i][j] = temp;
            }
        }

        for(int i=0; i<arr.length; i++){
            revreseArray(arr[i]);
        }

        System.out.println("=======================");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}