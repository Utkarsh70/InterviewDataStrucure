import java.util.*;

public class AccessElementsFromArrayList{
   public static void main(String[] args){
       ArrayList<String> collections = new ArrayList<>();

       System.out.println("List is Empty : " + collections.isEmpty());
     
       collections.add("Hello1");
       collections.add("Hello2");
       collections.add("Hello3");
       collections.add("Hello4");
   
      System.out.println("Size of list is :  " + collections.size());
      System.out.println("List is : " + collections);
 
      //reterive element from index;
      System.out.println(collections.get(0));
      System.out.println(collections.get(collections.size()-2));
      
     //modifying element
      collections.set(3,"Walmart");
      System.out.println("Modifying list is : " + collections);
 
   }

}