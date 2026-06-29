import com.mmcoe.service.BookNotFoundException;
import com.mmcoe.service.BookService;

import com.mmcoe.pojo.Book;
import com.mmcoe.dao.BookDaoCollectionImpl;
import com.mmcoe.dao.BookDao;
import com.mmcoe.service.BookServiceImpl;

public class TestBookService {

	public static void main(String[] args) {
		BookDao dao = new BookDaoCollectionImpl();
		BookService service = new BookServiceImpl(dao);
		
		service.save(new Book (11,"Alchemist","Paulo",250));
		service.save(new Book (12,"SITP","Jenny Han",210));
		service.save(new Book (11,"Atomic Habits","James Clear",150));

		for (Book b : service.list())
			System.out.println(b);
		
		try {
			System.out.println(service.find(12));
		}catch (BookNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
		for (Book b : service.findByPrice(200, 300))
			System.out.println(b);
		
		try {
			service.delete(15);
			
		}catch (BookNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
