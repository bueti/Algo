package dining.philosopher;

import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created with IntelliJ IDEA.
 * User: bbu
 * Date: 18.12.12
 * Time: 16:32
 */
class Philosopher implements Runnable {
    static final int maxWaitMs = 100;                          //  must be > 0
    static AtomicInteger token = new AtomicInteger(0);
    static int instances = 0;
    static Random rand = new Random();
    AtomicBoolean end = new AtomicBoolean(false);
    int id;
    PhilosopherState state = PhilosopherState.wartet;
    Fork left;
    Fork right;
    int timesEaten = 0;
    private String name;

    Philosopher(String name) {
        setName(name);
        id = instances++;
        left = Main.forks.get(id);
        right = Main.forks.get((id+1)%Main.philosopherCount);
    }

    void sleep() { try { Thread.sleep(rand.nextInt(maxWaitMs)); }
    catch (InterruptedException ex) {} }

    void waitForFork(Fork fork) {
        do {
            if (fork.holder.get() == Fork.ON_TABLE) {
                fork.holder.set(id);                //  my id shows I hold it
                return;
            } else {                                //  someone still holds it
                sleep();                            //  check again later
            }
        } while (true);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void run() {
        do {
            if (state == PhilosopherState.denkt) {    //  all that pondering
                state = PhilosopherState.wartet;       //  made me hungry
            } else { // ==PhilosopherState.wartet
                if (token.get() == id) {            //  my turn now
                    waitForFork(left);
                    waitForFork(right);             //  Ah needs me some foahks!
                    token.set((id+2)% Main.philosopherCount);
                    state = PhilosopherState.isst;
                    timesEaten++;
                    sleep();                        //  eat for a while
                    left.holder.set(Fork.ON_TABLE);
                    right.holder.set(Fork.ON_TABLE);
                    state = PhilosopherState.denkt;   //  ponder for a while
                    sleep();
                } else {                    //  token.get() != id, so not my turn
                    sleep();
                }
            }
        } while (!end.get());
    }
}
