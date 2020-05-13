
package myiterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyIterator {

   
    public static void main(String[] args) {
      
        List<String> countryList = Arrays.asList("China","Italy" ,"India");
        System.out.println("=====> 1. usingListIterator");
        ListIterator<String> myListIterator = countryList.listIterator();
        while (myListIterator.hasNext()){
        System.out.println(myListIterator.next());
        
        }
        
    System.out.println("=====> 2. using Iterator");
    Iterator<String> myIterator = countryList.iterator();
    while(myIterator.hasNext()){
    System.out.println(myIterator.next());
    }
    
    System.out.println("=====> 3. using simple for loop");
    for (int i = 0; i < countryList.size(); i++){
    System.out.println(countryList.get(i));
    }
    
    System.out.println("=====> 4. using enhanced for loop");
    for (String country : countryList){
        System.out.println(country);
    }

     System.out.println("=====> 5. using while loop");
     int i = 0;
     while(countryList.size()> i){
      System.out.println(countryList.get(i++));
     }
     System.out.println("=====> 6. using lambda expression");
     countryList.forEach(country ->  System.out.println(country) );

     System.out.println("=====> 7. using method reference");
     countryList.forEach(System.out ::println);
    }
    
}


