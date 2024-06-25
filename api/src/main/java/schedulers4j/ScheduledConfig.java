package schedulers4j;

import org.jetbrains.annotations.NotNull;
import schedulers4j.util.Condition;
import schedulers4j.util.Returner;
import schedulers4j.util.Subscriber;

import java.io.File;
import java.nio.file.Path;
import java.time.Duration;

public interface ScheduledConfig<T> {

    ScheduledTask<T> runAsync();

    ScheduledTask<T> sync();

    ScheduledConfig<T> every(@NotNull Duration duration);

    ScheduledConfig<T> daily();

    ScheduledConfig<T> weekly();

    ScheduledConfig<T> monthly();

    ScheduledConfig<T> yearly();

    ScheduledConfig<T> after(@NotNull Duration duration);

    ScheduledConfig<T> afterDay();

    ScheduledConfig<T> afterWeek();

    ScheduledConfig<T> afterMonth();

    ScheduledConfig<T> afterYear();

    ScheduledConfig<T> storeReturns();

    ScheduledConfig<T> returns(@NotNull Returner<T> returner);

    ScheduledConfig<T> skipIf(@NotNull Condition<T> condition);

    ScheduledConfig<T> skipAt(long repeatsTimes);

    ScheduledConfig<T> skipAt(long repeatsTimes, long skips);

    ScheduledConfig<T> limit(@NotNull Condition<T> condition);

    ScheduledConfig<T> limit(long repeatsTimes);

    ScheduledConfig<T> enableStats();

    ScheduledConfig<T> enableFallback(@NotNull Path dir);

    ScheduledConfig<T> enableFallback(@NotNull File dir);

    ScheduledConfig<T> onSkip(@NotNull Subscriber<ScheduledTask<T>> subscriber);

    ScheduledConfig<T> onCancel(@NotNull Subscriber<ScheduledTask<T>> subscriber);

    ScheduledConfig<T> onReturn(@NotNull Subscriber<T> subscriber);
}
