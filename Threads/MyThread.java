public class MyThread extends Thread {
   
    // @Override
    // public void run(){

    //     System.out.println("This thread is running");
    // }
    public void run(){

        if(this.isDaemon()){
        System.out.println("This is daemon that  thread is running");
    }
else{
    System.out.println("This is a user thread that is running");
}}

}
