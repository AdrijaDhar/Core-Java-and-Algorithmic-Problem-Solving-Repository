
package JAVA.DataStructures;
import java.util.ArrayList;//java.util.ArrayList
import java.util.Collections;
public class Arraylist {
    public static void main(String args[]) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<5;i++){
            list.add(i);
        }
       System.out.println(list); 
       int element=list.get(2);
       System.out.println(element);
       list.add(2,4);
       System.out.println(list);
       list.set(0,6);
       System.out.println(list);
       list.remove(5);
       System.out.println(list);
       int size=list.size();
       System.out.println(size);
       for(int i=0;i<list.size();i++){
        System.out.println(list.get(i));
       }
       Collections.sort(list);
       System.out.println(list);
    }
}
