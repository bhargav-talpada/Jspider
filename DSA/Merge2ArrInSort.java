package DSA;

import java.util.Arrays;

public class Merge2ArrInSort {
    
    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] mergedArray = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }

        while (i < n1) {
            mergedArray[k++] = arr1[i++];
        }

        while (j < n2) {
            mergedArray[k++] = arr2[j++];
        }

        return mergedArray;
    }

    public static void main(String[] args) {
        int[] arr1 = {11, 12, 14, 85};
        int[] arr2 = {1, 5, 7, 20, 55};

        int[] mergedArray = mergeSortedArrays(arr1, arr2);
        
        System.out.println("Merged Sorted Array: " + Arrays.toString(mergedArray));
    }
}
