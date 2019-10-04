package instruments;

import behaviours.IPlay;

public class AcousticDrums extends Drums implements IPlay {

    public AcousticDrums(String type, String colour, String make, String model) {

        super(type, colour, make, model);
    }

    public String playInstrument(String string) {
        return "The acoustic drums are playing " + string;
    }
}
