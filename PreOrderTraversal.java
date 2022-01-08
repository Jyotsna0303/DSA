public class PreOrderTraversal {
    public static void main(String [] args){
        Node root=new Node(10);
        root.left=new Node(30);
        root.left.left=new Node(35);
        root.right=new Node(40);
        root.right.right=new Node(50);
        System.out.println("Preorder: ");
        preOrder(root);
    }

    //O(n) = time
    //O(h)= space 
    public static void preOrder(Node root){
        if (root!=null){
            System.out.print(root.key+" ");
            preOrder(root.left);
            preOrder(root.right); 
        }

    }
}

class Node{
    int key;
    Node left;
    Node right;
    public Node(int k){
        key=k;
    }

    
}