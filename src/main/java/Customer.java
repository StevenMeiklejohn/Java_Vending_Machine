import java.util.ArrayList;

/**
 * Created by user on 05/03/2018.
 */
public class Customer {

    String name;
    double cash;
    ArrayList<Product> inventory;

    public Customer(String name, double cash){
        this.name = name;
        this.cash = cash;
        this.inventory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public double getCash() {
        return cash;
    }

    public ArrayList<Product> getInventory() {
        return inventory;
    }
}
