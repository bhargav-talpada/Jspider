public class Practise11 {
    public static void volCylinder(int r, int h){
        float volumeCylinder = 3.14f * r * r * h;
        System.out.println("Volume of Cylinder : " + volumeCylinder);
    }
    public static void main(String[] args) {
        volCylinder(6, 8);
    }
}
