public class Main {
    public static void main(String[] args) {

    //generics = enable types (classes and interfaces) to be parameters when defining:
    //           classes, interfaces and methods
    //           a benefit is to eliminate the need to create multiple versions
    //           of methods or classes for various data types
    //           Use 1 version for all reference data types
    //

    Integer[] intArray = {1,2,3,4,5};
    Double[] doubleArray = {5.5,5.3,3.2,5.6,2.5};
    Character[] charArray = {'H','E','L','O'};
    String[] stringArray = {"B","Y","E"};

    displayArray(intArray);
    displayArray(doubleArray);
    displayArray(charArray);
    displayArray(stringArray);

    }
    public  static void displayArray(Integer[] array){
        for(Integer x : array){
            System.out.print(x + "");

        }
        System.out.println();
    }
    public  static void displayArray( Double[] array){
        for( Double x : array){
            System.out.print(x + "");

        }
        System.out.println();
    }
    public  static void displayArray(Character[] array){
        for(Character x : array){
            System.out.print(x + "");

        }
        System.out.println();
    }
    public  static void displayArray(String[] array){
        for(String x : array){
            System.out.print(x + "");

        }
        System.out.println();
    }

}