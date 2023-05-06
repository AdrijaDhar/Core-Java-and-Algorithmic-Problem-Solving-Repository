package JAVA.oops;

import java.util.ArrayList;

public class Tst1 {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<String>() ;
list.add( "apple" );
list.add( "banana" );
list.add( "carrot" );
list.add( 0, "mango" );
System.out.println(list.get(2));
    }
}
