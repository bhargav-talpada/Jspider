public class PalindromeString {
    public static void main(String[] args) {
        /* 1st way */
        // String str = "levkel";
        // int fi = 0;
        // int li = str.length() - 1;
        // boolean flag = true;
        // while (fi < li) {
        //     if (str.charAt(fi) != str.charAt(li) ) {
        //         flag = false;
        //     }
        //     fi++; li--;
        // }
        // System.out.println(flag == true ? "Palindrome" : "Not");Strin

        /* 2nd way */
        String str = "Level";
        String rev = "";
        for(int i=0; i<str.length(); i++){
            rev = str.charAt(i) + rev;
        }
        if (rev.equalsIgnoreCase(str)) {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not");
        }

    }
}
