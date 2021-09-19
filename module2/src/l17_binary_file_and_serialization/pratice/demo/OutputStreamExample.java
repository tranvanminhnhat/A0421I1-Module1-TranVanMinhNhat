package l17_binary_file_and_serialization.pratice.demo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamExample {
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("D:\\nhat_coder\\CodeGym\\GIT_HUB\\module2\\src\\l17_binary_file_and_serialization\\pratice\\demo\\codegym");

        byte[] bytes = new byte[] {'C', 'o', 'd', 'e', 'G', 'y', 'm'};

        for (int i = 0; i < bytes.length; i++) {
            byte b = bytes[i];
            os.write(b);
        }
        os.close();
    }
}
