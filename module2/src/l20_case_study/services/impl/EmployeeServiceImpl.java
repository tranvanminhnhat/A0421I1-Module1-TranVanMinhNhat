package l20_case_study.services.impl;

import l20_case_study.models.Employee;
import l20_case_study.services.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private static List<Employee> employeeList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        for (Employee employee : employeeList){
            System.out.println(employee.toString());
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
        System.out.print("Enter level: ");
        String level = scanner.nextLine();
        System.out.print("Enter position: ");
        String position = scanner.nextLine();
        System.out.print("Enter salary: ");
        int salary = scanner.nextInt();
        Employee employee = new Employee(id,name,age,sex,idCard,email,address,level,position,salary);
        employeeList.add(employee);
    }

    @Override
    public void edit() {
        System.out.print("Enter id employee that you want to edit: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId() == id){
                System.out.print("Enter name: ");
                employeeList.get(i).setName(scanner.nextLine());
                System.out.print("Enter age: ");
                employeeList.get(i).setAge(Integer.parseInt(scanner.nextLine()));
                System.out.print("Enter gender: ");
                employeeList.get(i).setSex(scanner.nextLine());
                System.out.print("Enter ID card: ");
                employeeList.get(i).setIdCard(Integer.parseInt(scanner.nextLine()));
                System.out.print("Enter email: ");
                employeeList.get(i).setEmail(scanner.nextLine());
                System.out.print("Enter address: ");
                employeeList.get(i).setAddress(scanner.nextLine());
                System.out.print("Enter level: ");
                employeeList.get(i).setLevel(scanner.nextLine());
                System.out.print("Enter position: ");
                employeeList.get(i).setPosition(scanner.nextLine());
                System.out.print("Enter salary: ");
                employeeList.get(i).setSalary(Integer.parseInt(scanner.nextLine()));
                return;
            }
        }
        System.out.println("Employee doesn't exist");
    }

    @Override
    public void delete() {
        System.out.print("Enter id employee that you want to delete: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId() == id){
                employeeList.remove(i);
                return;
            }
        }
        System.out.println("Employee doesn's exist");
    }
}
