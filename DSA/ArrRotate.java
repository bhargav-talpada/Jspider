package DSA;

public class ArrRotate {
    public static void RotateRight(int[] arr){
        int temp = arr[arr.length-1];
        for(int i=arr.length-1; i>0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
    }

    public static void RotateLeft(int[] arr){
        int temp = arr[0];
        for(int i=0; i<arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 8, 6, 7, 3};
        int k = 2;
        for(int i=1; i<=k; i++){
            RotateRight(arr);
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        System.out.println("==========");
        int[] arr2 = {2, 1, 4, 8, 6, 7, 3};
        for(int i=1; i<=k; i++){
            RotateLeft(arr2);
        }
        for(int ele : arr2){
            System.out.print(ele+" ");
        }
    }
}
