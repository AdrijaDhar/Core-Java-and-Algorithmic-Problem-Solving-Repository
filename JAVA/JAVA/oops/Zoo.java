package JAVA.oops;
abstract class Animal{
    abstract void locomotion();
}
class Horse extends Animal{
    public void locomotion(){
        System.out.println("Runs fast with back legs");
    }
}
class Chicken extends Animal{
public void locomotion() {
    System.out.println("small height but runs while flee");
}
}
public class Zoo {
    public static void main(String[] args) {
        Horse horse=new Horse();
        horse.locomotion();
    }
}
