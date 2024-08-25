public class MobileMoto extends Mobile {
    MobileMoto(String m, int p){
        this.model = m;
        this.price = p;
    }
    public static void main(String[] args) {
        MobileMoto m1 = new MobileMoto("Moto Edge 50 Fusion", 25000);       
        MobileMoto m2 = new MobileMoto("Moto Edge 50 Ultra", 50000);       
        m1.details();
        m2.details();
    }
}