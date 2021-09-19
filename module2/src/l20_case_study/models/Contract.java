package l20_case_study.models;

public class Contract {
    private String id;
    private Booking booking;
    private String prepayment;
    private String total;
    private Customer customer;

    public Contract() {
    }

    public Contract(String id, Booking booking, String prepayment, String total, Customer customer) {
        this.id = id;
        this.booking = booking;
        this.prepayment = prepayment;
        this.total = total;
        this.customer = customer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public String getPrepayment() {
        return prepayment;
    }

    public void setPrepayment(String prepayment) {
        this.prepayment = prepayment;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "id='" + id + '\'' +
                ", booking=" + booking +
                ", prepayment='" + prepayment + '\'' +
                ", total='" + total + '\'' +
                ", customer=" + customer +
                '}';
    }
}
