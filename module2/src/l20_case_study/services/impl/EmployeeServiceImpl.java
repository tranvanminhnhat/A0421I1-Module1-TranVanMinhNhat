package l20_case_study.services.impl;

import l20_case_study.models.Customer;
import l20_case_study.models.Employee;
import l20_case_study.services.EmployeeService;
import l20_case_study.utils.ReadAndWriteFile;
import l20_case_study.utils.RegexData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {

    public static final String REGEX_ID_EMPLOYEE = "1";
    public static final String REGEX_NAME_EMPLOYEE = "1";
    public static final String REGEX_AGE_EMPLOYEE = "1";
    public static final String REGEX_GENDER_EMPLOYEE =  "1";
    public static final String REGEX_ID_CARD_EMPLOYEE = "1";
    public static final String REGEX_EMAIL_EMPLOYEE = "1";
    public static final String REGEX_ADDRESS_EMPLOYEE = "1";
    public static final String REGEX_LEVEL_EMPLOYEE = "1";
    public static final String REGEX_POSITION_EMPLOYEE = "1";
    public static final String REGEX_SALARY_EMPLOYEE = "1";

    private static List<Employee> employeeList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    private String inputId(){
        System.out.println("Enter id employee: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_ID_EMPLOYEE, "You had entered wrong format");
    }

    private String inputName(){
        System.out.println("Enter name employee: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_NAME_EMPLOYEE, "You had entered wrong format");
    }

    private String inputAge(){
        System.out.println("Enter age employee: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_AGE_EMPLOYEE, "You had entered wrong format");
    }

    private String inputGender(){
        System.out.println("Enter gender employee: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_GENDER_EMPLOYEE, "You had entered wrong format");
    }

    private String inputIdCard(){
        System.out.println("Enter id card employee: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_ID_CARD_EMPLOYEE, "You had entered wrong format");
    }

    private String inputEmail(){
        System.out.println("Enter email employee: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_EMAIL_EMPLOYEE, "You had entered wrong format");
    }

    private String inputAddress(){
        System.out.println("Enter address employee: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_ADDRESS_EMPLOYEE, "You had entered wrong format");
    }

    private String inputLevel(){
        System.out.println("Enter level employee: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_LEVEL_EMPLOYEE, "You had entered wrong format");
    }

    private String inputPosition(){
        System.out.println("Enter position employee: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_POSITION_EMPLOYEE, "You had entered wrong format");
    }

    private String inputSalary(){
        System.out.println("Enter salary employee: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_SALARY_EMPLOYEE, "You had entered wrong format");
    }
    @Override
    public void display() {
        employeeList = (List<Employee>) ReadAndWriteFile.read("D:\\nhat_coder\\CodeGym\\GIT_HUB\\module2\\src\\l20_case_study\\data\\employee.csv");
        for (Employee employee : employeeList){
            System.out.println(employee.toString());
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

        String level = inputLevel();

        String position = inputPosition();

        double salary = Double.parseDouble(inputSalary());

        Employee employee = new Employee(id, name, age, gender, idCard, email, address, level, position, salary);

        employeeList.add(employee);

        ReadAndWriteFile.write(employeeList, "D:\\nhat_coder\\CodeGym\\GIT_HUB\\module2\\src\\l20_case_study\\data\\employee.csv");
    }

    @Override
    public void edit() {
        String id = inputId();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId() == id){

                employeeList.get(i).setName(inputName());

                employeeList.get(i).setAge(inputAge());

                employeeList.get(i).setSex(inputGender());

                employeeList.get(i).setIdCard(inputIdCard());

                employeeList.get(i).setEmail(inputEmail());

                employeeList.get(i).setAddress(inputAddress());

                employeeList.get(i).setLevel(inputLevel());

                employeeList.get(i).setPosition(inputPosition());

                employeeList.get(i).setSalary(Double.parseDouble(inputSalary()));

                ReadAndWriteFile.write(employeeList, "D:\\nhat_coder\\CodeGym\\GIT_HUB\\module2\\src\\l20_case_study\\data\\employee.csv");

                return;
            }
        }
        System.out.println("Employee doesn't exist");
    }

    @Override
    public void delete() {
        String id = inputId();

        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId().equals(id)){
                employeeList.remove(i);
                ReadAndWriteFile.write(employeeList, "D:\\nhat_coder\\CodeGym\\GIT_HUB\\module2\\src\\l20_case_study\\data\\employee.csv");
                return;
            }
        }
        System.out.println("Employee doesn's exist");
    }
}
