/**
 * Created by user on 05/03/2018.
 */
public class Sweet extends Product {

    private String name;
    private int weight;

    public Sweet(String name, int weight){
        super(name);
        this.weight = weight;
     }

    @Override
    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
}
