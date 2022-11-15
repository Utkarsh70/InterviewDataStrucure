import java.util.*;

class User {
   private String name;
   private int age;
   public User(String name, int age){
       this.name = name;
       this.age = age;
    }
   //getter and setter method
     public String getName(){
          return name;
     }
     public void setName(String name){
        this.name = name;
     }
     public void setAge(int age){
        this.age = age; 
     }
     public int getAge(){
       return age;
     }
}

public class ArrayListUserDefinedObject{
   public static void main(String[] args){
        ArrayList<User> users = new ArrayList<User>();

        users.add(new User("Ram",40));
        users.add(new User("Shyam",78));


        users.forEach(user -> {
          System.out.println("Name : " + user.getName() + ",  Age : " + user.getAge());
       });
   }
}




