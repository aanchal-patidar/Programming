
public class Main {
    public static void main(String[] args) {
        LinkedList nums = new LinkedList();
        //adding element
        nums.add(5);
        nums.add(8);
        nums.add(4);

        //add element at first position
        nums.addFirst(6);

        nums.delete(8);

        //printing values
        nums.printValues();  
        
    }
}
