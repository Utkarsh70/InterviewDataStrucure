import java.util.*;

public class IterateOverArrayList{
   public static void main(String[] args){
       ArrayList<Object> list = new ArrayList<>();
      list.add("Welcome");
      list.add("Tiger");
      list.add("Lion");
      list.add(true);
      list.add(988);

      //Using For loop
      System.out.println("Using for loop");
      for(int i=0;i<list.size();i++){
          System.out.println(list.get(i));
      } 

    System.out.println("Using for each loop");
     for(Object e : list){
          System.out.println(e);
     }

    System.out.println("Using iterator");
     Iterator<Object> it = list.iterator();
     while(it.hasNext()){
       System.out.println(it.next());
      }
  }
}