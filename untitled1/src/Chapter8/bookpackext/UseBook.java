package Chapter8.bookpackext;
import Chapter8.BookPack.*;

/**
 * Created by test on 7/13/2016.
 */
public class UseBook {
    public static void main(String args[]){
        Book books[] = new Book[5];
        books[0] = new Chapter8.BookPack.Book("Java: A Beginner's Guide",
                "Schildt", 2014);
        books[1] = new Chapter8.BookPack.Book("Java: The Complete Reference",
                "Schildt", 2014);
        books[2] = new Chapter8.BookPack.Book("The Art of Java",
                "Schildt and Holmes", 2003);
        books[3] = new Chapter8.BookPack.Book("Red Storm Rising",
                "Clancy", 1986);
        books[4] = new Chapter8.BookPack.Book("On the Road",
                "Kerouac", 1955);
        for(int i=0; i < books.length; i++) books[i].show();
    }
}
