public class ArrayijPrint {
    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 3, 1};
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr.length; j++) {
        //         System.out.println(arr[i]+" "+arr[j]);
        //     }
        // }

        // -------------------------------------------------------------------------
        // o/p -> 
        // 5 2
        // 5 4
        // 5 3
        // 5 1
        // 2 4
        // 2 3
        // 2 1
        // 4 3
        // 4 1
        // 3 1

        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = i+1; j < arr.length; j++) {
        //         System.out.println(arr[i]+" "+arr[j]);
        //     }
        // }
    }
}
