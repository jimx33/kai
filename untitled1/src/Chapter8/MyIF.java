package Chapter8;

/**
 * Created by test on 7/14/2016.
 */
public interface MyIF {

    int getUserID();

    default int getAdminID() {
        return 1;
    }
}
