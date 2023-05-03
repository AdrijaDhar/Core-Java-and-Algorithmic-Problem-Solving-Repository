package JAVA.DataStructures;



public class LinkedListQueue {
    static class Node{
        static int data;
        Node next_pointer;
        Node(int data){
            this.data=data;
            this.next_pointer=null;
        }
    }
    static class Queue{
        
        static Node head=null;
        static Node tail=null;
        
        public static boolean isEmpty(){
            return head==null & tail==null;
        }
        public static void add(int data){
            Node newNode=new Node(data);
            if(isEmpty()){
                tail=head=newNode;
                return;
            }
            tail.next_pointer=newNode;
            tail=newNode;
        }
        public static int remove() {
            if(isEmpty()){
                return -1;
            }
            int front=head.data;
            if(head==tail){
                tail=null;
            }
            head=head.next_pointer;
            return front;
        }
        public static int peek() {
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }

    }
    public static void main(String args[]) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        
        
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }

}
