
public class Main {
    public static void main(String[] args) {
        //Binary search tree 
        BinaryTree tree = new BinaryTree();
        tree.insert(23);
        tree.insert(34);
        tree.insert(67);
        tree.insert(11);
        
        System.out.println("In order : ");
        tree.inOrder();
        System.out.println();
        System.out.println("Pre Order : ");
        tree.preOrder();
        System.out.println();
        System.out.println("Post order : ");
        tree.postOrder();


    }
    
}
