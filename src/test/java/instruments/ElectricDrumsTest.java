package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ElectricDrumsTest {

    ElectricDrums  electricDrums;

    @Before
    public void ElectricDrums() {
        electricDrums = new ElectricDrums ("Percussion",
                "Black",
                "Yamaha",
                "DTX402");
    }

    @Test
    public void hasAType() {
        assertEquals("Percussion", electricDrums.getType());
    }

    @Test
    public void hasAColour() {
        assertEquals("Black", electricDrums.getColour());
    }

    @Test
    public void hasAMake() {
        assertEquals("Yamaha", electricDrums.getMake());
    }

    @Test
    public void hasAModel() {
        assertEquals("DTX402", electricDrums.getModel());
    }

    @Test
    public void canBePlayed() {
        assertNotNull(electricDrums);
        assertEquals("The electric drums are playing Enjoy The Silence by Depeche Mode",
                electricDrums.playInstrument("Enjoy The Silence by Depeche Mode"));
    }
}
