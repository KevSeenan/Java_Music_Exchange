package instruments;

import behaviours.IPlay;

public class AcousticDrums extends Drums implements IPlay {

    public AcousticDrums(String make, String model) {

        super(make, model);
    }

    public String playInstrument(String string) {
        return "The acoustic drums are playing " + string;
    }
}
