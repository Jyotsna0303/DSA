public class PostOrderTraversal {
    public static void main(String [] args){
        Node root=new Node(10);
        root.left=new Node(30);
        root.left.left=new Node(35);
        root.right=new Node(40);
        root.right.right=new Node(50);
        System.out.println("Postorder: ");
        postOrder(root);
    }

    //O(n) = time
    //O(h)= space 
    public static void postOrder(Node root){
        if (root!=null){
           
            postOrder(root.left);
            postOrder(root.right); 
            System.out.print(root.key+" ");
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

