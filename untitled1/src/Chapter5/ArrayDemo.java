package Chapter5;

/**
 * Created by test on 7/1/2016.
 */
public class ArrayDemo {
    public static void  main(String args[]){
        int sample[] = new int[10];
        int i;

        for (i = 0; i < 10; i = i+1)
            sample[i] = i;
        for (i = 0; i <10; i = i+1)
            System.out.println("This is sample[" + i + "]: " + sample[i]);
    }
}
