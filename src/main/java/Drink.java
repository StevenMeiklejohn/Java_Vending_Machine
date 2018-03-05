/**
 * Created by user on 05/03/2018.
 */
public class Drink extends Product{

    private String name;
    private int volume;

    public Drink(String name, int volume) {
        super(name);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }
}
