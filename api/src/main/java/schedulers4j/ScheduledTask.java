package schedulers4j;

import org.jetbrains.annotations.NotNull;

import java.time.Duration;
import java.util.Optional;
import java.util.function.UnaryOperator;

public interface ScheduledTask<T> {

    TaskStats dumpStats();

    TaskStats stats();

    Optional<T> firstReturn();

    Optional<T> lastReturn();

    Optional<T> join();

    Optional<T> get(int index);

    Optional<T> get(@NotNull Duration timeout);

    void update(UnaryOperator<ScheduledConfig<T>> updater);

    void cancel(boolean force);

    void cancel();
}
