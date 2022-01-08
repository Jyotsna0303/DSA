class Node{
    int key;
    Node left;
    Node right;
    public Node(int k){
        key=k;
    }

    
    
}

class InorderTraversal{
    public static void main(String args[]){
        Node root=new Node(10);
        root.left=new Node(30);
        root.left.left=new Node(35);
        root.right=new Node(40);
        root.right.right=new Node(50);
        System.out.println("Inorder: ");
        inorder(root);
    }
        //Time complexity= O(n) n= number of node.
    //Auxillary space= Either the left side tree will be there in the function call stack or right side tree
    //Auxillary space= at most, height of binary tree(or proportional to binary tree), in worst case the number of function calls in the stack will be H+1, H=height of tree.
    //Auxillary space= O(H)
    public static void inorder(Node root){
       
        if(root!=null){
            inorder(root.left);
            System.out.print(root.key+" ");
            inorder(root.right);
        }
    }

    
}