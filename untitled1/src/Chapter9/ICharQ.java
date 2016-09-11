package Chapter9;

/**
 * Created by test on 7/15/2016.
 */
public interface ICharQ {
    void put (char ch) throws QueueFullException;

    char get () throws QueueEmptyException;
}
