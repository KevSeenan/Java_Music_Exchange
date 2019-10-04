package instruments;

import behaviours.IPlay;

public abstract class Drums extends Instrument implements IPlay {

    private String make;
    private String model;


    public Drums(String type, String colour, double buyingPrice, double sellingPrice, String make, String model) {
        super(type, colour, buyingPrice, sellingPrice);

        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
}
