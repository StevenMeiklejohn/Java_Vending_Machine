import java.util.ArrayList;

/**
 * Created by user on 05/03/2018.
 */
public class Tray {
    private ArrayList<Product> stock;
    private double price;
    private int capacity;

    public Tray(double price, int capacity){
        this.price = price;
        this.capacity = capacity;
        this.stock = new ArrayList<>();
    }

    public ArrayList<Product> getStock() {
        return stock;
    }

    public double getPrice() {
        return price;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getStockLevel(){
        return this.stock.size();
    }

    public void addItem(Product product){
        if(stock.size() < capacity) {
            stock.add(product);
        }
    }

    public Product ejectProduct(){
        return stock.remove(0);
    }
}
