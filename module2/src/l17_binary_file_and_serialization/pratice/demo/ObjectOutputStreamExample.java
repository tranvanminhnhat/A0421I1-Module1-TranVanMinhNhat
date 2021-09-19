package l17_binary_file_and_serialization.pratice.demo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamExample {
    public static void main(String[] args) throws IOException{
        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream(new FileOutputStream("D:\\nhat_coder\\CodeGym\\GIT_HUB\\module2\\src\\l17_binary_file_and_serialization\\pratice\\demo\\product"));
            Product product = new Product(1, "IPhone 12", 2800000, "New");
            oos.writeObject(product);
            oos.flush();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            oos.close();
        }
        System.out.println("Success!");
    }
}
