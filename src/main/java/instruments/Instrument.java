package instruments;

import behaviours.ISell;

public abstract class Instrument implements ISell {


    private String type;
    private String colour;
    private double buyingPrice;
    private double sellingPrice;

    public Instrument(String type, String colour, double buyingPrice, double sellingPrice) {

        this.type = type;
        this.colour = colour;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getType() {
        return type;
    }

    public String getColour() {
        return colour;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public double calculateMarkup() {
        return getSellingPrice() - getBuyingPrice();
    }
}
