package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class AcousticDrumsTest {

    AcousticDrums  acousticDrums;

    @Before
    public void AcousticDrum() {
        acousticDrums = new AcousticDrums ("Pearl","XX Export 7pc Double Bass Drum Kit");
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
