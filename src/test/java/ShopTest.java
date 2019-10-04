import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;

    @Before
    public void ShopTest() {
        shop = new Shop ("Ray's Music Exchange", 3);
    }

    @Test
    public void countNumberOfStockItems(){
        assertEquals(0, shop.stockCount());
    }
}
