package instruments;

import behaviours.IPlay;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class AcousticGuitarTest {

    AcousticGuitar  acousticGuitar;

    @Before
    public void AcousticGuitar() {
        acousticGuitar = new AcousticGuitar ("String",
                                                "Blue",
                                                200.00,
                                                300.00,
                                                "Fender",
                                                "CC-60S",
                                                6,
                                                0);
    }

    @Test
    public void hasAType() {
        assertEquals("String", acousticGuitar.getType());
    }

    @Test
    public void hasAColour() {
        assertEquals("Blue", acousticGuitar.getColour());
    }

    @Test
    public void hasABuyingPrice() {
        assertEquals(200.00, acousticGuitar.getBuyingPrice(), 0.0);
    }

    @Test
    public void hasASellingPrice() {
        assertEquals(300.00, acousticGuitar.getSellingPrice(), 0.0);
    }

    @Test
    public void canCalculateMarkUpPrice() {
        assertEquals(100.00, acousticGuitar.calculateMarkup(), 0.0);
    }

    @Test
    public void hasAMake() {
        assertEquals("Fender", acousticGuitar.getMake());
    }

    @Test
    public void hasAModel() {
        assertEquals("CC-60S", acousticGuitar.getModel());
    }

    @Test
    public void hasStrings() {
        assertEquals(6, acousticGuitar.getNumberOfStrings());
    }

    @Test
    public void hasPickUps() {
        assertEquals(0, acousticGuitar.getNumberOfPickUps());
    }

    @Test
    public void canBePlayed() {
        assertNotNull(acousticGuitar);
        assertEquals("The acoustic guitar is playing Blowing In The Wind by Bob Dylan",
                        acousticGuitar.playInstrument("Blowing In The Wind by Bob Dylan"));
    }

}
