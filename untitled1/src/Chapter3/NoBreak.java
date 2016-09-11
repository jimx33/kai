package Chapter3;

/**
 * Created by test on 6/30/2016.
 */
public class NoBreak {
    public static void main(String args[]){
        int i;
        for(i=0; i<=5; i++){
            switch(i) {
                case 0:
                    System.out.println("i is less than one");
                case 1:
                    System.out.println("i is less than two");
                case 2:
                    System.out.println("i is less than three");
                case 3:
                    System.out.println("i is less than four");
            }
        System.out.println();
            }
    }
}
