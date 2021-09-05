package l12_java_collection_framework.exercise.collection_arraylist_linkedlist;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductManagement {
    ArrayList<Product> productList;
    public ProductManagement() {
        this.productList = new ArrayList();
    }

    public void addProduct(Product product){
        productList.add(product);
    }

    public void repair(int id){
        for (Product product : productList){
            if (product.getId() == id){
                Scanner scanner = new Scanner(System.in);
                System.out.println("Please repair something with id is " + id +":");
                System.out.print("Product Name: ");
                product.setName(scanner.nextLine());
                System.out.print("Product Prices: ");
                product.setPrices(scanner.nextDouble());
                return;
            }
        }
        System.out.println("The id doesn't appear in the arraylist");
    }

    public void remove(int id){
        int i = 0;
        for (Product product : productList){
            if (product.getId() == id){
                productList.remove(productList.get(i));
                return;
            }
            i++;
        }
        System.out.println("The id doesn't appear in the arraylist");
    }

    public void display(){
        for (Product product : productList){
            System.out.println("-------------------------");
            System.out.println("ID: " + product.getId());
            System.out.println("Name: " + product.getName());
            System.out.println("Prices: " + product.getPrices());
            System.out.println("------------------------");
        }
    }

    public Product searchProduct(String nameProduct){
        for (Product product : productList){
            if (product.getName() == nameProduct){
                return product;
            }
        }
        return null;
    }

    public void ascendingSort(){
        PricesComparatorAscending pricesComparatorAscending = new PricesComparatorAscending();
        Collections.sort(productList, pricesComparatorAscending);
    }

    public void descendingSort(){
        PricesComparatorDescending pricesComparatorDescending = new PricesComparatorDescending();
        Collections.sort(productList, pricesComparatorDescending);
    }
}
