package l11_DSA_Stack_Queue.optional.thuc_hanh.trien_khai_stack_array;

public class MyArrStack implements MyArrayStack{
    private int size;
    private int[] arrayStack;
    private int index = 0;

    public MyArrStack(int size) {
        this.size = size;
        arrayStack = new int[size];
    }

    @Override
    public int size() {
        return this.index;
    }

    @Override
    public void push(int element) {
        if (isFull()){
            throw new StackOverflowError("Stack is full");
        }
        arrayStack[index] = element;
        index++;
    }

    @Override
    public int pop() throws Exception {
        if (isEmpty()){
            throw new Exception("Stack is null");
        }
        return arrayStack[--index];
    }

    @Override
    public int top() {
        return arrayStack[index-1];
    }

    @Override
    public boolean isEmpty() {
        if (this.index == 0){
            return true;
        }
        return false;
    }

    @Override
    public boolean isFull() {
        if (this.index == this.size){
            return true;
        }
        return false;
    }
}
