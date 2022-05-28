package l22_demo.demo_sub;

public class demo3 {
    private String stuID;
    private String stuName;

    public demo3() {
    }

    public demo3(String stuID) {
        this.stuID = stuID;
    }

    public demo3(String stuID, String stuName) {
        this.stuID = stuID;
        this.stuName = stuName;
    }


    public String getStuID() {
        return stuID;
    }

    public void setStuID(String stuID) {
        this.stuID = stuID;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }
}
