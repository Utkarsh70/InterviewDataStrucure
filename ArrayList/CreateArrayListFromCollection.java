import java.util.*;

public class CreateArrayListFromCollection{
    public static void main(String[] args){
        ArrayList<Integer> firstFivePrimeNumber = new ArrayList<>();
        firstFivePrimeNumber.add(2);
        firstFivePrimeNumber.add(3);
        firstFivePrimeNumber.add(5);
        firstFivePrimeNumber.add(7);
        firstFivePrimeNumber.add(11);

      ArrayList<Integer> firstTenPrimeNumbers = new ArrayList<>(firstFivePrimeNumber);
     //firstTenPrimeNumbers.addAll(firstFivePrimeNumber);
   
      ArrayList<Integer> list = new ArrayList<>();
      list.add(13);
      list.add(17);
      list.add(19);
    
      firstTenPrimeNumbers.addAll(list);
      System.out.println("List is : " + firstTenPrimeNumbers);
    }
 }