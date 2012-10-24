package ch.hszt.aud.exercise_04;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: bbu
 * Date: 24.10.12
 * Time: 20:13
 */
public class Task1Impl_Buetikofer extends Task1 {
    public Task1Impl_Buetikofer(Author[] authors, String title, String isbn, String publisher,
                                Date dateOfPublication, double price) throws NullPointerException
    {
        super(authors, title, isbn, publisher, dateOfPublication, price);
    }

    @Override
    public boolean equals(Object object) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String toString() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int compareTo(Task1 task4Book) {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

}
