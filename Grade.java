
package grade;

import java.util.Scanner;

public class Grade {

public static void main(String[] args) {
       
        
  float markah =-1;
  String gred,description,range;
  
  while (markah<0 || markah>100){
      System.out.println("ENTER YOUR SCORE");
      Scanner scanner = new Scanner (System.in);
      markah = scanner.nextFloat();}
  
  if (markah> 89.45){
            gred= "A+";   
            range = "89.45 - 100.00";
            description = "CEMERLANG";}

        else if(markah>79.45){
            gred="A";
            range = "79.45 - 89.44";
            description = "CEMERLANG";}
  
        else if(markah>74.45){
            gred="A-";
            range = "74.45 - 79.44";
            description = "CEMERLANG";}

         else if(markah>69.45){
            gred="B+";
            range = "69.45 - 74.44";
            description = "KEPUJIAN";}
  
        else if(markah>64.45){
            gred="B";
            range = "69.45 - 69.44";
            description = "KEPUJIAN";}
  
        else if(markah>59.45){
            gred="B-";
            range = "59.45 - 64.44";
            description = "KEPUJIAN";}
  
        else if(markah>54.45){
            gred="C+";
            range = "54.45 - 59.44";
            description = "BAIK";}
        
        else if(markah>49.45 ){
            gred="C";
            range = "49.45 - 54.44";
            description = "BAIK";}
  
        else if(markah>44.45 ){
            gred="C-";
            range = "44.45 - 49.44";
            description = "LULUS";}

        else if(markah>39.45){
            gred="D+";
            range = "39.45 - 44.44";
            description = "GAGAL";}

        else if(markah>34.45){
            gred="D+";
            range = "34.45 - 39.44";
            description = "GAGAL";}
  
        else {
            gred="F";
            range = "0.01 - 34.44";
            description = "GAGAL";}
  
   String myFormat1 = "%-15s %20s %25s\n";
   String myFormat2 = "%-15s %25s %18s\n";
   
   System.out.printf("---------------------------------------------------------------\n");
   System.out.printf(myFormat1,"GRADE", " RANGE", "DESCRIPTION");
   System.out.printf(myFormat2,gred ,range, description);
   System.out.printf("---------------------------------------------------------------");
        
        
        
        
    }
    
}
