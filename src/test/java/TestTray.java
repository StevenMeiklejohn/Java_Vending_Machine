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

    @Test
    public void canAddNewItem(){
        Drink drink = new Drink("Irn-Bru", 330);
        tray.addItem(drink);
        assertEquals(1, tray.getStockLevel());
    }

    @Test
    public void canRemoveItemFromTray(){
        Drink drink1 = new Drink("Irn-Bru", 330);
        Drink drink2 = new Drink("Irn-Bru", 330);
        tray.addItem(drink1);
        tray.addItem(drink2);
        Product ejectedDrink = tray.ejectProduct();
        assertEquals(drink1, ejectedDrink);
    }

    @Test
    public void cannotExceedCapacity(){
        for(int i = 0; i < 20; i++){
            Drink drink1 = new Drink("Irn-Bru", 330);
            tray.addItem(drink1);
        }
        assertEquals(10, tray.getStockLevel());
    }


}
