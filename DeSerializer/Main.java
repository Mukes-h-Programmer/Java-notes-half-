import java.io.*;


public class Main{
    public static void main(String[] args) throws IOException, ClassNotFoundException{

        User user = null;

        FileInputStream filein = new FileInputStream("/home/mukesh/Documents/Java Notes/Serialization/UserInfo.ser");
        ObjectInputStream in = new ObjectInputStream(filein);
        user = (User) in.readObject();
        in.close(); 
        filein.close();

        System.out.println(user.name);
        System.out.println(user.password);
        user.sayHello();


     long serialVersionUID =  ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
     System.out.println(serialVersionUID);

    }
}


//                Steps to Deserialize
//                ------------------------------------
//                1. Declare your object (don't instantiate)
//                2. Your class should implement Serializable interface
//                3. add import java.io.Serializable;
//                4. FileInputStream filein = new FileInputStream(file path);
//                5. ObjectInputStream in = new ObjectInputStream(FileIn);
//                6. objectName = (Class) in.readObject();
//                7. in.close; 
//                8. fileIn.close();
                  
                        
//                            Importanat Notes
//-----------------------------------------------------------------------------
// 1. children classes of parent class that implements Serializable will do so as well
// 2. static fields are not serialized (they belong to the class, not an individual object)
// 3. the class's definition ("class file") itself is not recorded, cast it as the object type
// 4. Fields declared as "transient" arn't serialized, they're ignored
// 5. serialVersionUID is a unique version ID

//  serialVersion UID = serialVersionUID is a unique ID that functions like a verion #
//-------------------   verifies that the sender and receiver of a serialized object,
//                      have loaded classes for that object that match
//                      Ensures object will be compactible between machines
//                      Numbers must match. otherwise this will cause a InvalidClassException
//                      A SerialVersionUID will be calculated based on class properties , member etc.
//                      A Serialzable class can declare its own serialVersionUID explicitly (recommended)

