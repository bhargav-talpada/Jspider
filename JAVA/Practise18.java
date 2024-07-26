public class Practise18 {
    public static void cuboid(int l, int h, int w){
        int surfaceCuboid = 2 * l * w + 2 * l * h + 2 * h * w;
        System.out.println("Surface of Cuboid : "+ surfaceCuboid);
    }
    public static void main(String[] args) {
        cuboid(8, 5, 6);
    }
}
