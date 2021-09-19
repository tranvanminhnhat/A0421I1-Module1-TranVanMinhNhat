package l17_binary_file_and_serialization.pratice.demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExample {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("D:\\nhat_coder\\CodeGym\\GIT_HUB\\module2\\src\\l17_binary_file_and_serialization\\pratice\\demo\\codegym");
        int i = -1;

        while ((i = is.read()) != -1){
            System.out.println((char) i);
        }
        is.close();
    }
}
