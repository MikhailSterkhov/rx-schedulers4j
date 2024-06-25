package schedulers4j;

public interface TaskStats {

    long repeats();

    long skips();

    long returns();

    long startedTimeMillis();

    long lastTempStoreTimeMillis();

    long cancellationTimeMillis();
}
