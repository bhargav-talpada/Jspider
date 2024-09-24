package DSA;

public class LinearSearch {
    // ------------- search first occureance of key ---------------
    // public static int Search(int[] arr, int key){
    //     for(int i=0; i<arr.length; i++){
    //         if (arr[i] == key) {
    //             return i;
    //         }
    //     }
    //     return -1;
    // }

    // ------------- search last occureance of key ---------------
    public static int Search(int[] arr, int key){
        int pos = -1;
        for(int i=0; i<arr.length; i++){
            if (arr[i] == key) {
                pos = i;
            }
        }
        return pos;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 15, 84, 11};
        System.out.println(Search(arr, 10));
    }
}
