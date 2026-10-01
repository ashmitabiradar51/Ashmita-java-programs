import java.util.Queue;
import java.util.LinkedList;

class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("A");
        queue.add("B");
        queue.add("C");

        System.out.println("Queue: " + queue);

        queue.remove(); // removes first element (A)
        System.out.println("After remove: " + queue);

        System.out.println("Head element: " + queue.peek());
    }
}