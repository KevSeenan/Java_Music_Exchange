package instruments;

import behaviours.IPlay;

public class AcousticDrums extends Drums implements IPlay {

    public AcousticDrums(String type,
                         String colour,
                         double buyingPrice,
                         double sellingPrice,
                         String make,
                         String model) {

        super(type, colour, buyingPrice, sellingPrice, make, model);
    }

    public String playInstrument(String string) {
        return "The acoustic drums are playing " + string;
    }
}
