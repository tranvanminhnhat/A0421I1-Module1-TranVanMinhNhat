package l12_java_collection_framework.exercise.collection_arraylist_linkedlist;

public class ProductNotFoundException extends Exception{
    public ProductNotFoundException(String message){
        super(message);
    }

    public ProductNotFoundException(){
        super("Product not found");
    }
}
