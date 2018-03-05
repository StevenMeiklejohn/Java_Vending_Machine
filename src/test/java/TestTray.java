import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 05/03/2018.
 */
public class TestTray {

    private Tray tray;

    @Before
    public void before() {
        tray = new Tray(0.50, 10);
    }

    @Test
    public void hasPrice(){
        assertEquals(0.50, tray.getPrice(), 0.01);
    }

    @Test
    public void hasCapacity(){
        assertEquals(10, tray.getCapacity());
    }

    @Test
    public void trayStartsEmpty(){
        assertEquals(0, tray.getStockLevel());
    }


}
