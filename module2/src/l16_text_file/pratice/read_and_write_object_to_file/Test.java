package l16_text_file.pratice.read_and_write_object_to_file;

import java.io.IOException;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Student> students = null;
        try {
            students = FileUtils.readDataFromFile("D:\\nhat_coder\\CodeGym\\GIT_HUB\\module2\\src\\l16_text_file\\pratice\\read_and_write_object_to_file\\example1");
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Student student: students) {
            System.out.println(student);
        }

        try {
            FileUtils.writeDataToFile("D:\\nhat_coder\\CodeGym\\GIT_HUB\\module2\\src\\l16_text_file\\pratice\\read_and_write_object_to_file\\example1", students);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
