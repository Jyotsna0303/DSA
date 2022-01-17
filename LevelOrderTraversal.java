import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    public static void main(String args[]){
        Node root=new Node(10);
        root.left=new Node(30);
        root.left.left=new Node(35);
        root.right=new Node(40);
        root.right.right=new Node(50);
        root.right.right.right=new Node(29);
        System.out.println("Level Order Traversal: " );
        levelOrderTravesral(root);//10 30 40 35 50 29 
        System.out.println();
        linebylineLevelOrderTravesral(root);
    }

    //Time complexity= O(n) because enqueue and dequeu takes O(1), so for each node of tree O(n)
    //Space complexity= theta(W) W=width of time 
    //Worst case complexity= O(n)
    public static void levelOrderTravesral(Node root){
        if (root==null){
            return;
        }
        Queue<Node> queue= new LinkedList<Node>();
        queue.add(root);
        while(queue.isEmpty()==false){
            Node curr=queue.poll() ;
            System.out.print(curr.key+" ");
            if (curr.left!=null){
                queue.add(curr.left);
            }
            if(curr.right!=null){
                queue.add(curr.right);
            }
        }
    }


    //time complexity= O(n), O(n+h) h= height of tree because every node is going in and out of the queue exactly once. And there is a null. So we are inserting h null in the queue.
    //space= O(n) or theta(W) W=width
    public static void linebylineLevelOrderTravesral(Node root){
        if (root==null){
            return;
        }
        Queue<Node> queue= new LinkedList<Node>();
        queue.add(root);
        queue.add(null);
        while(queue.size()>1){
            Node curr= queue.poll();
            if(curr==null){
                System.out.println();
                queue.add(null);
                continue;
            }

            System.out.print(curr.key+ " ");
            if (curr.left!=null){queue.add(curr.left);}
            if (curr.right!=null){queue.add(curr.right);}

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
