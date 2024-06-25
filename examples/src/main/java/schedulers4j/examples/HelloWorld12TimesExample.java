package schedulers4j.examples;

import schedulers4j.*;

import java.time.Duration;

public class HelloWorld12TimesExample {

    public static void main(String[] args) {
        Scheduler scheduler = null;

        ScheduledPool main = scheduler.main();

        ScheduledConfig<String> config =
                main.beginTask(String.class)
                        .enableStats()
                        .every(Duration.ofSeconds(1))
                        .skipIf(s -> !s.contains("Hello"))
                        .returns(() -> "Hello world!")
                        .onReturn(System.out::println)
                        .limit(10);

        ScheduledTask<String> scheduledTask = config.runAsync();
        TaskStats taskStats = scheduledTask.dumpStats();

        System.out.println(taskStats);

        scheduledTask.update(updateConfig -> updateConfig
                .skipAt(5, 1)
                .limit(12));
    }
}
