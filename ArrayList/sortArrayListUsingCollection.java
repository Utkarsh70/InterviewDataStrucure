import java.util.*;

public class sortArrayListUsingCollection{
    public static void main(String []args){
        List<Integer> list = new ArrayList<>();
        list.add(30);
        list.add(10);
        list.add(70);
        list.add(20);
        list.add(80);
        list.add(50);
        list.add(40);

       System.out.println("Before Sorting  List is : " + list);
      Collections.sort(list);
       System.out.println("After sorting List is : "  + list);
    }  
}