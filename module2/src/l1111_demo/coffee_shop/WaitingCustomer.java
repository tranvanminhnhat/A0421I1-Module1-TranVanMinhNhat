package l1111_demo.coffee_shop;

public interface WaitingCustomer {
    String getName();
    String getDrinkOrdered();

    void orderReady(String completedDrink);
}
