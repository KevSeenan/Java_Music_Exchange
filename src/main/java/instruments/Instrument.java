package instruments;

public abstract class Instrument {


    private String type;
    private String colour;

    public Instrument(String type, String colour) {

        this.type = type;
        this.colour = colour;
    }

    public String getType() {
        return type;
    }

    public String getColour() {
        return colour;
    }
}
