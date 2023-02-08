package JAVA.oops;
class Car extends Vehicle{
    int numDoors;
    public Car(int numDoors,int price){
        super(price);
        System.out.println("Car's constructors");
        this.price=price;
        this.numDoors=numDoors;
    }
    public void printCar(){
        System.out.println("Car"+" color "+getColor()+" maxSpeed "+maxSpeed+" price "+price+" "+numDoors);
    }
}

class Vehicle{
    private String color;
    int maxSpeed;
    int price;
    public Vehicle(int price){
        this.   price=price;
        System.out.println("Vehicle's constructors");
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void print(){
        System.out.println("vehicle"+" color "+getColor()+" maxSpeed "+maxSpeed+" price "+price);
    }
}
public class vehicleUse {
    public static void main(String[] args) {
        Vehicle v=new Vehicle(1000000);
       v.print();
        Car c=new Car(4,20000);
       /*  c.setColor("red");
        c.maxSpeed=20;
        c.numDoors=4;
        c.price=120000;
        */
        c.printCar();
        /*cycle cy=new cycle();
        cy.setColor("red");
        cy.maxSpeed=20;
       
        cy.price=120000;
        cy.numWheels=2;
        cy.print();
        */
    }
}
