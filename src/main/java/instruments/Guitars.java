package instruments;

import behaviours.IPlay;

public abstract class Guitars implements IPlay {

    private String make;
    private String model;
    private int numberOfStrings;
    private int numberOfPickUps;


    public Guitars(String make, String model, int numberOfStrings, int numberOfPickUps) {

        this.make = make;
        this.model = model;
        this.numberOfStrings = numberOfStrings;
        this.numberOfPickUps = numberOfPickUps;

    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public int getNumberOfPickUps() {
        return numberOfPickUps;
    }
}
