public class Phone {

    private String vendor;
    private double price;

    public Phone(String vendor, double price) {
        this.vendor = vendor;
        this.price = price;
    }

    public String getPriceVendor() {
        String priceAndVendor = " Price is " + price + " "+ "Vendor is " + vendor;
        return priceAndVendor;
    }
}
