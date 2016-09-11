package Chapter13;

/**
 * Created by test on 8/4/2016.
 */
public interface IGenQ<T> {
    void put(T ch) throws QueueFullException;
    T get () throws QueueEmptyException;
}
