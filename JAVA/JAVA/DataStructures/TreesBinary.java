package JAVA.DataStructures;
import java.util.*;
import java.util.Scanner;
public class TreesBinary {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
     static class BinaryTree{
        static int idx=-1;
        public static Node BuildTree(int Nodes[]){
            idx++;
            if(Nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(Nodes[idx]);
            newNode.left=BuildTree(Nodes);
            newNode.right=BuildTree(Nodes);
            return newNode;


        }
        public static void Preorder(Node root){
            if(root==null){
               // System.out.print("-1");
                return;
            }
            System.out.print(root.data+" ");
            Preorder(root.left);
            Preorder(root.right); 
        }
        public static void inOrder(Node root){
            if(root==null){
              //  System.out.print("-1 ");
                return;
            }
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
        public static void PostOrder(Node root){
            if(root==null){
                 //System.out.print("-1 ");
                return;
            }
            PostOrder(root.left);
            PostOrder(root.right);
            System.out.print(root.data+" ");
        }
    }
    public static void main(String args[]) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Scanner s=new Scanner(System.in);
        BinaryTree tree=new BinaryTree();
        Node root=tree.BuildTree(nodes);
        System.out.println(root.data);
        tree.Preorder(root);
        System.out.println();
        tree.inOrder(root);
        System.out.println();
        tree.PostOrder(root);
        s.close();
    }
}
