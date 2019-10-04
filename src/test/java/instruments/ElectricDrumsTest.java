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
                1000.00,
                2500.00,
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
    public void hasABuyingPrice() {
        assertEquals(1000.00, electricDrums.getBuyingPrice(), 0.0);
    }

    @Test
    public void hasASellingPrice() {
        assertEquals(2500.00, electricDrums.getSellingPrice(), 0.0);
    }

    @Test
    public void canCalculateMarkUpPrice() {
        assertEquals(1500.00, electricDrums.calculateMarkup(), 0.0);
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
