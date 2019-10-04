package instruments;

import behaviours.IPlay;

public class Keyboard implements IPlay {

    private String make;
    private String model;


    public Keyboard(String make, String model) {

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
