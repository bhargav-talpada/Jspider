package DSA;

import java.util.Arrays;

public class Merge2SortArr {

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

    public static int[] sortArry(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-1; j++){
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr1 = { 86, 14, 12, 2 };
        int[] arr2 = { 55, 20, 27, 5, 11 };

        arr1 = sortArry(arr1);
        arr2 = sortArry(arr2);

        int[] mergedArray = mergeSortedArrays(arr1, arr2);

        System.out.println("Merged Sorted Array: " + Arrays.toString(mergedArray));
    }
}
