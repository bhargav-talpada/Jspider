public class Practise9 {
    public static void cone(int r, int s){
        float areaCone = 3.14f * r * r + 3.14f * r * s;
        System.out.println("Surface Area of Cone : "+ areaCone);
    }
    public static void main(String[] args) {
        cone(6, 4);
    }
}
