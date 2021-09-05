package l10_DSA_list.practice.demo_array_list;

import java.util.Arrays;

public class MyArrayList<E> {
    private final static int DEFAULT_CAPACITY = 10;
    private int size = 0;
    private E elements[];

    public MyArrayList() {
        elements = (E[])new Object[DEFAULT_CAPACITY];
    }

    public boolean add(E e){
        if (size == elements.length){
            ensureCapacity();
        }
        elements[size++] = e;
        return true;
    }

    public void add(int index, E e){
        if (index > size || index < 0){
            throw new IndexOutOfBoundsException("index: " + index);
        }else {
            if (size == elements.length){
                ensureCapacity();
            }
            for (int i = size; i > index; i--){
                elements[i] = elements[i-1];
            }
            elements[index] = e;
            size++;
        }
    }

    public void ensureCapacity(){
        int newSize = elements.length *2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public int size(){
        return this.size;
    }

    public E get(int index){
        return elements[index];
    }

    public int indexOf(E e){
        for (int i = 0; i < elements.length; i++){
            if (elements[i] == e){
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(E e){
        for (int i = size - 1; i >= 0; i--){
            if (elements[i] == e){
                return i;
            }
        }
        return -1;
    }
}
