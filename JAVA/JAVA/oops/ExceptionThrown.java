package JAVA.oops;

/*class ExceptionThrown 
{ 
    static int divideByZero(int a, int b){ 
        int i = a/b;  
        return i; 
    } 
    static int computeDivision(int a, int b) { 
        int res =0; 
        try
        { 
          res = divideByZero(a,b); 
        } 
        catch(NumberFormatException ex) 
        { 
           System.out.println("Exception occured");  
        } 
        return res; 
    } 
    public static void main(String args[]){ 
        int a = 1; 
        int b = 1; 
        int i=0;  
        try
        { 
             i = computeDivision(a,b); 

        } 
        catch(ArithmeticException ex) 
        { 
            System.out.println(ex.getMessage()); 
        }
        System.out.print(i);
    } 
} */
/*class ExceptionThrown { 
    static void fun() throws Exception 
    { 
        throw new Exception(); 
    } 
    public static void main(String args[]) 
    {   
        try { 
            fun(); 
        } 
        catch (Exception e) { 
            System.out.print("caught in main."); 
        }
        System.out.print("All is well"); 
    } 
}
*/
class ExceptionThrown{
   /*  public static void main(String[] args){

    try{
        return;
    }
    finally{
        System.out.println("Hello coding ninjas");
    }
  }
  */
  public static void main(String[] args){

    try{
       int a = 5/0;
    }
    catch(Exception e){
        System.out.print("Exception caught ");
    }
    catch(ArithmeticException e){
        System.out.print("Arithmetic Exception caught ");
   }
   finally{
       System.out.print("finally block");
   } 
 }
}