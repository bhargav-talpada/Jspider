class gstCalculation
{
    public static void gst()
    {
        float price = 1500.00f;
        float gst = price * 0.18f;
        float amount = price + gst;
        System.out.println("Price is a "+price);
        System.out.println("GST is a "+gst);
        System.out.println("Total amount is a "+amount);
    }

    public static void main(String[] args){
        gst();
    }
}