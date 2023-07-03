import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
class ConsoleClock extends Thread{

    // write class which print time as HH:MM:SS
    // every second here
    @Override
    public void run() {
        while (!isInterrupted()){
            SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
            Calendar calendar = Calendar.getInstance();
            System.out.println(dateFormat.format(calendar.getTime()));
            try {
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                break;
            }
        }

        System.out.println("The clock was stopped");
    }
}

