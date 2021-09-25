package l20_case_study.services.impl;

import l20_case_study.models.Customer;
import l20_case_study.services.CustomerService;
import l20_case_study.utils.ReadAndWriteFile;
import l20_case_study.utils.RegexData;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {

    public static final String REGEX_ID_CUSTOMER = "1";
    public static final String REGEX_NAME_CUSTOMER = "1";
    public static final String REGEX_AGE_CUSTOMER = "1";
    public static final String REGEX_GENDER_CUSTOMER = "1";
    public static final String REGEX_ID_CARD_CUSTOMER = "1";
    public static final String REGEX_EMAIL_CUSTOMER = "1";
    public static final String REGEX_ADDRESS_CUSTOMER = "1";
    public static final String REGEX_TYPE_OF_CUSTOMER = "1";

    private static List<Customer> customerList = new LinkedList<>();
    private static Scanner scanner = new Scanner(System.in);

    public List<Customer> sendCustomer(){
        return customerList;
    }

    private String inputId(){
        System.out.println("Enter id customer: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_ID_CUSTOMER, "You had entered wrong format");
    }

    private String inputName(){
        System.out.println("Enter name customer: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_NAME_CUSTOMER, "You had entered wrong format");
    }

    private String inputAge(){
        System.out.println("Enter age customer: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_AGE_CUSTOMER, "You had entered wrong format");
    }

    private String inputGender(){
        System.out.println("Enter gender customer: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_GENDER_CUSTOMER, "You had entered wrong format");
    }

    private String inputIdCard(){
        System.out.println("Enter id card customer: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_ID_CARD_CUSTOMER, "You had entered wrong format");
    }

    private String inputEmail(){
        System.out.println("Enter email customer: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_EMAIL_CUSTOMER, "You had entered wrong format");
    }

    private String inputAddress(){
        System.out.println("Enter address customer: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_ADDRESS_CUSTOMER, "You had entered wrong format");
    }

    private String inputTypeOfCustomer(){
        System.out.println("Enter type of customer: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_TYPE_OF_CUSTOMER, "You had entered wrong format");
    }

    @Override
    public void display() {
        customerList = (List<Customer>) ReadAndWriteFile.read("D:\\nhat_coder\\CodeGym\\GIT_HUB\\module2\\src\\l20_case_study\\data\\customer.csv");
        for (Customer customer : customerList){
            System.out.println(customer.toString());
        }
    }

    @Override
    public void addNew() {
        String id = inputId();

        String name = inputName();

        String age = inputAge();

        String gender = inputGender();

        String idCard = inputIdCard();

        String email = inputEmail();

        String address = inputAddress();

        String typeCustomer = inputTypeOfCustomer();

        Customer customer = new Customer(id, name, age, gender, idCard, email, address, typeCustomer);
        customerList.add(customer);

        ReadAndWriteFile.write(customerList, "D:\\nhat_coder\\CodeGym\\GIT_HUB\\module2\\src\\l20_case_study\\data\\customer.csv");
    }

    @Override
    public void edit() {
        String id = inputId();
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId().equals(id)){
                customerList.get(i).setName(inputName());

                customerList.get(i).setAge(inputAge());

                customerList.get(i).setSex(inputGender());

                customerList.get(i).setIdCard(inputIdCard());

                customerList.get(i).setEmail(inputEmail());

                customerList.get(i).setAddress(inputAddress());

                customerList.get(i).setTypeCustomer(inputTypeOfCustomer());

                ReadAndWriteFile.write(customerList, "D:\\nhat_coder\\CodeGym\\GIT_HUB\\module2\\src\\l20_case_study\\data\\customer.csv");
                return;
            }
        }
        System.out.println("Customer doesn't exist");
    }

    @Override
    public void delete() {
        String id = inputId();
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId().equals(id)){
                customerList.remove(i);
                ReadAndWriteFile.write(customerList, "D:\\nhat_coder\\CodeGym\\GIT_HUB\\module2\\src\\l20_case_study\\data\\customer.csv");
                return;
            }
        }
        System.out.println("Customer doesn't exist");
    }
}
