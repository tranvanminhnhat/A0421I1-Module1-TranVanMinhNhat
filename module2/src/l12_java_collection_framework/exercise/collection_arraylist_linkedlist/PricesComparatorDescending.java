package l12_java_collection_framework.exercise.collection_arraylist_linkedlist;

import java.util.Comparator;

public class PricesComparatorDescending implements Comparator<Product> {
    @Override
    public int compare(Product product2, Product product1) {
        if (product1.getPrices() < product2.getPrices()){
            return -1;
        }else if (product1.getPrices() == product2.getPrices()){
            return 0;
        }else {
            return 1;
        }
    }
}
