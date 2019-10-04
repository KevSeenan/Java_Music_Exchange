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
