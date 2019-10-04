package instruments;

import behaviours.IPlay;

public class ElectricDrums extends Drums implements IPlay {

    public ElectricDrums(String make, String model) {

        super(make, model);
    }

    public String playInstrument(String string) {
        return "The electric drums are playing " + string;
    }
}
