package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ElectricGuitarTest {

    ElectricGuitar  electricGuitar;

    @Before
    public void ElectricGuitar() {
        electricGuitar = new ElectricGuitar ("String",
                                            "Sunburst",
                                            2000.00,
                                            4000.00,
                                            "Gibson",
                                            "Les Paul Special",
                                            6,
                                            2);
    }

    @Test
    public void hasAType() {
        assertEquals("String", electricGuitar.getType());
    }

    @Test
    public void hasAColour() {
        assertEquals("Sunburst", electricGuitar.getColour());
    }

    @Test
    public void hasABuyingPrice() {
        assertEquals(2000.00, electricGuitar.getBuyingPrice(), 0.0);
    }

    @Test
    public void hasASellingPrice() {
        assertEquals(4000.00, electricGuitar.getSellingPrice(), 0.0);
    }

    @Test
    public void canCalculateMarkUpPrice() {
        assertEquals(2000.00, electricGuitar.calculateMarkup(), 0.0);
    }

    @Test
    public void hasAMake() {
        assertEquals("Gibson", electricGuitar.getMake());
    }

    @Test
    public void hasAModel() {
        assertEquals("Les Paul Special", electricGuitar.getModel());
    }

    @Test
    public void hasStrings() {
        assertEquals(6, electricGuitar.getNumberOfStrings());
    }

    @Test
    public void hasPickUps() {
        assertEquals(2, electricGuitar.getNumberOfPickUps());
    }

    @Test
    public void canBePlayed() {
        assertNotNull(electricGuitar);
        assertEquals("The electric guitar is playing Paradise City by Guns N' Roses",
                electricGuitar.playInstrument("Paradise City by Guns N' Roses"));
    }
}
