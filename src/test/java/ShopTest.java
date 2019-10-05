import items.DrumSticks;
import items.GuitarStrings;
import items.Plectrums;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    DrumSticks drumSticks;
    GuitarStrings guitarStrings;
    Plectrums plectrums;

    @Before
    public void ShopTest() {
        shop = new Shop ("Ray's Music Exchange", 3);
        drumSticks = new DrumSticks ("Pearl",
                "PDS-5A",
                4.00,
                8.50);
        guitarStrings = new GuitarStrings ("Earny Ball",
                "Ultra Slinky",
                2.00,
                5.50);
        plectrums = new Plectrums ("Dunlop",
                "Tortex Standard",
                0.10,
                0.50);
    }

    @Test
    public void hasName(){
        assertEquals("Ray's Music Exchange", shop.getName());
    }

    @Test
    public void countNumberOfStockItems(){
        assertEquals(0, shop.stockCount());
    }

    @Test
    public void canAddItemsToStock() {
        shop.addItem(drumSticks);
        assertEquals(1, shop.stockCount());
    }
}
