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
                150.00,
                250.00,
                "Ibenez",
                "TMB30-MGR Talman",
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
    public void hasABuyingPrice() {
        assertEquals(150.00, bassGuitar.getBuyingPrice(), 0.0);
    }

    @Test
    public void hasASellingPrice() {
        assertEquals(250.00, bassGuitar.getSellingPrice(), 0.0);
    }

    @Test
    public void canCalculateMarkUpPrice() {
        assertEquals(100.00, bassGuitar.calculateMarkup(), 0.0);
    }

    @Test
    public void hasAMake() {
        assertEquals("Ibenez", bassGuitar.getMake());
    }

    @Test
    public void hasAModel() {
        assertEquals("TMB30-MGR Talman", bassGuitar.getModel());
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
