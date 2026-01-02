
public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(3);
        queue.enqueue(8);
        queue.enqueue(12);
        queue.enqueue(45);
        queue.enqueue(76);
        System.out.println(queue.dequeue());
        queue.enqueue(16);
       // queue.enqueue(56); // overflow

        queue.show();
    }

}
