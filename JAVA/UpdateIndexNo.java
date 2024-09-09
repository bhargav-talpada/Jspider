public class UpdateIndexNo {
    public static void main(String[] args) {
        int[] arr = new int[128];
        for(int i=0; i<arr.length; i++){
            System.out.println((char)(i)+" - "+arr[i]);
        }
        arr['A'] = 101;
        arr['B'] = 102;
        arr['C'] = 103;
        arr['D'] = 104;
        arr['A']++;
        arr['A']++;
        arr['a'] = 101;
        arr['b'] = 102;
        arr['c'] = 103;
        arr['d'] = 104;
        arr['b']++;
        arr['d']++;
        for(int i=0; i<arr.length; i++){
            System.out.println((char)(i)+" - "+arr[i]);
        }
    }    
}
