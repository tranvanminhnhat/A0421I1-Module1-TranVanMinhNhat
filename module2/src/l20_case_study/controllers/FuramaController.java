package l20_case_study.controllers;

import java.util.Scanner;

public class FuramaController {
    private static Scanner scanner = new Scanner(System.in);
    private void exit(){
        System.exit(0);
    }
    private void menuEmployee(){
        System.out.println(" 1. Display list employees" +
                "\n 2. Add new employee" +
                "\n 3. Edit employee" +
                "\n 4. Return main menu");
    }

    private void menuCustomer(){
        System.out.println(" 1. Display list customers" +
                "\n 2. Add new customer" +
                "\n 3. Edit customer" +
                "\n 4. Return main menu");
    }

    private void menuFacility(){
        System.out.println(" 1. Display list facility" +
                "\n 2. Add new facility" +
                "\n 3. Display list facility maintenance" +
                "\n 4. Return main menu");
    }

    private void menuBooking(){
        System.out.println(" 1. Display list booking" +
                "\n 2. Add new booking" +
                "\n 3. Create new contracts" +
                "\n 4. Display list contracts" +
                "\n 5. Edit contracts" +
                "\n 6. Return main menu");
    }

    private void menuPromotion(){
        System.out.println(" 1. Display list customer use service" +
                "\n 2. Display list customer get voucher" +
                "\n 3. Return main menu");
    }

    private void mainMenu(){
        System.out.println(" 1. Employee management" +
                "\n 2. Customer management" +
                "\n 3. Facility management" +
                "\n 4. Booking management" +
                "\n 5. Promotion management" +
                "\n 6. Exit");
    }

    public void displayMenu(){
        int choice = 0;
        while (true){
            mainMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.skip("\\R");
            switch (choice){
                case 1:
                    menuEmployee();
                    System.out.print("Enter your choice: ");
                    choice = scanner.nextInt();
                    scanner.skip("\\R");
                    switch (choice){
                        case 1:
                            EmployeeManagement.displayListEmployees();
                            break;
                        case 2:
                            EmployeeManagement.addNewEmployee();
                            break;
                        case 3:
                            EmployeeManagement.editEmployee();
                            break;
                        case 4:
                            EmployeeManagement.returnMainMenu();
                            break;
                        default:
                            System.out.println("error choice !!!");
                    }
                    break;
                case 2:
                    menuCustomer();
                    System.out.print("Enter your choice: ");
                    choice = scanner.nextInt();
                    scanner.skip("\\R");
                    switch (choice){
                        case 1:
                            CustomerManagement.displayListCustomers();
                            break;
                        case 2:
                            CustomerManagement.addNewCustomer();
                            break;
                        case 3:
                            CustomerManagement.editCustomer();
                            break;
                        case 4:
                            CustomerManagement.returnMainMenu();
                            break;
                        default:
                            System.out.println("error choice !!!");
                    }
                    break;
                case 3:
                    menuFacility();
                    System.out.print("Enter your choice: ");
                    choice = scanner.nextInt();
                    scanner.skip("\\R");
                    switch (choice){
                        case 1:
                            FacilityManagement.displayListFacility();
                            break;
                        case 2:
                            FacilityManagement.addNewFacility();
                            break;
                        case 3:
                            FacilityManagement.displayListFacilityMaintenance();
                            break;
                        case 4:
                            FacilityManagement.returnMainMenu();
                            break;
                        default:
                            System.out.println("error choice !!!");
                    }
                    break;
                case 4:
                    menuBooking();
                    System.out.print("Enter your choice: ");
                    choice = scanner.nextInt();
                    scanner.skip("\\R");
                    switch (choice){
                        case 1:
                            BookingManagement.addNewBooking();
                            break;
                        case 2:
                            BookingManagement.displayListBooking();
                            break;
                        case 3:
                            BookingManagement.createNewContracts();
                            break;
                        case 4:
                            BookingManagement.displayListContracts();
                            break;
                        case 5:
                            BookingManagement.editContracts();
                            break;
                        case 6:
                            BookingManagement.returnMainMenu();
                            break;
                        default:
                            System.out.println("error choice !!!");
                    }
                    break;
                case 5:
                    menuPromotion();
                    System.out.print("Enter your choice: ");
                    choice = scanner.nextInt();
                    scanner.skip("\\R");
                    switch (choice){
                        case 1:
                            PromotionManagement.displayListCustomersUseService();
                            break;
                        case 2:
                            PromotionManagement.displayListCustomersGetVoucher();
                            break;
                        case 3:
                            PromotionManagement.returnMainMenu();
                            break;
                        default:
                            System.out.println("error choice !!!");
                    }
                    break;
                case 6:
                    exit();
                default:
                    System.out.println("error choice !!!");

            }
        }
    }
}
