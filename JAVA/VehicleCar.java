public class VehicleCar extends Vehicle {
    public static void main(String[] args) {
        VehicleCar vc = new VehicleCar();
        vc.name = "Glanza";
        vc.color = "White";
        vc.price = 850000;
        System.out.println("Car Name - "+ vc.name);
        System.out.println("Car Color - "+ vc.color);
        System.out.println("Car Price - "+ vc.price);
        vc.startEngine();
        vc.stopEngine();
    }
}
