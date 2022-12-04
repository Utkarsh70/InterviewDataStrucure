import java.util.*;

public class rightDownMirrorStarPattern{
   public static void printPattern(int n){
       for(int i=0;i<n;i++){
          for(int j=0;j<i;j++){
            System.out.print(" ");
         }
            for(int j=i;j<n;j++){
               System.out.print("*");
           }
        System.out.println();  
      }
   }
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter value of n : ");
      int n = sc.nextInt();
      printPattern(n);      
  }
}

/*
*****
  ****
    ***
      **
        *
*/