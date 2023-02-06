package JAVA.oops;

/*class Test 
    { 
        int a; 
        int b; 

    public void set(int a, int b) 
    {  
        b = a; 
        this.b = b; 
    } 

    void display() 
    { 
        System.out.println("a=" + a + " b=" + b); 
    } 
}
class T{
    public static void main(String[] args) 
    { 
        Test object = new Test();
        object.set(10,20);
        object.display(); 
    } 
} */
/*class Car{
    static int year;
    String company_name;
}
class T {
    
    public static void main (String[] args) {
        Car c=new Car();        
        Car.year=2018;              
        c.company_name="KIA";
        Car d=new Car();
        System.out.print(d.year);
    }
}
*/
class Test {
    static int a = 10;
    int b = 20;

    static void fun1() {
        a = 20; // Line 1
        b = 10; // Line 2
        fun2(); // Line 3
        System.out.print(this.b); // Line 4
    }

    void fun2() {
        System.out.println("from m2");
    }
}

class T {
    public static void main(String[] args) {
        Test.fun1();
    }
}
