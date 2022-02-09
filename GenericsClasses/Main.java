import java.util.ArrayList;
import java.util.HashMap;

public class Main{
    public static void main(String[] args) {
        
       MyGenericsClasses<Integer, Integer> myInt = new MyGenericsClasses<>(1,4);
       MyGenericsClasses<Double, Double> myDouble = new MyGenericsClasses<>(3.17,3.2);
       MyGenericsClasses<Character, Character> myChar = new MyGenericsClasses<>('@','g');
MyGenericsClasses<String,Integer> myString = new MyGenericsClasses<>("Hello",5);    
        

 //   ArrayList<Integer> myInt = new ArrayList<>(1); // we can also use ArrayList like intense of Generics classes .
 
      // HashMap <Integer, String> users = new HashMap<>(); we can also use HashMap like this


        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myString.getValue());

        System.out.println(myInt.getValue2());
        System.out.println(myDouble.getValue2());
        System.out.println(myChar.getValue2());
        System.out.println(myString.getValue2());
    }
}