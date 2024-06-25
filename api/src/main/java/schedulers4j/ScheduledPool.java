package schedulers4j;

public interface ScheduledPool {

    <T> ScheduledConfig<T> beginTask(Class<T> returnType);

    ScheduledConfig<Void> beginTask();
}
