package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class KeyboardTest {

    Keyboard  keyboard;

    @Before
    public void AcousticDrum() {
        keyboard = new Keyboard ("Casio","CTK 1500");
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
