import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Main{

    public static void main(String[] args) {

        //Timer = A facility for threads to schedule tasks
        //        for future execution in a background thread

        // TimerTask =  A task that can be scheduled for one-time
        //              or repeated execution by a Timer

        Timer timer = new Timer();

        TimerTask task = new TimerTask() {

            int counter = 10;
            @Override
            public void run() {
                if(counter>0){
                System.out.println(counter+"Task is complete :)");
                
                counter--;
            }
            else{
                System.out.println("Don't piss on thier mouth");
                timer.cancel();
            }
            }
            
        };
        Calendar date = Calendar.getInstance();
        date.set(Calendar.YEAR,2022);
        date.set(Calendar.MONTH,Calendar.FEBRUARY);
        date.set(Calendar.DAY_OF_MONTH,9);
        date.set(Calendar.HOUR_OF_DAY,22);
        date.set(Calendar.MINUTE,23);
        date.set(Calendar.SECOND,5);
        date.set(Calendar.MILLISECOND,5);

        // timer.schedule(task,3000);
        // timer.schedule(task, date.getTime());
        //timer.schedule(task, 0, 1000);

        timer.scheduleAtFixedRate(task, date.getTime(), 1000);
    }
}