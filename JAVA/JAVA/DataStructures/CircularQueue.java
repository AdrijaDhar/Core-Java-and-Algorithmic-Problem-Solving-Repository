package JAVA.DataStructures;

public class CircularQueue {
    public static class Queue {
        static int front = -1;
        static int rear = -1;
        static int size;
        static int arr[];

        Queue(int size) {
            arr = new int[size];
            this.size = size;
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static void add(int data) {
            if (isEmpty()) {
                return;
            }
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        public static int remove() {
            if (isEmpty()) {
                return -1;

            }
            int result = arr[front];
            if (rear == front) {
                rear = front - 1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return arr[front];
        }

    }

    public static void main(String args[]) {
        Queue q = new Queue(10);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.remove());
        q.add(6);
        System.out.println(q.remove());
        q.add(7);
    }

}
