package l1111_demo;

public class Test {
    public static void main(String[] args) throws InvalidDOBException, InvalidFullNameException, InvalidPhoneNumberException {
        StudentManagement studentManagement = new StudentManagement();
        studentManagement.addStudent();
        studentManagement.addStudent();
        studentManagement.addStudent();
        studentManagement.display();
    }
}
