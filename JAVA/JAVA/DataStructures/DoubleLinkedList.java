package JAVA.DataStructures;

public class DoubleLinkedList {
    static class Node{
        Node prev;
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
            prev=null;
        }
    }
    static class DoubleLL{
        public static Node addEmpty(Node head,int data){
            Node newNode=new Node(data);
            newNode.prev=null;
            newNode.data=data;
            newNode.next=null;
            newNode=head;
            return newNode;
        }
       public static Node addAtbeg(Node head,int data){
        Node newNode=new Node(data);
        newNode.prev=null;
        newNode.next=null;
        newNode.data=data;
        newNode.next=head;
        head=newNode;
        return newNode;
       }
       public static Node addAtend(Node head,int data) {
        Node newNode=new Node(data);
        newNode.prev=null;
        newNode.next=null;
        newNode.data=data;
        Node tp=new Node(data);
        tp=head;
        while(tp.next!=null){
            tp=tp.next;
        }
        tp.next=newNode;
        newNode=tp;
        return head;

       }
       public static Node reverse(Node head){
        Node ptr1=head;
        Node ptr2=ptr1.next;
        ptr1.next=null;
        ptr1.prev=ptr2;
        while(ptr2!=null){
            ptr2.prev=ptr2.next;
            ptr2.next=ptr1;
            ptr1=ptr2;
            ptr2=ptr2.prev;
        }
        head=ptr1;
        return head;
       }
        
       }
    }

