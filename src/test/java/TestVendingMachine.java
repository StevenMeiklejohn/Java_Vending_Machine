import org.junit.Before;

import java.util.HashMap;

/**
 * Created by user on 05/03/2018.
 */
public class TestVendingMachine {
    private VendingMachine vendingMachine;

    @Before
    public void before(){
        HashMap<Selection, Tray> products = new HashMap<>();
        for(Selection selection : Selection.values()){
            Tray tray = new Tray(0.50, 10);
            for(int i = 0; i < 5; i++){
                Sweet refreshers = new Sweet("Refreshers", 10);
                tray.addItem(refreshers);
            }
            products.put(selection, tray);
        }



        vendingMachine = new VendingMachine(products, 10.00);
    }
}
