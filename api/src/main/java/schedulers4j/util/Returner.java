package schedulers4j.util;

@FunctionalInterface
public interface Returner<T> {

    T returns();
}
