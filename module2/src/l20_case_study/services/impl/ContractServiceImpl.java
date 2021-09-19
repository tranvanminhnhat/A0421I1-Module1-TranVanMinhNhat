package l20_case_study.services.impl;

import l20_case_study.models.Booking;
import l20_case_study.models.Contract;
import l20_case_study.models.Customer;
import l20_case_study.services.ContractService;

import java.util.*;

public class ContractServiceImpl implements ContractService {

    private static List<Contract> contractList = new ArrayList<>();

    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        for (Contract contract : contractList){
            System.out.println(contract.toString());
        }
    }

    @Override
    public void addNew() {
        Queue<Booking> bookingQueue = new LinkedList<>();
        Set<Booking> bookingSet = new BookingServiceImpl().sendBooking();

        for (Booking booking : bookingSet){
            bookingQueue.add(booking);
        }

        while (!bookingQueue.isEmpty()){
            Booking booking = bookingQueue.poll();
            Customer customer = booking.getCustomer();

            System.out.println("The contract is being created: " + booking.toString());
            System.out.println("The customer is being created: " + customer.toString());

            System.out.println("Enter id: ");
            String id = scanner.nextLine();

            System.out.println("Prepayment amount: ");
            String prepayment = scanner.nextLine();
            System.out.println("Total: ");
            String total = scanner.nextLine();

            Contract contract = new Contract(id, booking, prepayment, total, customer);
            contractList.add(contract);
            System.out.println("Successfully: " + contract.toString());

        }
    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }
}
