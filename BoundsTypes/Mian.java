public class Mian {
    public static void main(String[] args) {

        // bounded types = you can create the objects of a generics class to have data
        //                 of specific derived types ex.Number

        MyGenericsClasses<Integer, Integer> myInt = new MyGenericsClasses<>(1, 4);
        MyGenericsClasses<Double, Double> myDouble = new MyGenericsClasses<>(3.17, 3.2);
   

        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
     
    }
}