public class occurenceOfStringArr {
    public static void main(String[] args) {
        String str = "hello";
        char[] arr1 = str.toCharArray();
        char[] arr2 = str.toCharArray();
        for(int i=0; i<arr1.length; i++){
            int count = 0;
            for(int j=0; j<arr2.length; j++){
                if (arr1[i] == arr2[j]) {
                    count++;
                    arr2[j] = '\0';
                }
            }
            if (count > 0) {
                System.out.println(arr1[i] + " - " + count);
            }
        }
    }
}
