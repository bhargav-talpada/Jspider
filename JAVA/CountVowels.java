public class CountVowels {
    public static void main(String[] args) {
        String s = "bhargav BHARGAV";
        s = s.toLowerCase();
        int count = 0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if ((c=='a') || (c=='e') || (c=='o') || (c=='i') || (c=='u')) {
                count++;
            }
        }
        System.out.println(count);
    }
}
