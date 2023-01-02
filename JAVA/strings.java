package JAVA;
public class strings {
    /**
     * @param args
     */
    public static void main(String[] args) {
      /*  Scanner s= new Scanner(System.in) ;
       String str1=s.next();
         /*  String str2=s.next();
       System.out.println(str1.charAt(2));// to know the character at the specified position

       System.out.println(str1.concat(str2));//to concatenate two strings
       System.out.println(str1.equals(str2));//to compare to string,returns boolean
       System.out.println(str1.compareTo(str2));/*to compare strings lexicographically.returns difference of ascii value
        of unmatched characters
      
       if(str1.contains("pok")){
        System.out.println(str1.substring(2));
        /*s.contains checks if the following given string or substring is in the main string or not  
       }else{
        System.out.println(str1.substring(5));
        /*s.substring prints substring of a string from the given beginning index to last
         * if n=stringlength then it returns empty string
         
       }
       System.out.println(str1.substring(2,5));/*
        /*prints from start to end index
     */
          
        StringBuffer st=new StringBuffer("abc");
        st.setCharAt(1,'f');
        st.append("st");
        System.out.println(st);

    }
}
