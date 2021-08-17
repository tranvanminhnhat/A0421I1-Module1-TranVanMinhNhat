package b10_DSA_danh_sach.bai_tap.array_list_thu_vien_array_list;

import java.util.Arrays;

public class MyList<E> {
    /*
     * Số lượng phần tử có trong arraylist
     */
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    /*
     * Mảng chứa các phần tử có kiểu dữ liệu là Object
     */

    Object elements[];

    public MyList(){
        /*
         * Sức chứa mặc định là 10 khi khởi tạo bằng constructor không tham số
         */
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        /*
         * Sức chứa được chúng ta truyền vào khi khởi tạo bằng constructor có tham số
         */
        if (capacity > 0){
            elements = new Object[capacity];
        }else {
            throw new  IllegalArgumentException("Capacity: " + capacity);
        }
    }

    public int size(){
        /*
         * phương thức trả về số lượng phần tử
         */
        return this.size;
    }

    public void clear(){
        /*
         * Clear ArrayList
         */
        size = 0;
        for (int i = 0; i < elements.length; i++){
            elements[i] = null;
        }
    }

    public boolean add(E element){
        /*
         * phương thức add một phần tử vào arrayList
         */
        if (elements.length == size){
            this.ensureCapacity(2);
        }
        elements[size] = element;
        size++;
        return true;
    }

    private void ensureCapacity(int minCapacity){
        /*
         * phương thức tăng kích thước của MyList
         */
        if (minCapacity >= 0){
            int newSize = this.elements.length * minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        }else {
            throw new IllegalArgumentException("minCapacity: " + minCapacity);
        }
    }

    public void add(E element, int index){
        if (index > elements.length){
            throw new IllegalArgumentException("index: " + index);
        }else if (elements.length == size){
            this.ensureCapacity(2);
        }

        if (elements[index] == null){
            elements[index] = element;
            size++;
        }else {
            for (int i = size+1; i >= index; i--){
                elements[i] = elements[i-1];
            }
            elements[index] = element;
            size++;
        }
    }

    public E get(int index){
        /*
         * Phương thức lấy 1 element tại vị trí index
         */
        return (E) elements[index];
    }

    public int indexOf(E element){
        int index = -1;
        for (int i = 0; i < size; i++){
            if (this.elements[i].equals(element)){
                return i;
            }
        }
        return index;
    }

    public boolean contains(E element){
        /*
         * Kiểm tra phần tử có tồn tại trong mảng hay không
         */
        return this.indexOf(element) > 0;
    }

    /*
     * tạo ra bản sao của myArrayList hiện tại
     */
    public MyList<E> clone(){
        MyList<E> v = new MyList<>();
        v.elements = Arrays.copyOf(this.elements,this.size);
        v.size = this.size;
        return v;
    }

    /*
     *
     */

    public E remove(int index){
        if (index < 0 || index > elements.length){
            throw new IllegalArgumentException("Error index: " + index);
        }
        E element = (E)elements[index];
        for (int i = index; i < size - 1; i ++){
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return element;
    }
}
