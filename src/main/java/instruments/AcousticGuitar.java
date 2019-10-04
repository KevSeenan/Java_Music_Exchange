package instruments;

import behaviours.IPlay;

public class AcousticGuitar extends Guitars implements IPlay {

    public AcousticGuitar(String type, String colour, String make, String model, int numberOfStrings, int numberOfPickUps) {

        super(type, colour, make, model, numberOfStrings, numberOfPickUps);
    }

    public String playInstrument(String string) {
        return "The acoustic guitar is playing " + string;
    }
}
