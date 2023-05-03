package JAVA.DataStructures;

import java.util.Scanner;

public class Queue_By_Array {
    static class Queue{
        static int arr[];
        static int size;
        static int rear=-1;
        static int front = -1;
        Queue(int size){
            arr=new int[size];
            this.size=size;

        }
        public static boolean isEmpty() {
            return rear==-1;
        }
        public static void add(int data) {
            if(rear==size-1){
                System.out.println("Queue is Full");
                return;
            }
            rear++;
            arr[rear]=data;
        }    
        public static int remove() {
            if(isEmpty()){
                return -1;
            }
            int front=arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return front;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return arr[0];
        }
        
    }
    public static void main(String args[]) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        Queue q=new Queue(n);
        q.add(2);
        q.add(3);
        q.add(4);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }
}
