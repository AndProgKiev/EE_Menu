import javax.persistence.*;

@Entity

public class Dish {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private int price;
    private int weightGram;
    private boolean discount;

    public Dish() {
    }

    public Dish(String name, int price, int weightGram, boolean discount) {
        this.name = name;
        this.price = price;
        this.weightGram = weightGram;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getWeightGram() {
        return weightGram;
    }

    public int getId() {
        return id;
    }

    public boolean isDiscount() {
        return discount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int cost) {
        this.price = cost;
    }

    public void setWeightGram(int weightGram) {
        this.weightGram = weightGram;
    }

    public void setDiscount(boolean discount) {
        this.discount = discount;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", weightGram=" + weightGram +
                ", discount=" + discount +
                '}';
    }
}
