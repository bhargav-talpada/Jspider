public class PalindromArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 1};
        int f = 0, l = arr.length-1;
        boolean flag = true;
        while (f < l) {
            if (arr[f] != arr[l]) {
                flag = false;
                break;
            }
            f++;
            l--;
        }
        System.out.println(flag==true? "Yes" : "No");
    }
}
