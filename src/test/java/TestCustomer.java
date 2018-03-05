import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 05/03/2018.
 */
public class TestCustomer {

    Customer customer;

    @Before
    public void before(){
        customer = new Customer("Deirdre Barlow", 10.00);
    }

    @Test
    public void testHasName(){
        assertEquals("Deirdre Barlow", customer.getName());
    }

    @Test
    public void hasCash(){
        assertEquals(10.00, customer.getCash(), 0.1);
    }

    @Test
    public void inventoryStartsEmpty(){
        assertEquals(0, customer.getInventory().size());
    }
}
