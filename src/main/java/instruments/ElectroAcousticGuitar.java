package instruments;

import behaviours.IPlay;

public class ElectroAcousticGuitar extends Guitars implements IPlay {

    public ElectroAcousticGuitar(String type, String colour, String make, String model, int numberOfStrings, int numberOfPickUps) {

        super(type, colour, make, model, numberOfStrings, numberOfPickUps);
    }

    public String playInstrument(String string) {
        return "The electro acoustic guitar is playing " + string;
    }
}
