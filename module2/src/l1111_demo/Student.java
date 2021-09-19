package l1111_demo;

public class Student {
    private int id;
    private String fullName;
    private String birthday;
    private String sex;
    private String phoneNumber;
    private String universityName;
    private int gradeLevel;

    public Student() {
    }

    public Student(int id, String fullName, String birthday, String sex, String phoneNumber, String universityName, int gradeLevel) throws InvalidFullNameException, InvalidDOBException, InvalidPhoneNumberException {
        this.id = id;
        FullNameRegex fullNameRegex = new FullNameRegex();
        if (fullNameRegex.validate(fullName)){
            this.fullName = fullName;
        }else {
            throw new InvalidFullNameException("The name is not in the correct format");
        }

        BirthdayRegex birthdayRegex = new BirthdayRegex();
        if (birthdayRegex.validate(birthday)){
            this.birthday = birthday;
        }else {
            throw new InvalidDOBException("You entered your birthday in the wrong format");
        }
        this.sex = sex;

        PhoneNumberRegex phoneNumberRegex = new PhoneNumberRegex();
        if (phoneNumberRegex.validate(phoneNumber)){
            this.phoneNumber = phoneNumber;
        }else {
            throw new InvalidPhoneNumberException("You entered the wrong phone number");
        }

        this.universityName = universityName;
        this.gradeLevel = gradeLevel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) throws InvalidFullNameException {
        FullNameRegex fullNameRegex = new FullNameRegex();
        if (fullNameRegex.validate(fullName)){
            this.fullName = fullName;
        }else {
            throw new InvalidFullNameException("The name is not in the correct format");
        }
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) throws InvalidDOBException {
        BirthdayRegex birthdayRegex = new BirthdayRegex();
        if (birthdayRegex.validate(birthday)){
            this.birthday = birthday;
        }else {
            throw new InvalidDOBException("You entered your birthday in the wrong format");
        }
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) throws InvalidPhoneNumberException {
        PhoneNumberRegex phoneNumberRegex = new PhoneNumberRegex();
        if (phoneNumberRegex.validate(phoneNumber)){
            this.phoneNumber = phoneNumber;
        }else {
            throw new InvalidPhoneNumberException("You entered the wrong phone number");
        }
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", birthday='" + birthday + '\'' +
                ", sex='" + sex + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", universityName='" + universityName + '\'' +
                ", gradeLevel=" + gradeLevel +
                '}';
    }
}
