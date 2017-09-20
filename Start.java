package Hippodrome;

/**
 * Created by admin on 9/12/2017.
 */
public class Start {
    public static void main(String[] args) {

        Horse Horse1 = new Horse ("Molly");
        Horse Horse2 = new Horse ("Holly");
        Horse Horse3 = new Horse ("Dolly");

        Thread startHorse1 = new Thread (Horse1);
        Thread startHorse2 = new Thread (Horse2);
        Thread startHorse3 = new Thread (Horse3);

        startHorse1.start();
        startHorse2.start();
        startHorse3.start();
    }
}

