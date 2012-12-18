package dining.philosopher.ch;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created with IntelliJ IDEA.
 * User: bbu
 * Date: 18.12.12
 * Time: 16:32
 */
class Fork {
    public static final int ON_TABLE = -1;
    static int instances = 0;
    public int id;
    public AtomicInteger holder = new AtomicInteger(ON_TABLE);

    Fork() { id = instances++; }
}
