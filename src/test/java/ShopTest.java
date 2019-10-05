import instruments.AcousticDrums;
import instruments.ElectricGuitar;
import instruments.Keyboard;
import items.DrumSticks;
import items.GuitarStrings;
import items.Plectrums;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ShopTest {

    Shop shop;
    ElectricGuitar electricGuitar;
    AcousticDrums acousticDrums;
    Keyboard keyboard;
    DrumSticks drumSticks;
    GuitarStrings guitarStrings;
    Plectrums plectrums;

    @Before
    public void ShopTest() {
        shop = new Shop ("Ray's Music Exchange", 400);
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
        electricGuitar = new ElectricGuitar("String",
                "Sunburst",
                2000.00,
                4000.00,
                "Gibson",
                "Les Paul Special",
                6,
                2);
        acousticDrums = new AcousticDrums("Percussion",
                "Black",
                500.00,
                650.00,
                "Pearl",
                "XX Export 7pc Double Bass Drum Kit");
        keyboard = new Keyboard("Casio",
                "CTK 1500",
                "Percussion",
                "White",
                450.00,
                550.00);
    }

    @Test
    public void hasName(){
        assertNotNull(shop);

        assertEquals("Ray's Music Exchange", shop.getName());
    }

    @Test
    public void countNumberOfStockItems(){
        assertNotNull(shop);

        assertEquals(0, shop.stockCount());
    }

    @Test
    public void canAddItemsToStock() {
        assertNotNull(shop);
        assertNotNull(drumSticks);

        shop.addItem(drumSticks);

        assertEquals(1, shop.stockCount());
    }

    @Test
    public void canRemoveItemsFromStock() {
        assertNotNull(shop);
        assertNotNull(guitarStrings);

        shop.addItem(guitarStrings);
        shop.removeItem(guitarStrings);

        assertEquals(0, shop.stockCount());
    }

    @Test
    public void canCalculateTotalPotentialProfit(){
        assertNotNull(shop);
        assertNotNull(drumSticks);
        assertNotNull(guitarStrings);
        assertNotNull(plectrums);
        assertNotNull(electricGuitar);
        assertNotNull(acousticDrums);
        assertNotNull(keyboard);

        shop.addItem(drumSticks);
        shop.addItem(guitarStrings);
        shop.addItem(plectrums);
        shop.addItem(electricGuitar);
        shop.addItem(acousticDrums);
        shop.addItem(keyboard);

        double totalProfit = shop.calculateTotalPotentialProfit();

        assertEquals(2258.40, totalProfit, 0.0);
    }
}
