package Chapter9;

/**
 * Created by test on 7/15/2016.
 */
public class QueueEmptyException extends Exception {
    public String toString() {
        return "\nQueue is empty.";
    }
}