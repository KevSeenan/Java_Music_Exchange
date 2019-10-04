package instruments;

import behaviours.IPlay;

public class ElectricGuitar extends Guitars implements IPlay {

    public ElectricGuitar(String make, String model, int numberOfStrings, int numberOfPickUps) {

        super(make, model, numberOfStrings, numberOfPickUps);
    }

    public String playInstrument(String string) {
        return "The electric guitar is playing " + string;
    }
}
