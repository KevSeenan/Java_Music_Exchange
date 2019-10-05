package items;

import behaviours.ISell;

public class GuitarStrings implements ISell {

    private String make;
    private String model;
    private double buyingPrice;
    private double sellingPrice;

    public GuitarStrings(String make,
                         String model,
                        double buyingPrice,
                        double sellingPrice) {

        this.make = make;
        this.model = model;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public double calculateMarkup() {
        return getSellingPrice() - getBuyingPrice();
    }
}
