package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class BassGuitarTest {

    BassGuitar  bassGuitar;

    @Before
    public void BassGuitar() {
        bassGuitar = new BassGuitar ("String",
                "Red",
                "Ibenez",
                "TMB30-MGR Talman Mint Green 2019",
                4,
                2);
    }

    @Test
    public void hasAType() {
        assertEquals("String", bassGuitar.getType());
    }

    @Test
    public void hasAColour() {
        assertEquals("Red", bassGuitar.getColour());
    }

    @Test
    public void hasAMake() {
        assertEquals("Ibenez", bassGuitar.getMake());
    }

    @Test
    public void hasAModel() {
        assertEquals("TMB30-MGR Talman Mint Green 2019", bassGuitar.getModel());
    }

    @Test
    public void hasStrings() {
        assertEquals(4, bassGuitar.getNumberOfStrings());
    }

    @Test
    public void hasPickUps() {
        assertEquals(2, bassGuitar.getNumberOfPickUps());
    }

    @Test
    public void canBePlayed() {
        assertNotNull(bassGuitar);
        assertEquals("The bass guitar is playing Schism by Tool",
                bassGuitar.playInstrument("Schism by Tool"));
    }
}
