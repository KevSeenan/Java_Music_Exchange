package instruments;

import behaviours.IPlay;

import javax.sound.midi.Instrument;

public class AcousticGuitar extends Guitars implements IPlay {

    public AcousticGuitar(String make, String model, int numberOfStrings, int numberOfPickUps) {

        super(make, model, numberOfStrings, numberOfPickUps);
    }

    public String playInstrument(Instrument instrument) {
        return instrument + "is being played";
    }
}
