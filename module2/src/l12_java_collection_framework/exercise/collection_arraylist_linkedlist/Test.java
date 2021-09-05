package l12_java_collection_framework.exercise.collection_arraylist_linkedlist;


public class Test {
    public static void main(String[] args) {
        ProductManagement productManagement = new ProductManagement();
        productManagement.addProduct(new Product(1,"Điện thoại",1000));
        productManagement.addProduct(new Product(2,"Máy tính",1500));
        productManagement.addProduct(new Product(3,"Đồng hồ",1200));
        productManagement.addProduct(new Product(4,"Máy quạt",1900));
        productManagement.descendingSort();
        productManagement.display();
    }
}
