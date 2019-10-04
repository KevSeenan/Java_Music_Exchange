package instruments;

import behaviours.IPlay;

public class Keyboard extends Instrument implements IPlay {

    private String make;
    private String model;


    public Keyboard(String make, String model, String type, String colour) {
        super(type, colour);

        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String playInstrument(String string) {
        return "The keyboard is playing " + string;
    }
}
