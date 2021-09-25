package l20_case_study.controllers;


import l20_case_study.services.impl.*;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        displayMenu();
    }
    public static void displayMenu(){
        boolean check = true;
        int choice = 0;
        while (check){
            System.out.println(" 1. Employee Management" +
                             "\n 2. Customer Management" +
                             "\n 3. Facility Management " +
                             "\n 4. Booking Management" +
                             "\n 5. Promotion Management" +
                             "\n 6. Exit");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your choice: ");
            try{
                choice = scanner.nextInt();
            }catch (NumberFormatException e){
                System.out.println("You had entered the wrong number format, please enter again");
            }

            switch (choice){
                case 1:
                    displayEmployeeManagement();
                    break;
                case 2:
                    displayCustomerManagement();
                    break;
                case 3:
                    displayFacilityManagement();
                    break;
                case 4:
                    displayBookingManagement();
                    break;
                case 5:
                    displayPromotionManagement();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("error choice");
            }
        }
    }

    public static void displayEmployeeManagement(){
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();

        boolean check = true;
        int choice = 0;

        while (check){
            System.out.println(" 1. Display list employees" +
                             "\n 2. Add new employee" +
                             "\n 3. Edit employee" +
                             "\n 4. Return main menu");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your choice: ");

            try{
                choice = scanner.nextInt();
            }catch (NumberFormatException e){
                System.out.println("You had entered the wrong number format, please enter again");
            }

            switch (choice){
                case 1:
                    employeeService.display();
                    break;
                case 2:
                    employeeService.addNew();
                    break;
                case 3:
                    employeeService.edit();
                    break;
                case 4:
                    displayMenu();
                    break;
                default:
                    System.out.println("error choice");
            }
        }
    }

    public static void displayCustomerManagement(){
        CustomerServiceImpl customerService = new CustomerServiceImpl();

        boolean check = true;
        int choice = 0;

        while (check){
            System.out.println(" 1. Display list customers" +
                             "\n 2. Add new customer" +
                             "\n 3. Edit customer" +
                             "\n 4. Return main menu");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your choice: ");

            try{
                choice = scanner.nextInt();
            }catch (NumberFormatException e){
                System.out.println("You had entered the wrong number format, please enter again");
            }

            switch (choice){
                case 1:
                    customerService.display();
                    break;
                case 2:
                    customerService.addNew();
                    break;
                case 3:
                    customerService.edit();
                    break;
                case 4:
                    displayMenu();
                    break;
                default:
                    System.out.println("error choice");
            }
        }
    }

    public static void displayFacilityManagement(){
        FacilityServiceImpl facilityService = new FacilityServiceImpl();

        boolean check = true;
        int choice = 0;

        while (check){
            System.out.println(" 1. Display list facility" +
                             "\n 2. Add new facility" +
                             "\n 3. Display list facility maintenance" +
                             "\n 4. Return main menu");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your choice: ");

            try{
                choice = scanner.nextInt();
            }catch (NumberFormatException e){
                System.out.println("You had entered the wrong number format, please enter again");
            }

            switch (choice){
                case 1:
                    facilityService.display();
                    break;
                case 2:
                    addNewFacilityMenu();
                    break;
                case 3:
//                    Display list facility maintenance
                    break;
                case 4:
                        displayMenu();
                    break;
                default:
                    System.out.println("error choice");
            }
        }
    }

    public static void addNewFacilityMenu(){
        FacilityServiceImpl facilityService = new FacilityServiceImpl();

        boolean check = true;
        int choice = 0;

        while (check){
            System.out.println(" 1. Add new villa" +
                             "\n 2. Add new house" +
                             "\n 3. Add new room" +
                             "\n 4. Back to menu");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your choice: ");

            try{
                choice = scanner.nextInt();
            }catch (NumberFormatException e){
                System.out.println("You had entered the wrong number format, please enter again");
            }

            switch (choice){
                case 1:
                    facilityService.addNewVilla();
                    break;
                case 2:
                    facilityService.addNewHouse();
                    break;
                case 3:
                    facilityService.addNewRoom();
                    break;
                case 4:
                    displayFacilityManagement();
                    break;
                default:
                    System.out.println("error choice");

            }
        }
    }



    public static void displayBookingManagement(){
        BookingServiceImpl bookingService = new BookingServiceImpl();
        ContractServiceImpl contractService = new ContractServiceImpl();

        boolean check = true;
        int choice = 0;

        while (check){
            System.out.println(" 1. Add new booking" +
                             "\n 2. Display list booking" +
                             "\n 3. Create new contracts" +
                             "\n 4. Display list contracts" +
                             "\n 5. Edit contracts" +
                             "\n 6. Return main menu");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your choice: ");

            try{
                choice = scanner.nextInt();
            }catch (NumberFormatException e){
                System.out.println("You had entered the wrong number format, please enter again");
            }

            switch (choice){
                case 1:
                    bookingService.addNew();
                    break;
                case 2:
                    bookingService.display();
                    break;
                case 3:
                    contractService.addNew();
                    break;
                case 4:
                    contractService.display();
                    break;
                case 5:
//                    Edit contracts
                    break;
                case 6:
                    displayMenu();
                    break;
                default:
                    System.out.println("error choice");
            }
        }
    }

    public static void displayPromotionManagement(){

        boolean check = true;
        int choice = 0;

        while (check){
            System.out.println(" 1. Display list customers use service" +
                             "\n 2. Display list customers get voucher" +
                             "\n 3. Return main menu");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your choice: ");

            try{
                choice = scanner.nextInt();
            }catch (NumberFormatException e){
                System.out.println("You had entered the wrong number format, please enter again");
            }

            switch (choice){
                case 1:
//                    Display list customers use service
                    break;
                case 2:
//                    Display list customers get voucher
                    break;
                case 3:
//                    Return main menu
                    break;
                default:
                    System.out.println("error choice");
            }
        }
    }
}
