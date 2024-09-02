public class MinMaxDiffArr {
    public static void main(String[] args) {
        int[] arr = {45, 25, 48, 26, 50};
        int max = arr[0];
        int min = arr[0];
        for(int i=0; i<arr.length; i++){
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        int diff = max - min;
        System.out.println(diff);
    }
}
