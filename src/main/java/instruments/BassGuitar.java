package instruments;

import behaviours.IPlay;

import javax.sound.midi.Instrument;

public class BassGuitar extends Guitars implements IPlay {

    Instrument instrument;

    public BassGuitar(String make, String model, int numberOfStrings, int numberOfPickUps) {

        super(make, model, numberOfStrings, numberOfPickUps);
    }

    public String playInstrument(String string) {
        return "The bass guitar is playing " + string;
    }
}
