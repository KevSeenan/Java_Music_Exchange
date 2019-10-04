package instruments;

import behaviours.IPlay;

public class ElectricDrums extends Drums implements IPlay {

    public ElectricDrums(String type, String colour, String make, String model) {

        super(type, colour, make, model);
    }

    public String playInstrument(String string) {
        return "The electric drums are playing " + string;
    }
}
