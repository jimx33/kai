package Chapter13;

/**
 * Created by test on 8/4/2016.
 */
public class Pair<T, V extends T> {
    T first;
    V second;
    Pair(T a, V b) {
        first = a;
        second = b;
    }
}
