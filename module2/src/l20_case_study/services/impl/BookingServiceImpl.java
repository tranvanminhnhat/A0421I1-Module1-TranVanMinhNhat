package l20_case_study.services.impl;

import l20_case_study.models.Booking;
import l20_case_study.models.Customer;
import l20_case_study.models.Facility;
import l20_case_study.models.Villa;
import l20_case_study.services.BookingService;
import l20_case_study.utils.BookingComparator;

import java.util.*;

public class BookingServiceImpl implements BookingService {
    private static Set<Booking> bookingTreeSet = new TreeSet<>(new BookingComparator());

    private static List<Customer> customerList = new ArrayList<>();

    private static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();

    static {
        customerList.add(new Customer("1", "Nhat", 20, "Male", "206212471", "nhat@gmail.com", "ĐN", "VIP"));
        customerList.add(new Customer("2", "Tuan", 21, "Male", "206212471", "nhat@gmail.com", "ĐN", "VIP"));

        facilityIntegerMap.put(new Villa("1", "villa 1", 2, 150, 10,"day", "vip", 15, 2), 0);
        facilityIntegerMap.put(new Villa("2", "villa 2", 2, 150, 10,"day", "vip", 15, 2), 0);
    }

    public Set<Booking> sendBooking(){
        return bookingTreeSet;
    }

    private static Scanner scanner = new Scanner(System.in);



    @Override
    public void display() {
        for (Booking booking : bookingTreeSet){
            System.out.println(booking.toString());
        }

    }

    @Override
    public void addNew() {
        int id = 1;
        if (!bookingTreeSet.isEmpty()){
            id = bookingTreeSet.size();
        }

        Customer customer = chooseCustomer();
        Facility facility = chooseFacility();

        System.out.println("Start time: ");
        String startDate = scanner.nextLine();
        System.out.println("End time: ");
        String endDate = scanner.nextLine();

        Booking booking = new Booking(id, startDate, endDate, customer, facility);

        bookingTreeSet.add(booking);
        System.out.println("Successfully");
    }

    public static Customer chooseCustomer(){
        System.out.println("List customer: ");
        for (Customer customer : customerList){
            System.out.println(customer.toString());
        }

        System.out.println("Enter id customer: ");
        boolean check = true;
        String id = scanner.nextLine();
        while (check){
            for (Customer customer : customerList){
                if (id == customer.getId()){
                    check = false;
                    return customer;
                }
            }

            if (check){
                System.out.println("Error id, please enter id customer again: ");
                id = scanner.nextLine();
            }
        }
        return null;
    }

    public static Facility chooseFacility(){
        System.out.println("List facility: ");
        for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()){
            System.out.println(entry.getKey().toString());
        }

        System.out.println("Enter id facility: ");
        boolean check = true;
        String id = scanner.nextLine();

        while (check){
            for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()){
                if (id.equals(entry.getKey().getIdFacility())){
                    check = false;
                    return entry.getKey();
                }
            }

            if (check){
                System.out.println("Error id, please enter id facility again: ");
                id = scanner.nextLine();
            }
        }
        return null;
    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }
}
