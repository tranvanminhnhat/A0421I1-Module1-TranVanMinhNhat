package l20_case_study.models;

public class Customer extends Person{
    private String typeCustomer;

    public Customer() {
    }

    public Customer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public Customer(String id, String name, String age, String sex, String idCard, String email, String address, String typeCustomer) {
        super(id, name, age, sex, idCard, email, address);
        this.typeCustomer = typeCustomer;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "typeCustomer='" + typeCustomer + '\'' +
                "} " + super.toString();
    }
}
