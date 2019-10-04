package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class AcousticDrumsTest {

    AcousticDrums  acousticDrums;

    @Before
    public void AcousticDrum() {
        acousticDrums = new AcousticDrums ("Percussion",
                                            "Black",
                                            500.00,
                                            650.00,
                                            "Pearl",
                                            "XX Export 7pc Double Bass Drum Kit");
    }

    @Test
    public void hasAType() {
        assertEquals("Percussion", acousticDrums.getType());
    }

    @Test
    public void hasAColour() {
        assertEquals("Black", acousticDrums.getColour());
    }

    @Test
    public void hasABuyingPrice() {
        assertEquals(500.00, acousticDrums.getBuyingPrice(), 0.0);
    }

    @Test
    public void hasASellingPrice() {
        assertEquals(650.00, acousticDrums.getSellingPrice(), 0.0);
    }

    @Test
    public void canCalculateMarkUpPrice() {
        assertEquals(150.00, acousticDrums.calculateMarkup(), 0.0);
    }

    @Test
    public void hasAMake() {
        assertEquals("Pearl", acousticDrums.getMake());
    }

    @Test
    public void hasAModel() {
        assertEquals("XX Export 7pc Double Bass Drum Kit", acousticDrums.getModel());
    }

    @Test
    public void canBePlayed() {
        assertNotNull(acousticDrums);
        assertEquals("The acoustic drums are playing Blind by KoRn",
                acousticDrums.playInstrument("Blind by KoRn"));
    }
}
