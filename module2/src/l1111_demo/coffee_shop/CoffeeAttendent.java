package l1111_demo.coffee_shop;

import java.util.ArrayList;
import java.util.List;

public class CoffeeAttendent {
    private List<Customer> waitingCustomers = new ArrayList<>();
    private List<String> completeDrink = new ArrayList<>();

    public CoffeeAttendent(List<Customer> waitingCustomers, List<String> completeDrink) {
        this.waitingCustomers = waitingCustomers;
        this.completeDrink = completeDrink;
    }

    public CoffeeAttendent() {
    }

    public void takeOrder(Customer customer){
        waitingCustomers.add(customer);
        System.out.println("Coffee Attendent: " + customer.getName()
                    + ", I've started working on your order of "
                    + customer.getDrinkOrdered());
    }

    public void prepareDrink(String drinkToPrepare){
        double timeTaken = Math.random()*10;
        try {
            Thread.sleep((long) (timeTaken)*1000);
            completeDrink.add(drinkToPrepare);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void callOutCompleteOrder(){
        for (String readyDrink : completeDrink){
            System.out.println("Order up: " + readyDrink);
            for (Customer customer : waitingCustomers){
                customer.orderReady(readyDrink);
            }
        }
    }
}
