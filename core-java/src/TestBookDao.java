
import java.util.List;

import com.mmcoe.dao.BookDao;
import com.mmcoe.dao.BookDaoCollectionImpl;
import com.mmcoe.pojo.Book;

public class TestBookDao  {

    public static void main(String[] args) {

        BookDao dao = new BookDaoCollectionImpl();

        dao.save(new Book(101, "Java", "James Gosling", 500));
        dao.save(new Book(102, "Python", "Guido van Rossum", 450));
        dao.save(new Book(103, "C++", "Bjarne Stroustrup", 350));
        dao.save(new Book(104, "DSA", "Narasimha Karumanchi", 600));

        System.out.println("----- List of Books -----");
        List<Book> books = dao.list();

        for(Book b : books)
            System.out.println(b);

        System.out.println("\n----- Find Book -----");
        System.out.println(dao.find(102));

        System.out.println("\n----- Delete Book -----");
        dao.delete(103);

        books = dao.list();

        for(Book b : books)
            System.out.println(b);

        System.out.println("\n----- Books Between Price 400 and 600 -----");

        books = dao.findByPrice(400, 600);

        for(Book b : books)
            System.out.println(b);
    }
}