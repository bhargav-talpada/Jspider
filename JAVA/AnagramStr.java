public class AnagramStr {
    public static String isShortString(String str){
        char[] arr = str.toCharArray();
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-1; j++){
                if (arr[j] > arr[j+1]) {
                    char temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        String str1 = new String(arr);
        return str1;
    }

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "ellho";
        String ans = isShortString(str1);
        String ans2 = isShortString(str2);
        if (ans.equals(ans2)) {
            System.out.println("Anagram...!");
        }
        else{
            System.out.println("Not a anagram...");
        }
    }
}
