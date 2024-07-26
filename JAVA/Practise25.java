public class Practise25 {
    public static void percentage(int p, int c, int m, int o){
        int total = p + c + m + o;
        float perc = total * 100 / 320f;
        System.out.println("Physics marks is : "+ p);
        System.out.println("Chemastry marks is : "+ c);
        System.out.println("Maths marks is : "+ m);
        System.out.println("Other marks is : "+ o);
        System.out.println("Total marks is : "+ total);
        System.out.println("Percentage is : "+ perc);
    }
    public static void main(String[] args){
        percentage(65, 69, 72, 74);
    }
}
