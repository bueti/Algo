package dining.philosopher.ch;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: bbu
 * Date: 18.12.12
 * Time: 16:33
 */
public class Main {
    static final int philosopherCount = 5; //  token +2 behavior good for odd #s
    static final int runSeconds = 15;
    static ArrayList<Fork> forks = new ArrayList<Fork>();
    static ArrayList<Philosopher> philosophers = new ArrayList<Philosopher>();

    public static void main(String[] args) {
        // "Create" Philosophers
        for (int i = 0 ; i < philosopherCount ; i++) forks.add(new Fork());
            philosophers.add(new Philosopher("Habermas"));
            philosophers.add(new Philosopher("Sloterdijk"));
            philosophers.add(new Philosopher("Wittgenstein"));
            philosophers.add(new Philosopher("Carnap"));
            philosophers.add(new Philosopher("Heidegger"));

        // One thread for every philosopher
        for (Philosopher p : philosophers) new Thread(p).start();

        // Timing
        long endTime = System.currentTimeMillis() + (runSeconds * 1000);

        do {                                                    //  print status
            StringBuilder sb = new StringBuilder("|");

            for (Philosopher p : philosophers) {
                System.out.println(p.getName() + " " + p.state.toString());
                //sb.append(p.getName());
                //sb.append(" ");
                //sb.append(p.state.toString());
                //sb.append("|");            //  This is a snapshot at a particular
            }                              //  instant.  Plenty happens between.

            //System.out.println(sb.toString());
            System.out.println("------------");
            try {Thread.sleep(1000);} catch (Exception ex) {}
        } while (System.currentTimeMillis() < endTime);

        for (Philosopher p : philosophers) p.end.set(true);
        for (Philosopher p : philosophers)
            System.out.printf(p.getName() + ": ass %,d mal, %,d/sec\n",
                    p.timesEaten, p.timesEaten/runSeconds);
    }
}
