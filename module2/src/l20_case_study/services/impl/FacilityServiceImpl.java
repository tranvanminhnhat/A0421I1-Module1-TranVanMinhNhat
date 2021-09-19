package l20_case_study.services.impl;

import l20_case_study.models.Facility;
import l20_case_study.models.House;
import l20_case_study.models.Room;
import l20_case_study.models.Villa;
import l20_case_study.services.FacilityService;

import java.util.*;

public class FacilityServiceImpl implements FacilityService {
    private static Map<Facility, Integer> facilityList = new LinkedHashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        for (Map.Entry<Facility, Integer> facility : facilityList.entrySet()){
            System.out.println("Service " + facility.getKey() + "Number of times rented " + facility.getValue());
        }
    }

    @Override
    public void addNew() {
    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void displayMaintenance() {

    }

    @Override
    public void addNewVilla() {
        System.out.print("Enter id: ");
        String id = scanner.nextLine();
        System.out.print("Enter name service: ");
        String nameService = scanner.nextLine();
        System.out.print("Enter area: ");
        double areaUse = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter rental price: ");
        int rentalPrice = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter rental people max: ");
        int rentalPeopleMax = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter style rental: ");
        String styleRental = scanner.nextLine();
        System.out.print("Enter standard villa: ");
        String standardVilla = scanner.nextLine();
        System.out.print("Enter area pool: ");
        double areaPool = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter number of floor: ");
        int floor = Integer.parseInt(scanner.nextLine());

        Villa villa = new Villa(id, nameService, areaUse, rentalPrice, rentalPeopleMax, styleRental, standardVilla, areaPool, floor);
        facilityList.put(villa, 0);
        System.out.println("Successfully");
    }

    @Override
    public void addNewHouse() {
        System.out.print("Enter id: ");
        String id = scanner.nextLine();
        System.out.print("Enter name service: ");
        String nameService = scanner.nextLine();
        System.out.print("Enter area: ");
        double areaUse = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter rental price: ");
        int rentalPrice = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter rental people max: ");
        int rentalPeopleMax = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter style rental: ");
        String styleRental = scanner.nextLine();
        System.out.print("Enter direction: ");
        String direction = scanner.nextLine();
        System.out.print("Enter number of floor: ");
        int floor = Integer.parseInt(scanner.nextLine());

        House house = new House(id, nameService, areaUse, rentalPrice, rentalPeopleMax, styleRental, direction, floor);
        facilityList.put(house, 0);
        System.out.println("Successfully");
    }

    @Override
    public void addNewRoom() {
        System.out.print("Enter id: ");
        String id = scanner.nextLine();
        System.out.print("Enter name service: ");
        String nameService = scanner.nextLine();
        System.out.print("Enter area: ");
        double areaUse = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter rental price: ");
        int rentalPrice = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter rental people max: ");
        int rentalPeopleMax = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter style rental: ");
        String styleRental = scanner.nextLine();
        System.out.print("Is there any furniture?" +
                        "\n 1. Yes" +
                        "\n 2. No");
        int temp = scanner.nextInt();
        boolean furniture;
        if (temp == 1){
            furniture = true;
        }else {
            furniture = false;
        }

        Room room = new Room(id, nameService, areaUse, rentalPrice, rentalPeopleMax, styleRental, furniture);
        facilityList.put(room, 0);
        System.out.println("Successfully");
    }
}
