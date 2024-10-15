package DSA;

import java.util.LinkedHashMap;

public class HasMap {
    public static void main(String[] args) {
        // ---------- occurence of string ------------------
        String s = "bHaRgAv TaLpAdA";
        LinkedHashMap<Character, Integer> m1 = new LinkedHashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if (m1.containsKey(ch)) {
                m1.put(ch, m1.get(ch)+1);
            }
            else{
                m1.put(ch, 1);
            }
        }
        for(char key : m1.keySet()){
            System.out.println(key+" - "+m1.get(key));
        }

        System.out.println("===========================");

        // ---------- occurence of int arr ------------------
        int[] arr = {2,4,5,2,1,4,3,5,1,7,2};
        LinkedHashMap<Integer, Integer> m2 = new LinkedHashMap<>();
        for(int i=0; i<arr.length; i++){
            if (m2.containsKey(arr[i])) {
                m2.put(arr[i], m2.get(arr[i])+1);
            }
            else{
                m2.put(arr[i], 1);
            }
        }
        for(int key : m2.keySet()){
            System.out.println(key+" - "+m2.get(key));
        }
    }
}
