public class Practise10 {
    public static void conevolume(int r, int h){
        float volumeCone = 1/3f * 3.14f * r * r * h;
        System.out.println("Volume of Cone : "+ volumeCone);
    }
    public static void main(String[] args) {
        conevolume(5, 7);
    }
}
