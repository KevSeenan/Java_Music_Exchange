package items;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {

    GuitarStrings guitarStrings;

    @Before
    public void GuitarStrings() {
        guitarStrings = new GuitarStrings("Earny Ball",
                "Ultra Slinky",
                2.00,
                5.50);
    }

    @Test
    public void hasABuyingPrice() {
        assertEquals(2.00, guitarStrings.getBuyingPrice(), 0.0);
    }

    @Test
    public void hasASellingPrice() {
        assertEquals(5.50, guitarStrings.getSellingPrice(), 0.0);
    }

    @Test
    public void canCalculateMarkUpPrice() {
        assertEquals(3.50, guitarStrings.calculateMarkup(), 0.0);
    }

    @Test
    public void hasAMake() {
        assertEquals("Earny Ball", guitarStrings.getMake());
    }

    @Test
    public void hasAModel() {
        assertEquals("Ultra Slinky", guitarStrings.getModel());
    }
}
