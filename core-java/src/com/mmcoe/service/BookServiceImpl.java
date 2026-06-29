package com.mmcoe.service;


import java.util.List;


import com.mmcoe.pojo.Book;
import com.mmcoe.dao.BookDaoCollectionImpl;
import com.mmcoe.dao.BookDao;
public class BookServiceImpl implements BookService {

	private BookDao dao;
//	public BookServiceImpl() {
//		
//		dao = new BookDaoCollectionImpl(); //tightly coupled
//		
//	}
	
	public BookServiceImpl(BookDao dao) { // dependency injection
		this.dao=dao;
	}
//	public void setDao(Book Dao) {
//		this.dao=dao;
//	}
	@Override
	public boolean save(Book b) {
		// TODO Auto-generated method stub
		return dao.save(b);
	}

	@Override
	public Book find(int isbn) throws BookNotFoundException {
		Book b= dao.find(isbn);
		if(b== null) 
			throw new BookNotFoundException("Book not found with ISBN"+ isbn);
		
		return b;
	}

	@Override
	public List<Book> list() {
		// TODO Auto-generated method stub
		return dao.list();
	}


	@Override
	public boolean delete(int isbn) throws BookNotFoundException {
	    if (dao.delete(isbn))
	        return true;
	    else
	        throw new BookNotFoundException("Book not found with ISBN " + isbn);
	}

	@Override
	public List<Book> findByPrice(double min, double max) {
		// TODO Auto-generated method stub
		return dao.findByPrice(min, max);
	}

}
