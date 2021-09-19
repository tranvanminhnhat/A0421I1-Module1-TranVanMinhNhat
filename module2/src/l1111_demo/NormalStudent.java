package l1111_demo;

public class NormalStudent extends Student{
    private double englishScore;
    private double entryTestScore;

    public NormalStudent() {
    }

    public NormalStudent(int id, String fullName, String birthday, String sex, String phoneNumber, String universityName, int gradeLevel, double englishScore, double entryTestScore) throws InvalidDOBException, InvalidFullNameException, InvalidPhoneNumberException {
        super(id, fullName, birthday, sex, phoneNumber, universityName, gradeLevel);
        this.englishScore = englishScore;
        this.entryTestScore = entryTestScore;
    }

    public double getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(double englishScore) {
        this.englishScore = englishScore;
    }

    public double getEntryTestScore() {
        return entryTestScore;
    }

    public void setEntryTestScore(double entryTestScore) {
        this.entryTestScore = entryTestScore;
    }
}
