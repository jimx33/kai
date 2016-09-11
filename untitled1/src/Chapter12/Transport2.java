package Chapter12;

/**
 * Created by test on 8/3/2016.
 */
public enum Transport2 {
    CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(22);
    private int speed;

    Transport2(int s) { speed = s; }
    int getSpeed() { return speed; }
}
class EnumDemo3 {
    public static void main(String args[])
    {
        Transport2 tp;

        System.out.println("Typical speed for an airplane is " +
                Transport2.AIRPLANE.getSpeed() +
                " miles per hour.\n");
        System.out.println("All Transport speeds: ");
        for(Transport2 t : Transport2.values())
            System.out.println(t + " typical speed is " +
                    t.getSpeed() +
                    " miles per hour.");
    }
}
