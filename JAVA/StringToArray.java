public class StringToArray {
    public static void main(String[] args) {
        String str = "Bhargav";
        int l = str.length();
        char[] arr = new char[l];
        for(int i=0; i<str.length(); i++){
            arr[i] = str.charAt(i); 
        }
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
