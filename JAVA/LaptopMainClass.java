public class LaptopMainClass {
    public static void main(String[] args) {
        Laptop l1 = new Laptop("HP", 2024, 40000);
        Laptop l2 = new Laptop("Dell", 2022, 25000);
        Laptop l3 = new Laptop("Asus", 2021, 40500);
        l1.display();
        l2.display();
        l3.display();
    }
}
