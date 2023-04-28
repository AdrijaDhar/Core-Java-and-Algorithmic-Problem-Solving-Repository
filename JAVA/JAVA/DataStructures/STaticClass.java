package JAVA.DataStructures;

public class STaticClass {
    static class Node{
        int data;
        Node next_pointer;
        public Node(int data){
            this.data=data;
            this.next_pointer=null;
        }

    }
       static class Stack{
        public static Node head;
        public static boolean isEmpty() {
            return head==null;
        }
        public static void push(int data) {
            Node NewNode=new Node(data);
            if(isEmpty()){
                head=NewNode;
                return;
            }
            NewNode.next_pointer=head;
            head=NewNode;
        }
        public static int pop() {
            if(isEmpty()){
                return -1;
            }
            int top=head.data;
            head=head.next_pointer;
            return top;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
        
        
    }
    public static void main(String args[]) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
    
}
