package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ElectroAcousticGuitarTest {

    ElectroAcousticGuitar  electroAcousticGuitar;

    @Before
    public void ElectroAcousticGuitar() {
        electroAcousticGuitar = new ElectroAcousticGuitar ("Yamaha",
                "APX700II",
                6,
                1);
    }

    @Test
    public void hasAMake() {
        assertEquals("Yamaha", electroAcousticGuitar.getMake());
    }

    @Test
    public void hasAModel() {
        assertEquals("APX700II", electroAcousticGuitar.getModel());
    }

    @Test
    public void hasStrings() {
        assertEquals(6, electroAcousticGuitar.getNumberOfStrings());
    }

    @Test
    public void hasPickUps() {
        assertEquals(1, electroAcousticGuitar.getNumberOfPickUps());
    }

    @Test
    public void canBePlayed() {
        assertNotNull(electroAcousticGuitar);
        assertEquals("The electro acoustic guitar is playing Ghost Riders in The Sky by Johnny Cash",
                electroAcousticGuitar.playInstrument("Ghost Riders in The Sky by Johnny Cash"));
    }
}
