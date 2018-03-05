import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 05/03/2018.
 */
public class TestDrink {
    private Drink drink;

    @Before
    public void before(){
        drink = new Drink("Dr Pepper", 330);
    }

    @Test
    public void hasName(){
        assertEquals("Dr Pepper", drink.getName());
    }

    @Test
    public void hasVolume(){
        assertEquals(330, drink.getVolume());
    }


}
