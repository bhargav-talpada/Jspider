public class VehicleBike extends Vehicle {
    public static void main(String[] args) {
        VehicleBike vb = new VehicleBike();
        vb.name = "Bajaj Discover";
        vb.color = "Black";
        vb.price = 65000;
        System.out.println("Bike Name - "+ vb.name);
        System.out.println("Bike Name - "+ vb.color);
        System.out.println("Bike Name - "+ vb.price);
        vb.startEngine();
        vb.stopEngine();
    }
}
