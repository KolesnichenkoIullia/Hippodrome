package Hippodrome;
import java.util.Random;

/**
 * Created by admin on 9/9/2017.
 */
import static java.lang.Thread.currentThread;
import static java.lang.Thread.sleep;

public class Horse implements Runnable {
    String name;

    Horse(String name){
        this.name = name;
    }


    @Override
    public void run() {

        try {

            int way = 0;
            while (way <= 100) {
                Random random1 = new Random ();
                long step = random1.nextInt (4) + 1;
                way += step;
                System.out.println (name + " " + way);
                Random random = new Random();
                long time = random.nextInt(400) + 200;
                currentThread ().sleep (time);
            }
            System.out.println (name + " is a first horse");
            System.exit(0);;

        } catch (InterruptedException e) {
            e.printStackTrace ();
        } finally { }
    }
}



