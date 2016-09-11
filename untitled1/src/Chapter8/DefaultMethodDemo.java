package Chapter8;

/**
 * Created by test on 7/14/2016.
 */
class MyIFImp implements MyIF {
    public int getUserID() {
        return 100;
    }
}

public class DefaultMethodDemo {
    public static void main(String args[]) {
        MyIFImp obj = new MyIFImp();
        System.out.println("User ID is " + obj.getUserID());
        System.out.println("Administrator ID is " + obj.getAdminID());
    }
}

class MyIFImp2 implements MyIF {
    public int getUserID() {
        return 100;
    }
    public int getAdminID() {
        return 42;
    }
}