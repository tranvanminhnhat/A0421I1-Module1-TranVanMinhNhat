package l12_java_collection_framework.exercise.collection_arraylist_linkedlist;

public class Product {
    private int id;
    private String name;
    private double prices;

    public Product() {
    }

    public Product(int id, String name, double prices) {
        this.id = id;
        this.name = name;
        this.prices = prices;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrices() {
        return prices;
    }

    public void setPrices(double prices) {
        this.prices = prices;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", prices=" + prices +
                '}';
    }
}
