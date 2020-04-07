
package javaexception;

import java.util.InputMismatchException;
import java.util.Scanner;


public class JavaException {

  
    public static void main(String[] args) {
      
        System.out.println("Start");
        Scanner scanner = new Scanner(System.in);
        try{
        int result = scanner.nextInt();
        System.out.println(result);
            }
        catch(InputMismatchException e){
        System.out.println("InputMismatchException");
           }
        finally{
        System.out.println("This is finaly message");  
        
        
    }
    System.out.println("Stop");
}
}

![java exception](https://user-images.githubusercontent.com/55240830/78657264-16a11000-78fb-11ea-8043-e41339d9084e.png)

