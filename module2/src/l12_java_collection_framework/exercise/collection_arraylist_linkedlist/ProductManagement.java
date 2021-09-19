package l12_java_collection_framework.exercise.collection_arraylist_linkedlist;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductManagement {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Product> productList;

    static {
        productList = new ArrayList<>();
    }

    private static void addProduct(){
        int id = -1;
        if (productList.isEmpty()){
            id = 1;
        }else {
            id = productList.get(productList.size()-1).getId() + 1;
        }
        System.out.println("Enter the prices of product");
        double prices = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter the name of product");
        String name = scanner.nextLine();
        productList.add(new Product(id, name, prices));
    }

    private static void repair(){
        System.out.println("Enter the id of product that you want to repair: ");
        int id = scanner.nextInt();
        for (Product product : productList){
            if (product.getId() == id){
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

    private static void delete(){
        try{
            System.out.println("Enter id of product");
            int id = Integer.parseInt(scanner.nextLine());
            Product product= findById(id);

            System.out.println("Are you sure to delete the product " + product.getName()
                    + "\n Yes"
                    + "\n No");
            System.out.print("Your choice: ");
            if (scanner.nextLine().equals("Yes")){
                productList.remove(product);
            }else {
                menu();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void display(){
        for (Product product : productList){
            System.out.println("-------------------------");
            System.out.println(product);
            System.out.println("------------------------");
        }
    }

    public static void menu(){
        int choice = 0;
        while (true){
            System.out.println("Please choose: " +
                    "\n 1. Add" +
                    "\n 2. Remove" +
                    "\n 3. Repair" +
                    "\n 4. Search" +
                    "\n 5. Ascending" +
                    "\n 6. Descending" +
                    "\n 7. Display" +
                    "\n 8. Exit");
            System.out.println("------------------------------");
            System.out.print("Enter you choice: ");
            choice = scanner.nextInt();
            scanner.skip("\\R");
            switch (choice){
                case 1:
                    addProduct();
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    repair();
                    break;
                case 4:
                    search();
                    break;
                case 5:
                    ascendingSort();
                    break;
                case 6:
                    descendingSort();
                    break;
                case 7:
                    display();
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Error Choice !!!");
            }
        }
    }
    private static Product findById(int id) throws ProductNotFoundException{
        Product product = null;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id){
                product = productList.get(i);
            }
        }
        if (product == null){
            throw new ProductNotFoundException("Not found");
        }
        return product;
    }

    private static void search(){
        try {
            System.out.print("Enter the id of the product");
            int id = scanner.nextInt();
            scanner.skip("\\R");
            System.out.println("-------------------------");
            System.out.println("ID: " + findById(id).getId()
                    + "\nName: " + findById(id).getName()
                    + "\nPrices: " + findById(id).getPrices());
            System.out.println("-------------------------");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void ascendingSort(){
        PricesComparatorAscending pricesComparatorAscending = new PricesComparatorAscending();
        Collections.sort(productList, pricesComparatorAscending);
    }

    private static void descendingSort(){
        PricesComparatorDescending pricesComparatorDescending = new PricesComparatorDescending();
        Collections.sort(productList, pricesComparatorDescending);
    }
}
