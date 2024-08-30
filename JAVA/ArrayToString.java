public class ArrayToString {
    public static void main(String[] args) {
        char[] arr = {'b', 'h', 'a', 'r', 'g', 'a', 'v'};
        // String str = "";
        // for(int i=0; i<arr.length; i++){
        //     str = str + arr[i];
        // }
        String str = new String(arr);
        System.out.println(str);
    }
}
