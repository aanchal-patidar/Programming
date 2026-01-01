
class Main{
    public static void main(String[] args) {
        Stack nums = new Stack();

        //add data into stack
        nums.push(4);
        nums.push(7);
        // retrieve peek data from the stack
        System.out.println(nums.peek());
        nums.push(3);

        // retrieve and delete data
        nums.pop();
        nums.push(9);
       
        //print data
        nums.printStack();

    }
}