package l17_binary_file_and_serialization.pratice.demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("D:\\nhat_coder\\CodeGym\\GIT_HUB\\module2\\src\\l17_binary_file_and_serialization\\pratice\\demo\\product"));
            Product product = (Product) ois.readObject();
            System.out.println(product);
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            ois.close();
        }
    }
}
