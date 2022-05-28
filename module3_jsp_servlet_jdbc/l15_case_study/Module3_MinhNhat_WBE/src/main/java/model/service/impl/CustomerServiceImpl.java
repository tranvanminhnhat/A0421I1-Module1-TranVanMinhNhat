package model.service.impl;

import model.bean.Customer;
import model.repository.CustomerRepository;
import model.repository.impl.CustomerRepositoryImpl;
import model.service.CustomerService;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService {
    CustomerRepository customerRepository = new CustomerRepositoryImpl();
    private final String ID_CARD_REGEX = "^[0-9]{9}$";
    private final String PHONE_NUMBER_REGEX = "^(\\+84|0[35789])+([0-9]{8,9})$";
    private final String EMAIL_REGEX = "^[a-z]{3,20}@[a-z]{3,5}\\\\.[a-z]{3,5}$";

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Map<String, String> save(Customer customer) {
        Map<String, String> messageMap = new HashMap<>();
        boolean check = true;

        //name validate
        if (customer.getCustomer_name().equals("")){
            check = false;
            messageMap.put("nameMessage", "Name can not be empty!");
        }
        try {
            check = false;
            Integer.parseInt(customer.getCustomer_name());
            messageMap.put("nameMessage", "Your name is like a number!");
        }catch (NumberFormatException e){
            check = true;
        }

        //birthday validate
        if (customer.getCustomer_birthday().equals("")){
            check = false;
            messageMap.put("birthdayMessage", "Birthday can not be empty!");
        }

        //id card validate
        if (customer.getCustomer_id_card().equals("")){
            check = false;
            messageMap.put("idCardMessage", "Id card can not be empty!");
        }else if (!validateIdCard(customer.getCustomer_id_card())){
            check = false;
            messageMap.put("idCardMessage", "This is not an id card!");
        }

        //phone number validate
        if (customer.getCustomer_phone().equals("")){
            check = false;
            messageMap.put("phoneMessage", "Phone number can not be empty");
        }else if (!validatePhoneNumber(customer.getCustomer_phone())){
            check = false;
            messageMap.put("phoneMessage", "This is not a phone number");
        }

        //email validate
        if (customer.getCustomer_email().equals("")){
            check = false;
            messageMap.put("emailMessage", "Email can not be empty!");
        }else if (!validateEmail(customer.getCustomer_email())){
            check = false;
            messageMap.put("emailMessage", "This is not an email!");
        }

        if (check){
            customerRepository.save(customer);
        }
        return messageMap;
    }

    @Override
    public Customer findById(int id) {
        return customerRepository.findById(id);
    }

    @Override
    public boolean update(Customer customer, int id) {
        return customerRepository.update(customer, id);
    }

    @Override
    public boolean delete(int id) {
        return customerRepository.delete(id);
    }

    @Override
    public List<Customer> search(String customer_name, String customer_address) {
        return customerRepository.search(customer_name, customer_address);
    }

    //validate data
    public boolean validateIdCard(String idCard){
        return idCard.matches(ID_CARD_REGEX);
    }

    public boolean validatePhoneNumber(String phoneNumber){
        return phoneNumber.matches(PHONE_NUMBER_REGEX);
    }

    public boolean validateEmail(String email){
        return email.matches(EMAIL_REGEX);
    }
}
