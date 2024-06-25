package schedulers4j.util;

@FunctionalInterface
public interface Condition<T> {

    boolean predicate(T notification);
}
