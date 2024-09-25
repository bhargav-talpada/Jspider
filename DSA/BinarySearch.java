// Binary search always work on sorted array....

package DSA;

public class BinarySearch {
    static int Search(int[] arr, int key){
        int l = 0;
        int h = arr.length-1;
        while (l <= h) {
            int mid = (l+h)/2;
            if (key == arr[mid]) {
                return mid;
            }
            else if (arr[mid] > key) {
                h = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 15, 27, 39, 51, 65, 80, 100};
        System.out.println(Search(arr, 80));
    }
}
