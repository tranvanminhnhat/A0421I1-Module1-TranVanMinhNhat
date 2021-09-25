package l21_final_examination;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManagement {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Product> productList;

    static {
        productList = new ArrayList<>();
    }
    
    public static void menu(){
        int choice = 0;
        while (true) {
            System.out.println("Please choose: " +
                    "\n 1. Add new" +
                    "\n 2. Remove" +
                    "\n 3. Display" +
                    "\n 4. Search" +
                    "\n 5. Exit");
            System.out.println("------------------------------");
            System.out.print("Enter you choice: ");
            choice = scanner.nextInt();
            scanner.skip("\\R");
            switch (choice){
                case 1:
                    addNew();
                    break;
                case 2:
                    remove();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    search();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Error choice");
                    break;
            }
        }
    }

    private static void search() {
        try {
            System.out.println("Enter the id of the product: ");
            int id = scanner.nextInt();
            scanner.skip("\\R");
            System.out.println("-------------------------");
            System.out.println("ID: " + findById(id).getId()
                    + "\nName: " + findById(id).getNameProduct()
                    + "\nPrices: " + findById(id).getPrice());
            System.out.println("-------------------------");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void display() {
        productList = (List<Product>) ReadAndWriteFile.read("D:\\nhat_coder\\CodeGym\\GIT_HUB\\module2\\src\\l21_final_examination\\products.csv");
        for (Product product : productList){
            System.out.println("-------------------------");
            System.out.println(product.toString());
            System.out.println("------------------------");
        }
    }

    private static void remove() {
        try{
            System.out.println("Enter id of product");
            int id = Integer.parseInt(scanner.nextLine());
            Product product = findById(id);

            System.out.println("Are you sure to delete the product " + product.getNameProduct()
                    + "\n Yes"
                    + "\n No");
            System.out.print("Your choice: ");
            if (scanner.nextLine().equals("Yes")){
                productList.remove(product);
                System.out.println("Remove Successfully!!!");
                ReadAndWriteFile.write(productList, "D:\\nhat_coder\\CodeGym\\GIT_HUB\\module2\\src\\l21_final_examination\\products.csv");
            }else {
                menu();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static Product findById(int id) throws ProductNotFoundException {
        Product product = null;
        productList = (List<Product>) ReadAndWriteFile.read("D:\\nhat_coder\\CodeGym\\GIT_HUB\\module2\\src\\l21_final_examination\\products.csv");
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

    private static void addNew() {
        int id = -1;
        if (productList.isEmpty()){
            id = 1;
        }else {
            id = productList.get(productList.size()-1).getId() + 1;
        }
        System.out.println("Do you want to add imported or exported products?" +
                            "\n 1. Export" +
                            "\n 2. Import");
        System.out.println("Enter your choice: ");
        int temp = Integer.parseInt(scanner.nextLine());


        String code;
        do {
            System.out.println("code product: ");
            code = scanner.nextLine();
        }while (code.equals(""));

        String name;
        do{
            System.out.println("name product: ");
            name = scanner.nextLine();
        }while (name.equals(""));

        double price;
        while (true){
            System.out.println("price product");
            try {
                price = Double.parseDouble(scanner.nextLine());
                if (price > 0){
                    break;
                }else {
                    System.out.println("Please enter the number that is more than zero");
                    continue;
                }

            }catch (NumberFormatException e){
                System.out.println("Please enter the number that is right format");
            }
        }

        int quantity;
        while (true){
            System.out.println("quantity product: ");
            try {
                quantity = Integer.parseInt(scanner.nextLine());
                if (quantity > 0){
                    break;
                }else {
                    System.out.println("Please enter the number that is more than zero");
                    continue;
                }

            }catch (NumberFormatException e){
                System.out.println("Please enter the number that is right format");
            }
        }

        String producer;
        do{
            System.out.println("producer");
            producer = scanner.nextLine();
        }while (producer.equals(""));
        if (temp == 1){

            int exportPrice;
            while (true){
                System.out.println("export product price: ");
                try {
                    exportPrice = Integer.parseInt(scanner.nextLine());
                    if (exportPrice > 0){
                        break;
                    }else {
                        System.out.println("Please enter the number that is more than zero");
                        continue;
                    }

                }catch (NumberFormatException e){
                    System.out.println("Please enter the number that is right format");
                }
            }

            String importProductCountry;
            do{
                System.out.println("import product country: ");
                importProductCountry = scanner.nextLine();
            }while (importProductCountry.equals(""));
            productList.add(new ExportedProduct(id, code, name, price, quantity, producer, exportPrice, importProductCountry));
        }else if (temp == 2){

            double importedPrice;
            while (true){
                System.out.println("import price: ");
                try {
                    importedPrice = Double.parseDouble(scanner.nextLine());
                    if (importedPrice > 0){
                        break;
                    }else {
                        System.out.println("Please enter the number that is more than zero");
                        continue;
                    }

                }catch (NumberFormatException e){
                    System.out.println("Please enter the number that is right format");
                }
            }

            String province;
            do{
                System.out.println("import province: ");
                province = scanner.nextLine();
            }while (province.equals(""));


            double importTax;
            while (true){
                System.out.println("import tax: ");
                try {
                    importTax = Double.parseDouble(scanner.nextLine());
                    if (importTax > 0){
                        break;
                    }else {
                        System.out.println("Please enter the number that is more than zero");
                        continue;
                    }

                }catch (NumberFormatException e){
                    System.out.println("Please enter the number that is right format");
                }
            }

            productList.add(new ImportedProduct(id, code, name, price, quantity, producer, importedPrice, province, importTax));
            ReadAndWriteFile.write(productList, "D:\\nhat_coder\\CodeGym\\GIT_HUB\\module2\\src\\l21_final_examination\\products.csv");
        }
    }
}
