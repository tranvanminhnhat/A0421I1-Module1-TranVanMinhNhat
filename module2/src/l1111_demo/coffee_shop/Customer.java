package l1111_demo.coffee_shop;

public class Customer implements WaitingCustomer{
    private String name;
    private String drinkOrder;

    public Customer() {
    }

    public Customer(String name, String drinkOrder) {
        this.name = name;
        this.drinkOrder = drinkOrder;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getDrinkOrdered() {
        return drinkOrder;
    }

    @Override
    public void orderReady(String completedDrink) {
        if (drinkOrder.equals(completedDrink)){
            toString();
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDrinkOrder() {
        return drinkOrder;
    }

    public void setDrinkOrder(String drinkOrder) {
        this.drinkOrder = drinkOrder;
    }



    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", drinkOrder='" + drinkOrder + '\'' +
                '}';
    }
}
