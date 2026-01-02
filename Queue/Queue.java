
public class Queue {
    private int front = 0;
    private int rear = -1;
    private int size = 0;
    private int[]arr = new int[5];

    //add data in a queue
    public void enqueue(int data)
    {
            if (!isFull()){
                rear = (rear+1) % arr.length;
                arr[rear] = data;
                size++;
            }else{
                System.out.println("Queue is Full..");
            }
    }

    //remove data in a queue
    public int dequeue()
    {
        if(!isEmpty()){
            int data = arr[front];
            front= (front+1) % arr.length;
            size--;
            return data ;
        }else{
            System.out.println("Queue is Empty");
        }
       return 0;
    }

    public boolean isFull()
    {
        return size == arr.length;
    }

    public boolean isEmpty()
    {
        return size == 0;
    }

    //print the queue data
    public void show(){
        for (int i = 0; i < size; i++) {
           System.out.print(arr[(front + i) % arr.length] + " ");
        }
    }

}
