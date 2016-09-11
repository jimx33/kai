package Chapter3;

/**
 * Created by test on 6/30/2016.
 */
public class SwitchDemo {
    public static void main(String args[]){
        int i;
        for(i=0; i<10; i++)
            switch(i){
                case 0:
                    System.out.println("i is zero");
                    break;
                case 1:
                    System.out.println("i is one");
                    break;
                case 2:
                    System.out.println("i is two");
                    break;
                case 3:
                    System.out.println("i is three");
                    break;
                default:
                    System.out.println("i is four or more");
            }
    }
}
