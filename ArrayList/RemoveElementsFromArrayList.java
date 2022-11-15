import java.util.List;
import java.util.ArrayList;


public class RemoveElementsFromArrayList{

   public static void main(String[] args){
         ArrayList<Integer> list = new ArrayList<>();
         list.add(10);
         list.add(20);
         list.add(30);
         list.add(40);
         list.add(50);
          System.out.println("before deleteing : " + list);
         list.remove(3);
         System.out.println("After removing 3 index value list is : " + list);
     
  
         //----------------------------------
         list.add(90);
         list.add(180);
         list.add(270);
         list.add(20);

         System.out.println("After Adding : " + list);
      
          ArrayList<Integer> newList = new ArrayList<>();
          newList.add(20);
          newList.add(90);
          newList.add(180);
  
         //remove a collection
          list.removeAll(newList);

           System.out.println("After removing a collection : " + list);

         //clear method
          list.clear();
          System.out.println("After using clear method : " + list);

    }
}