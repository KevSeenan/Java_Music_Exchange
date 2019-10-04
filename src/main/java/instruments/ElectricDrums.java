package instruments;

import behaviours.IPlay;

public class ElectricDrums extends Drums implements IPlay {

    public ElectricDrums(String type,
                         String colour,
                         double buyingPrice,
                         double sellingPrice,
                         String make,
                         String model) {

        super(type, colour, buyingPrice, sellingPrice, make, model);
    }

    public String playInstrument(String string) {
        return "The electric drums are playing " + string;
    }
}
