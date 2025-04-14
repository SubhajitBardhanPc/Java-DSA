class Node{
    int data;
    Node left,right;
    public Node(int data){
        this.data = data;
        left = right = null;
    }
}


public class tree{
    Node root;
    public void inorder(Node node){
        if(node!=null){
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }
    public void p(Node node){
        if(node!=null){
            System.out.print(node.data + " ");
            p(node.left);
            p(node.right);
        }
    }
    public static void main(String[] args){
        tree t = new tree();
        t.root = new Node(1);
        t.root.left = new Node(2);
        t.root.right = new Node(3);
        t.root.left.left = new Node(4);
        t.root.left.right = new Node(5);
        t.root.right.left = new Node(6);
        t.root.right.right = new Node(7);
        
        System.out.println("Inorder Traversal of binary tree is: ");
        t.inorder(t.root);
        
        System.out.println("\nPreorder Traversal of binary tree is: ");
        t.p(t.root);
    }
}