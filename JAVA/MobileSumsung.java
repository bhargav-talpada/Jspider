public class MobileSumsung extends Mobile {
    MobileSumsung(String m, int p){
        this.model = m;
        this.price = p;
    }
    public static void main(String[] args) {
        MobileSumsung s1 = new MobileSumsung("s24 Ultra", 145000);
        MobileSumsung s2 = new MobileSumsung("s21 FE", 25000);
        s1.details();
        s2.details();
    }
}
