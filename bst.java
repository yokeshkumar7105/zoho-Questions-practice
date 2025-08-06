import java.util.*;


class Node{
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data = data;
    }
}

public class bst{

    public static Node insertNode(Node root, int data){

        if(root == null){
            root = new Node(data);
        }
        else if(data > root.data){
            root.right = insertNode(root.right,data);
        }
        else if(data < root.data){
            root.left = insertNode(root.left,data);
        }
        return root;
    }

    public static void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.data + "  ");
            inorder(root.right);
        }
    }

    public static void preorder(Node root){
        if(root!=null){
            System.out.print(root.data+"  ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    public static void Postorder(Node root){
        if(root!=null){
            Postorder(root.left);
            Postorder(root.right);
            System.out.print(root.data+"  ");
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        // int data = sc.nextInt();
        // Node root = null;
        // root = insertNode(root, data);
        // inorder(root);
        // sc.close();

        Node root = null;

        System.out.print("Enter number of nodes : ");
        int n = sc.nextInt();

        System.out.print("Enter elements : ");
        for(int i=0;i<n;i++){
            int data = sc.nextInt();
            root = insertNode(root,data);
        }
        System.out.println("Inorder Traversal");
        inorder(root);
        System.out.println();
        System.out.println("Preorder Traversal");
        preorder(root);
        System.out.println();
        System.out.println("Postorder Traversal");
        Postorder(root);

        sc.close();


    }
}