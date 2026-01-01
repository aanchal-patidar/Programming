
public class Stack {
    private int[] arr = new int[4];
    int size ;
    int top;

    public Stack(){
        size = arr.length;
        top = -1;
    }

    public void push(int data)
    {
        if(top < size)
          arr[++top] = data;
        else 
            System.out.println("Stack overflow!!");

        
    }

    public int pop()
    {
        if (top > -1)
           return arr[top--];
        else 
            System.out.println("Stack UnderFlow !!");

        return 0;
    }

    public int peek()
    {
        return arr[top];
    }

    public void printStack(){
        for (int n : arr) {
            System.out.print(n+ " ");
        }
    }

}
