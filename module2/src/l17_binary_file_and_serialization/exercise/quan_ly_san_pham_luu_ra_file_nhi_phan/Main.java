package l17_binary_file_and_serialization.exercise.quan_ly_san_pham_luu_ra_file_nhi_phan;

import l17_binary_file_and_serialization.pratice.doc_va_ghi_danh_sach_sinh_vien_ra_file_nhi_phan.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void writeToObject(String path, List<Product> products) throws IOException {
        FileOutputStream fos = new FileOutputStream(path);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(products);
        fos.close();
        oos.close();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Product> products = new ArrayList<>();
        products.add(new Product("01A", "Television", "Toshiba", 350000));
        products.add(new Product("02A", "Smart phone", "iPhone", 240000));
        products.add(new Product("03A", "Fan", "Yamaha", 280000));
        products.add(new Product("04A", "Fridge", "LG", 150000));
        products.add(new Product("05A", "Printer", "Motorola", 400000));
        writeToObject("D:\\nhat_coder\\CodeGym\\GIT_HUB\\module2\\src\\l17_binary_file_and_serialization\\exercise\\quan_ly_san_pham_luu_ra_file_nhi_phan\\product", products);
        List<Product> readDataFromFile = readDataFromFile("D:\\nhat_coder\\CodeGym\\GIT_HUB\\module2\\src\\l17_binary_file_and_serialization\\exercise\\quan_ly_san_pham_luu_ra_file_nhi_phan\\product");
        for (Product product : readDataFromFile){
            System.out.println(product);
        }
    }

    public static List<Product> readDataFromFile(String path) throws IOException, ClassNotFoundException {
        List<Product> products = new ArrayList<>();
        FileInputStream fis = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(fis);
        products = (List<Product>)ois.readObject();
        fis.close();
        ois.close();
        return products;
    }


}
