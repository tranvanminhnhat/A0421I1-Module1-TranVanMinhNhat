package l17_binary_file_and_serialization.pratice.demo;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExample2 {
    public static void main(String[] args) throws IOException {
        InputStream in = new FileInputStream("D:\\nhat_coder\\CodeGym\\GIT_HUB\\module2\\src\\l17_binary_file_and_serialization\\pratice\\demo\\codegym");

        byte[] bytes = new byte[10];
        int i = -1;

        while ((i = in.read(bytes)) != -1){
            String s = new String(bytes, 0, i);
            System.out.println(s);
        }
        in.close();
    }
}
