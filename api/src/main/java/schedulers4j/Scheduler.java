package schedulers4j;

import org.jetbrains.annotations.NotNull;

public interface Scheduler {

    ScheduledPool newPool(@NotNull String nameFormat);

    ScheduledPool newPool();

    ScheduledPool main();
}
