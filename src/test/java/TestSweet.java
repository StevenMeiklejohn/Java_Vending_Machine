import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 05/03/2018.
 */
public class TestSweet {
    private Sweet sweet;

    @Before
    public void before(){
        sweet = new Sweet("Refreshers", 100);
    }

    @Test
    public void hasWeight(){
        assertEquals(100, sweet.getWeight());
    }
}
