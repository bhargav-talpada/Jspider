public class Practise26{
    public static void trapezoid(int a, int b, int h){
        float areaTrapezoid = (a + b) / 2f * h;
        System.out.println("Area of Trapezoid : "+ areaTrapezoid);
    }
    public static void main(String[] args){
        trapezoid(12, 17, 21);
    }
}