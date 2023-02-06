package JAVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class chapinput {
    /**
     * @param args
     * @throws NumberFormatException
     * @throws IOException
     */
    public static void main(String[] args) throws NumberFormatException,
            IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] strNums = str.split(" ");
        for (int i = 0; i < strNums.length; i++) {
            System.out.print(strNums[i] + " ");
        }
    }
}
/*
 * It is another method of java input
 * In this method, we will use a class called InputStreamReader, which takes
 * input byte by
 * byte and decodes it into a character stream. After reading data from the
 * source
 * keyboard, the decoded data (character stream) is stored in a buffer (storage
 * meant for
 * temporary usage) and then the object of class BufferedReader reads from this
 * buffer.
 * Note:
 * 1. Since, methods of BufferedReader class and InputStreamReader deal in input
 * and
 * output operations, therefore, these methods may lead to errors in reading
 * input or
 * writing output. Therefore, the function must throw IOException.
 * 2. BufferedReader and InputStreamReader are in the “io” package. Therefore,
 * following
 * statements must be included at the top of the code:
 * import java.io.BufferedReader;
 * import java.io.IOException;
 * import java.io.InputStreamReader;
 * Or alternatively, we can include: import java.io.*;
 * int a = Integer.parseInt(br.readLine());
 * float b = Float.parseFloat(br.readLine());
 * String str = br.readLine();
 */