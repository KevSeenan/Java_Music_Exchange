package instruments;

import behaviours.IPlay;

public abstract class Drums implements IPlay {

    private String make;
    private String model;


    public Drums(String make, String model) {

        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
}
