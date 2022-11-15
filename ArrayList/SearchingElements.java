import java.util.*;

public class SearchingElements{
   public static void main(String[] args){
      ArrayList<Integer> list = new ArrayList<Integer>();
     list.add(1);
     list.add(2);
     list.add(10);
     list.add(40);
     list.add(100);
     list.add(60);
     list.add(40);
     list.add(1);
     list.add(2);
     list.add(10);     

     //contains method\
     System.out.println("Array contains 90 : " + list.contains(90));
 
      //return the first occurence of element x
     System.out.println("First occurence of 40 : " + list.indexOf(40));


     //return the last occurence of element x
     System.out.println("last occurence of 40 : " +list.lastIndexOf(40));

   }
}