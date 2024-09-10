public class ReverseEvenIndexWord {
    public static String reverseString(String s){
        String rev = "";
        for(int i=0; i<s.length(); i++){
            rev = s.charAt(i) + rev;
        }

        return rev;
    }

    public static void main(String[] args) {
        String str = "hello hi bye welcome bhargav";
        String[] arr = str.split(" ");
        for(int i=0; i<arr.length; i++){
            if (i%2 == 0) {
                System.out.print(reverseString(arr[i])+" ");
            }
            else{
                System.out.print(arr[i] + " ");
            }
        }
    }
}
