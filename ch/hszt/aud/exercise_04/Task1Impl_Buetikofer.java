package ch.hszt.aud.exercise_04;

import javax.security.sasl.AuthorizeCallback;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: bbu
 * Date: 24.10.12
 * Time: 20:13
 */
public class Task1Impl_Buetikofer extends Task1 {
    public static final int SEED = 23;

    private String isbn;
    private String title;
    private Author[] authors;

    public Task1Impl_Buetikofer(Author[] authors, String title, String isbn, String publisher,
                                Date dateOfPublication, double price) throws NullPointerException
    {
        super(authors, title, isbn, publisher, dateOfPublication, price);
        this.isbn = isbn;
        this.title = title;
        this.authors = authors;
    }

    @Override
    public boolean equals(Object object) {
        isbn = isbn.replaceAll("-", "");
        if(object.equals(isbn))
            return true;
        return false;
    }

    @Override
    public int hashCode() {
        int result = 17;
        int isbnInt = Integer.parseInt(isbn.replaceAll("[^0-9]", ""));
        result = SEED * result + isbnInt;

        return result;
    }

    @Override
    public String toString() {
        return isbn + " - " + title;
    }

    @Override
    public int compareTo(Task1 task4Book) {

        return this.getTitle().compareTo(task4Book.getTitle());
    }

}
