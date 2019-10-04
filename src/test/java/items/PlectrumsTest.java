package items;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlectrumsTest {

    Plectrums plectrums;

    @Before
    public void Plectrums() {
        plectrums = new Plectrums("Dunlop",
                "Tortex Standard",
                0.10,
                0.50);
    }

    @Test
    public void hasABuyingPrice() {
        assertEquals(0.10, plectrums.getBuyingPrice(), 0.0);
    }

    @Test
    public void hasASellingPrice() {
        assertEquals(0.50, plectrums.getSellingPrice(), 0.0);
    }

    @Test
    public void canCalculateMarkUpPrice() {
        assertEquals(0.40, plectrums.calculateMarkup(), 0.0);
    }

    @Test
    public void hasAMake() {
        assertEquals("Dunlop", plectrums.getMake());
    }

    @Test
    public void hasAModel() {
        assertEquals("Tortex Standard", plectrums.getModel());
    }

}
