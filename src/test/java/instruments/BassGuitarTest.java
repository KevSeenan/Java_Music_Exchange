package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BassGuitarTest {

    BassGuitar  bassGuitar;

    @Before
    public void BassGuitar() {
        bassGuitar = new BassGuitar ("Ibenez",
                "TMB30-MGR Talman Mint Green 2019",
                4,
                2);
    }

    @Test
    public void hasAMake() {
        assertEquals("Ibenez", bassGuitar.getMake());
    }

    @Test
    public void hasAModel() {
        assertEquals("TMB30-MGR Talman Mint Green 2019", bassGuitar.getModel());
    }

    @Test
    public void hasStrings() {
        assertEquals(4, bassGuitar.getNumberOfStrings());
    }

    @Test
    public void hasPickUps() {
        assertEquals(2, bassGuitar.getNumberOfPickUps());
    }
}
