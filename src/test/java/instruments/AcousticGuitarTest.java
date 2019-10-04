package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AcousticGuitarTest {

    AcousticGuitar  acousticGuitar;

    @Before
    public void AcousticGuitar() {
        acousticGuitar = new AcousticGuitar ("Fender",
                                                "CC-60S",
                                                6,
                                                0);
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

}
