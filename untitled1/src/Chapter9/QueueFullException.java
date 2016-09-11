package Chapter9;

/**
 * Created by test on 7/15/2016.
 */
public class QueueFullException extends Exception {
    int size;
    QueueFullException(int s) { size = s; }
    public String toString() {
        return "\nQueue is full. Maximum size is " +
                size;
    }
}