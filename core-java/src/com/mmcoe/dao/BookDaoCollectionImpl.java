package com.mmcoe.dao;
import com.mmcoe.pojo.Book;
import java.util.Vector;

import java.util.List;


public class BookDaoCollectionImpl implements BookDao {
 
	private List<Book>books;
	
	
	public BookDaoCollectionImpl() {
		books= new Vector<Book> ();
	}
	
	@Override
	public boolean save(Book b) {
		// TODO Auto-generated method stub
		books.add(b);
		return true;
	}

	@Override
	public Book find(int isbn) {
        for (Book b : books)
        	if (b.getIsbn()==isbn)
        		return b;
        
		
		return null;
        		
	}

	@Override
	public List<Book> list() {
		// TODO Auto-generated method stub
		return books;
	}

	@Override
	public boolean delete(int isbn) {
		 Book b = find(isbn);
	        if(b != null) {
	            books.remove(b);
	            return true;
	        }
	        return false;
	}

	@Override
	public List<Book> findByPrice(double min, double max) {
	    List<Book> result = new Vector<Book>();
	    for(Book b : books) {
	        if(b.getPrice() >= min && b.getPrice() <= max)
	            result.add(b);
	    }
	    return result;
	}

}
