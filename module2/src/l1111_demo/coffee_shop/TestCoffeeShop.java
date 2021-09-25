package l1111_demo.coffee_shop;

public class TestCoffeeShop {
    public static void main(String[] args) {
        Customer robert = new Customer("robert","French vanilla");
        Customer bill = new Customer("Bill", "Hot Coffee");

        CoffeeAttendent coffeeAttendent = new CoffeeAttendent();
        coffeeAttendent.takeOrder(robert);
        coffeeAttendent.takeOrder(bill);

        coffeeAttendent.prepareDrink("French vanilla");
        coffeeAttendent.prepareDrink("Hot coffee");

        coffeeAttendent.callOutCompleteOrder();
    }



}
