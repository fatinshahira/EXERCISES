//3 SIMPLE WAYS
//HOW TO IMPLEMENT JAVA INTERFACE

public interface MyInterface {

    
   void sayHello();
        
    }
    
    
   //METHOD 1
    
    public class Method1 implements MyInterface{

    @Override
    public void sayHello() {
         System.out.println("Hello Method1");
    }
    
    public static void main(String[]args){
    Method1 method1 = new Method1();
    method1.sayHello();
    }
}

//METHOD 2

public class Method2 {
    
    public static void main ( String[]args){
    
    MyInterface myInterface = new MyInterface(){
        @Override
        public void sayHello() {
            System.out.println("Hello Method2");
        }
         
    };
    myInterface.sayHello();
    }
}

//METHOD 3


public class Method2 {
    
    public static void main ( String[]args){
    
    MyInterface myInterface = new MyInterface(){
        @Override
        public void sayHello() {
            System.out.println("Hello Method2");
        }
         
    };
    myInterface.sayHello();
    }
}






