package Chapter5;

/**
 * Created by test on 7/1/2016.
 */
public class StringDemo {
    public static void main(String args[]) {

        String str1 = new String("Java strings are objects.");
        String str2 = "They are constructed various ways.";
        String str3 = new String(str2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
