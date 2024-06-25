package schedulers4j.examples;

import schedulers4j.ScheduledPool;
import schedulers4j.Scheduler;

public class CreateMainPoolExample {

    public static void main(String[] args) {
        Scheduler scheduler = null;
        ScheduledPool main = scheduler.main();
    }
}
