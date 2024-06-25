package schedulers4j.util;

@FunctionalInterface
public interface Subscriber<T> {

    void send(T notification);
}
