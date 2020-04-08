package inheritance;

class Person{

public void DisplayName(){

System.out.println("My name is fatin");
}
}

class Student extends Person{

    public static void main(String[]args){
        Student student = new Student();
        student.DisplayName();
    }
}
