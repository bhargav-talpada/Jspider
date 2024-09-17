import java.util.Scanner;

/**
 * Array2D
 */
public class Array2D {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        // get data from user
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("==============================");

        // print 2d array
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("==============================");
        
        // sum of 2d array
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length;j++){
                sum = sum + arr[i][j];
            }
        }
        System.out.println(sum);

        System.out.println("==============================");

        // sum of diagonal element of 2d array
        int sumLeft = 0;
        int sumRight = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if (i==j) {
                    sumLeft = sumLeft + arr[i][j];
                }
                if (i+j==arr.length-1) {
                    sumRight = sumRight + arr[i][j];                    
                }
            }
        }
        System.out.println("Left : "+ sumLeft);
        System.out.println("Right : "+ sumRight);

        System.out.println("==============================");

        // transpose of matrix
        int temp = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr[i].length; j++){
                temp = arr[j][i];
                arr[j][i] = arr[i][j];
                arr[i][j] = temp; 
            }
        }
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}