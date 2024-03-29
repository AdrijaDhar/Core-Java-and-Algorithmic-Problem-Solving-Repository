package JAVA.DataStructures;
import java.util.Scanner;
import java.util.*;
public class LinkedLists {
    static Node head;
    private int size;

    LinkedLists() {
        this.size = 0;
    }

    class Node {

        String data;
        Node next_pointer;

        Node(String data) {
            this.data = data;
            this.next_pointer = null;
            size++;
        }
    }
    
    public void addFirst(String data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }

        newnode.next_pointer = head;
        head = newnode;
    }
    public void fun(Node start)
    {
      if(start == null)
        return;
      System.out.print( start.data); 
    
      if(start.next_pointer != null )
        fun(start.next_pointer.next_pointer);
      System.out.printf(start.data);
    }

    public void addlLast(String data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        Node currNode = head;
        while (currNode.next_pointer != null) {
            currNode = currNode.next_pointer;

        }

        currNode.next_pointer = newnode;

    }

    public void printList() {
        if (head == null) {
            System.out.println("the list is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next_pointer;

        }
        System.out.println("NULL");
    }

    public void DeleteFirst() {
        // corner case
        if (head == null) {
            System.out.println("the list is empty");
            return;
        }
        size--;
        head = head.next_pointer;

    }

    public void deleteLast() {
        if (head == null) {
            System.out.print("the list is empty");
            return;
        }
        size--;
        if (head.next_pointer == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next_pointer;
        while (lastNode.next_pointer != null) {

            lastNode = lastNode.next_pointer;
            secondLast = secondLast.next_pointer;

        }
        secondLast.next_pointer = null;

    }
    public static boolean isPalindrome(Node head){
        Node currNode=head;
        ArrayList<String>list=new ArrayList<String>();
        

        while(currNode!=null){
            list.add(currNode.data);
            currNode=currNode.next_pointer;
        }
        int s=0;
            int e=list.size()-1;
        while(s<e){
            if(list.get(s)!=list.get(e)){
                return false;
            }else{
                s++;
                e--;
            }

        }
        return true;
    }
    public static Node findMiddle(Node head){
        Node hare=head;
        Node turtle=head;
        while(hare.next_pointer!=null && hare.next_pointer.next_pointer!=null){
            hare=hare.next_pointer.next_pointer;
            turtle=turtle.next_pointer;
        }
        System.out.println(turtle.data);
        return turtle;
    }
    public static Node removeNthfromEnd(Node head,int n){
        if(head.next_pointer==null){
            return null;
        }
        int size=0;
        Node curr=head;
        while(curr!=null){
            curr=curr.next_pointer;
            size++;
        }
        if(n==size){
            return head.next_pointer;
        }
        int indextoSearch=size-n-1;
        int i=0;
        Node prev =head;
        while(i<indextoSearch){
            prev=prev.next_pointer;
            i++;
        }
        prev.next_pointer=prev.next_pointer.next_pointer;
        return head;
    }

    public int GetSize() {
        return size;
    }

    public void addInMiddle(int index, String data) {
        if (index > size || index < 0) {
            System.out.println("invalid index");
            return;
        }
        size++;
        Node newnode = new Node(data);
        if (head == null || index == 0) {
            newnode.next_pointer = head;
            head = newnode;
            return;
        }
        Node currNode = head;
        for (int i = 1; i < size; i++) {
            if (i == index) {
                Node nextNode = currNode.next_pointer;
                currNode.next_pointer = newnode;
                newnode.next_pointer = nextNode;
                break;
            }
            currNode = currNode.next_pointer;
        }
    }

   

    public void reverse() {
        Node current = head;
        Node prev = null;
        while (current != null) {
            Node nextNode = current.next_pointer;
            current.next_pointer = prev;
            prev = current;
            current = nextNode;
        }
        head = prev;
    }
    public static void reverseIterate(){
        if(head==null || head.next_pointer==null){
            return;
        }
        Node prevNode=head;
        Node currNode=head.next_pointer;
        while(currNode!=null){
            Node nextNode=currNode.next_pointer;
            currNode.next_pointer=prevNode;
            prevNode=currNode;
            currNode=nextNode;
        }
        head.next_pointer=null;
        head=prevNode;
    }
    public static Node reverseRecursive(Node head){
        if(head==null || head.next_pointer==null){
            return head;
        }
        Node newHead=reverseRecursive(head.next_pointer);
        head.next_pointer.next_pointer=head;
        head.next_pointer=null;
        return newHead;

    }
    public  Node deleteNodeatpos(Node head, int pos) {
		// Write your code here.
		if(head==null){
			return head;
		}
	Node temp=head;
		if(pos==0){
			head=temp.next_pointer;
			return head;
		}
		for (int i = 0; temp != null && i < pos - 1;
             i++)
            temp = temp.next_pointer;
		if(temp==null || temp.next_pointer==null){
			return head;
		}
		Node Next=temp.next_pointer.next_pointer;
		temp.next_pointer=Next;
		return head;
	}

    public static void main(String args[]) {
        LinkedLists list = new LinkedLists();
        LinkedLists list1 = new LinkedLists();
        Scanner s=new Scanner(System.in);
        list.addFirst("pikachu");
        list.addFirst("ash");
        list.printList();
        list.addFirst("sakura");

        list.printList();

        list.addFirst("waffles");
        list.printList();
        list.DeleteFirst();
        list.printList();
        list.addlLast("Kai");
        list.printList();
        list.deleteLast();
        System.out.println(list.GetSize());

        list.addInMiddle(2, "Kaira");
        list.printList();
        list.reverse();
        list.printList();
        list.reverseIterate();
        list.printList();
        list.head=list.reverseRecursive(list.head);
        list.printList();
        System.out.println("enter total count of elements -> ");
        int num = s.nextInt(); 
        
        while(num>0) { 
        list.addFirst(s.next());
        num--;  // decrement till the index became 0    
        }
        s.close();
        list.printList();
        list.deleteNodeatpos(list.head, 2);
        list.printList();
        removeNthfromEnd(list.head, 1);

        list.printList();
        list1.addFirst("a");
        list1.addFirst("b");
        list1.addFirst("c");
        list.addlLast("b");
        list1.addlLast("a");
        list1.printList();
        boolean f=isPalindrome(list1.head);
        System.out.println(f);
        
        list.findMiddle(list.head);
        list.fun(head);
        list.printList();

    }
}
