package JAVA.oops;
import java.util.Scanner;
class DynamicArray{
    private int data[];
    private int nextElement;
    public DynamicArray(){
        data=new int[5];
        nextElement=0;
    }
    public int size(){
        return nextElement;

    }
    public boolean isEmpty(){
        return nextElement==0;

    }
    public int get(int i){
        if(i>=nextElement){
            return -1;
        }
        return data[i];
    }
    public void add(int element){
        if(nextElement==data.length){
            doubleCapacity();
        }
        data[nextElement]=element;
        nextElement++;
    }
    private void doubleCapacity(){
        int temp[]=data;
        data=new int[2*temp.length];
        for(int i=0;i<temp.length;i++){
            data[i]=temp[i];
        }
    }
    public void set(int i,int element){
        if(i>=nextElement){
            return;
      }
        data[i]=element;
    }
    public int removeLast(){
        if(nextElement==0){
            return -1;
        }
        int temp=data[nextElement-1];
        nextElement--;
        return temp;
    }
}
public class DynamicArrayUse {
    public  static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        DynamicArray d=new DynamicArray();
        int n=s.nextInt();
        for(int i=1;i<n;i++){
            d.add(100+i);
        }
        System.out.println(d.size());
        int j=s.nextInt();
        System.out.println(d.get(j));
        int k=s.nextInt();
        int val=s.nextInt();
        d.set(k,val);
        while(!d.isEmpty()){
            System.out.println(d.removeLast());
        }

    }
}
