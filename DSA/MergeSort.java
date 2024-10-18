package DSA;

import java.util.Arrays;

public class MergeSort {

    public static void merge(int[] arr, int sp, int ep, int mp){

        int[] arr1 = new int[mp - sp + 1];
        int[] arr2 = new int[ep - mp];

        int i = 0, j = 0, k = sp;

        for(int x=sp; x<=mp; x++){
            arr1[i] = arr[x];
            i++;
        }

        for(int x=mp+1; x<=ep; x++){
            arr2[j] = arr[x];
            j++;
        }

        i = 0;
        j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                arr[k++] = arr1[i++];
            } else {
                arr[k++] = arr2[j++];
            }
        }

        while (i < arr1.length) {
            arr[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            arr[k++] = arr2[j++];
        }
    }

    public static void sort(int[] arr, int l, int h){
        if (l<h) {
            int mid = (l+h)/2;
            sort(arr, l, mid);
            sort(arr, mid+1, h);
            merge(arr, l, h, mid);
        }

    }
    public static void main(String[] args) {
        int[] arr = { 5, 10, 2, 11, 14, 6, 8, 10, 6, 13 };
        sort(arr, 0, arr.length-1);
        System.out.println("Merged Sorted Array: " + Arrays.toString(arr));
    }
}
