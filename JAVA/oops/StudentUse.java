package JAVA.oops;
class Student{
    public String name;
    final private int rollNumber;
    double cgpa;
    static double conversion=0.95;
    private static int numStudents;
    public Student(String name,int rollNumber,double cgpa){
        this.name=name;
        
        this.cgpa=cgpa;
        
        numStudents++;
        this.rollNumber=numStudents;
    }
    public void print(){
        System.out.println(this.name+" "+this.rollNumber+" "+this.cgpa+" "+Student.numStudents);
    }
    public int get(){
        return this.rollNumber;
    }
    public void set(int rollNumber){
        if(rollNumber<=0){
            return;
        }
        System.out.println("this"+this);
        
    }
}
public class StudentUse{
    public static void main(String[] args) {
        Student s1=new Student("Adrija",39,8.50);
        s1.print();

    }
}