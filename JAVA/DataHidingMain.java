public class DataHidingMain {
    public static void main(String[] args) {
        DataHiding d1 = new DataHiding();
        d1.setId(101);
        d1.setName("Bhargav");
        d1.setAge(21);
        System.out.println(d1.getId());
        System.out.println(d1.getName());
        System.out.println(d1.getAge());
    }
}
