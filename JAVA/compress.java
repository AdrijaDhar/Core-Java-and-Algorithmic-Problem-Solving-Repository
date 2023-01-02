package JAVA;

public class compress {
    public static String getCompressedString(String str) {
		// Write your code here.
	String s=new String();
        int n = str.length();
        for (int i = 0; i < n; i++)
        {

            int count = 1;
            while (i < n - 1 && str.charAt(i) == str.charAt(i + 1))
            {
                count++;
                i++;
            }
            s+=str.charAt(i);
            if(count>1)
            {
                s+=count;
            }
        }
        return s;
	}
}
