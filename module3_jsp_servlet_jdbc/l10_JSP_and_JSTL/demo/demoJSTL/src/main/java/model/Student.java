package model;

public class Student {
    int id;
    String name;
    boolean gender;
    int point;

    public Student() {
    }

    public Student(int id, String name, boolean gender, int point) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.point = point;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}
