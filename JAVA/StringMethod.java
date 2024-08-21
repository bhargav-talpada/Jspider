public class StringMethod {
    public static void main(String[] args) {
        String s1 = "bhargav";
        String s2 = "BHARGAV";
        String s3 = new String("bhargav");
        String s4 = new String("bhargav");

        // System.out.println(s1.equals(s2)); = true
        // System.out.println(s2.equals(s3)); = true
        // System.out.println(s3.equals(s4)); = true
        // System.out.println(s4.equals(s1)); = true

        // System.out.println(s1.equalsIgnoreCase(s2)); = true
        // System.out.println(s3.equalsIgnoreCase(s4)); = true

        System.out.println(s1.toUpperCase());
        System.out.println(s2.toLowerCase());
        System.out.println(s3.length());
        System.out.println(s4.indexOf("har"));
        System.out.println(s4.lastIndexOf('h'));
    }
}
