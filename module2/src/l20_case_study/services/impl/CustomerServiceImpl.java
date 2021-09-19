package l20_case_study.services.impl;

import l20_case_study.models.Customer;
import l20_case_study.services.CustomerService;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    private static List<Customer> customerList = new LinkedList<>();
    private static Scanner scanner = new Scanner(System.in);



    @Override
    public void display() {
        for (Customer customer : customerList){
            System.out.println(customer.toString());
        }
    }

    @Override
    public void addNew() {
        System.out.print("Enter id: ");
        String id = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter gender: ");
        String sex = scanner.nextLine();
        System.out.print("Enter ID card: ");
        String idCard = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        System.out.print("Enter address: ");
        String address = scanner.nextLine();
        System.out.print("Enter type of customer: ");
        String typeCustomer = scanner.nextLine();
        Customer customer = new Customer(id, name, age, sex, idCard, email, address, typeCustomer);
        customerList.add(customer);
    }

    @Override
    public void edit() {
        System.out.print("Enter id customer that you want to edit: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId() == id){
                System.out.print("Enter name: ");
                customerList.get(i).setName(scanner.nextLine());
                System.out.print("Enter age: ");
                customerList.get(i).setAge(Integer.parseInt(scanner.nextLine()));
                System.out.print("Enter gender: ");
                customerList.get(i).setSex(scanner.nextLine());
                System.out.print("Enter ID card: ");
                customerList.get(i).setIdCard(Integer.parseInt(scanner.nextLine()));
                System.out.print("Enter email: ");
                customerList.get(i).setEmail(scanner.nextLine());
                System.out.print("Enter address: ");
                customerList.get(i).setAddress(scanner.nextLine());
                System.out.print("Enter type of customer: ");
                customerList.get(i).setTypeCustomer(scanner.nextLine());
                System.out.print("Enter position: ");
                return;
            }
        }
        System.out.println("Customer doesn't exist");
    }

    @Override
    public void delete() {
        System.out.print("Enter id customer that you want to delete: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId() == id){
                customerList.remove(i);
                return;
            }
        }
        System.out.println("Customer doesn't exist");
    }
}
