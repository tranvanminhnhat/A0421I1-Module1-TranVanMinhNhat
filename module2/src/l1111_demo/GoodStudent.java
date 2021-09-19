package l1111_demo;

public class GoodStudent extends Student{
    private double gpa;
    private String bestRewardName;

    public GoodStudent() {
    }

    public GoodStudent(int id, String fullName, String birthday, String sex, String phoneNumber, String universityName, int gradeLevel, double gpa, String bestRewardName) throws InvalidDOBException, InvalidFullNameException, InvalidPhoneNumberException {
        super(id, fullName, birthday, sex, phoneNumber, universityName, gradeLevel);
        this.gpa = gpa;
        this.bestRewardName = bestRewardName;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getBestRewardName() {
        return bestRewardName;
    }

    public void setBestRewardName(String bestRewardName) {
        this.bestRewardName = bestRewardName;
    }
}
