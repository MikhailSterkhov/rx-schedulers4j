package schedulers4j.examples;

import schedulers4j.ScheduledPool;
import schedulers4j.Scheduler;

public class CreateCustomPoolExample {

    public static void main(String[] args) {
        Scheduler scheduler = null;
        ScheduledPool customPool = scheduler.newPool("custom-pool-{c}-[{n}]");

        //customPool.beginTask();
    }
}
