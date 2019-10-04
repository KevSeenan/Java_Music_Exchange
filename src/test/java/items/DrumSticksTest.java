package items;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumSticksTest {

    DrumSticks drumSticks;

    @Before
    public void DrumSticks() {
        drumSticks = new DrumSticks("Pearl",
                "PDS-5A",
                4.00,
                8.50);
    }

    @Test
    public void hasABuyingPrice() {
        assertEquals(4.00, drumSticks.getBuyingPrice(), 0.0);
    }

    @Test
    public void hasASellingPrice() {
        assertEquals(8.50, drumSticks.getSellingPrice(), 0.0);
    }

    @Test
    public void canCalculateMarkUpPrice() {
        assertEquals(4.50, drumSticks.calculateMarkup(), 0.0);
    }

    @Test
    public void hasAMake() {
        assertEquals("Pearl", drumSticks.getMake());
    }

    @Test
    public void hasAModel() {
        assertEquals("PDS-5A", drumSticks.getModel());
    }


}
