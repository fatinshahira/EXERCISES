package perimeter;
import java.util.Scanner;

public class Perimeter {

public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);

    System.out.println("Enter Rectangle Length");
    double length = scanner.nextDouble();

    System.out.println("Enter Rectangle Width");
    double width = scanner.nextDouble();

    //perimeter = 2*(length+width)
    double perimeter = 2*(length+width);
    System.out.println("Perimeter of Rectangle = " + perimeter);

    scanner.close();
        
        
        
        
    }
    
}
