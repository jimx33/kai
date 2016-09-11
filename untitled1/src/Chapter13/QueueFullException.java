package Chapter13;

/**
 * Created by test on 8/4/2016.
 */
class QueueFullException extends Exception {

    int size;

    QueueFullException(int s) {
        size = s;
    }

    public String toString() {
        return "\nQueue is full. Maximum size is " +
                size;
    }
}

class QueueEmptyException extends Exception {
    public String toString() {
        return "\nQueue is empty.";
    }
}

