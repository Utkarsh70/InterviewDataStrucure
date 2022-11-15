import java.util.*;

public class ArrayListIteratorRemove{
   public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(2);
        list.add(3);
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
          int val = it.next();
          if(val%2!=0)
             it.remove();
         }
      System.out.println(list);
    }
}