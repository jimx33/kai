package Chapter9;

/**
 * Created by test on 7/14/2016.
 */
class ExcTest1 {
    static void genException() {
        int nums[] = new int[4];
        System.out.println("Before exception is generated.");

        nums[7] = 10;
        System.out.println("this won't be displayed");
    }
}

class ExcDemo2 {
    public static void main(String args[]) {
        try {
            ExcTest1.genException();
        } catch (ArrayIndexOutOfBoundsException exc) {

            System.out.println("Index out-of-bounds!");
        }
        System.out.println("After catch statement.");
    }
}