package Chapter12;

/**
 * Created by test on 8/3/2016.
 */
public enum Transport1 {
    CAR, TRUCK, AIRPLANE, TRAIN, BOAT
}
class EnumDemo2 {
    public static void main(String args[])
    {
        Transport1 tp;
        System.out.println("Here are all Transport constants");

        Transport1 allTransports[] = Transport1.values();
        for(Transport1 t : allTransports)
            System.out.println(t);
        System.out.println();

        tp = Transport1.valueOf("AIRPLANE");
        System.out.println("tp contains " + tp);
    }
}
