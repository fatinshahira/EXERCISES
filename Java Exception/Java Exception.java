
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






