package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class KeyboardTest {

    Keyboard  keyboard;

    @Before
    public void Keyboard() {
        keyboard = new Keyboard ("Casio","CTK 1500", "Percussion", "White");
    }

    @Test
    public void hasAType() {
        assertEquals("Percussion", keyboard.getType());
    }

    @Test
    public void hasAColour() {
        assertEquals("White", keyboard.getColour());
    }

    @Test
    public void hasAMake() {
        assertEquals("Casio", keyboard.getMake());
    }

    @Test
    public void hasAModel() {
        assertEquals("CTK 1500", keyboard.getModel());
    }

    @Test
    public void canBePlayed() {
        assertNotNull(keyboard);
        assertEquals("The keyboard is playing Chopsticks",
                keyboard.playInstrument("Chopsticks"));
    }
}
