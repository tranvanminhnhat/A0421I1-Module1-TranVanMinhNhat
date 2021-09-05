package l11_DSA_Stack_Queue.exercise.trien_khai_queue_sigle_linked_list;

public class Solution {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue();
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);

        for (int i = 0; i < queue.size(); i++){
            System.out.println(queue.deQueue());
        }
    }

}
