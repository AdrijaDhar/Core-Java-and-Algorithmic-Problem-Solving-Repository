package JAVA.oops;

class Pen {
    String color;
    String brand;
    String type;
    private int number;
    final int cost;

    public void Print() {
        System.out.println(this.color + " " + this.brand + " " + this.type+" "+this.number);
    }
    public int returnNumber(){
        
        return number;
    }
    public void setNumber(int num){
        number=num;
    }

    // Non parameterised constructors
    /*
     * Pen(){ 
     * System.out.println("Constructor called");
     * }
     */
    // Parameterised constructors
    /*
     * Pen(String color, String brand, String type) {
     * this.color = color;
     * this.brand = brand;
     * this.type = type;
     * }
     */
    //copy constructors
    Pen(Pen p2){
        this.color =p2.color;
      this.brand = p2.brand;
      this.type = p2.type;
      this.number=p2.number;
      
    }
    Pen(){

    }

}

public class OOPs {
    public static void main(String[] args) {
       /*
        
        Pen pen1=new Pen();

        pen1.Print();*/ 
        /*
         *  Pen pen1=new Pen("blue","cello","ballpoint");
         * pen1.Print();
         */
        Pen p1=new Pen();
        System.out.println(p1);//p1 is the address of where object is stored

        p1.color="Yellow";
        p1.brand="cello";
        p1.type="ballpoint";
        p1.setNumber(40);
        
       // p1.number=10;//we cant use private modified variable outside class as its not accesible
        Pen p2=new Pen(p1);
        System.out.println(p2);
        p2.Print();
        p1.returnNumber();


    }
}
