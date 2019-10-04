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

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfPickUps() {
        return numberOfPickUps;
    }

    public void setNumberOfPickUps(int numberOfPickUps) {
        this.numberOfPickUps = numberOfPickUps;
    }
}
