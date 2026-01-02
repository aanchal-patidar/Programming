class Node{
    public int data;
    Node left;
    Node right;

    public Node(int data)
    {
        this.data = data;
    }

}
public class BinaryTree {
    Node root;
    public void insert(int data) {
       root = insertRec(root, data);
    }
    public Node insertRec(Node root, int data)
    {
        if(root == null)
        {
            return new Node(data);
        }else if(data < root.data)
        {
            root.left = insertRec(root.left, data);
        }else if(data > root.data)
        {
            root.right = insertRec(root.right, data);
        }
        return root;
    }
    // inorder -> left - root - right
    public void inOrder(){
        inOrderRec(root);
    }
    public void inOrderRec(Node root){
        if(root != null)
        {
            inOrderRec(root.left);
            System.out.print(root.data + " ");
            inOrderRec(root.right);
        }
    }
    //preOrder -> root - left - right
     public void preOrder(){
        preOrderRec(root);
    }
    public void preOrderRec(Node root){
        if(root != null)
        {
            System.out.print(root.data + " ");
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }

    //postOrder -> left - right - root
    public void postOrder(){
        postOrderRec(root);
    }
    public void postOrderRec(Node root){
        if(root != null)
        {
            postOrderRec(root.left);
            postOrderRec(root.right);
            System.out.print(root.data + " ");
        }
    }


}
