package zmacadam.project1.controller;

import java.util.List;

import zmacadam.project1.domain.Book;
import zmacadam.project1.service.BookService;

public class BookController {
	private BookService service = new BookService();
	 
	// Controller passes the id of Book to be deleted to the BookService
	public void deleteBook(String ISBN) {
		service.deleteBook(ISBN);
	}
	
	// Controller passes the book object to be edited to the BookService
	public void editBook(Book book) {
		service.editBook(book);
	}
	
	// Controller passes the book object to be added to the BookService
	public void addBook(Book book) {
		service.addBook(book);
	}
	
	/*
	* Controller passes the Title of books to select to BookService
	* The list of books found in the Database are returned to MainView
	*/
	public List<Book> selectTitle(String title){
		return service.selectTitle(title);
	}
	
	/*
	* Controller passes the Publisher of books to select to BookService
	* The list of books found in the Database are returned to MainView
	*/
	public List<Book> selectPublishedBy(String publishedBy){
		return service.selectPublishedBy(publishedBy);
	}
	
	/*
	* Controller passes the Price Range of books to select to BookService
	* The list of books found in the Database are returned to MainView
	*/
	public List<Book> selectPriceRange(double low, double high){
		return service.selectPrice(low, high);
	}
	
	/*
	* Controller passes the Year of books to select to BookService
	* The list of books found in the Database are returned to MainView
	*/
	public List<Book> selectYear(int year){
		return service.selectYear(year);
	}
	
	/*
	* Controller passes the Title and Publisher of books to select to BookService
	* The list of books found in the Database are returned to MainView
	*/
	public List<Book> selectTitlePublisher(String title, String publisher){
		return service.selectTitlePublisher(title, publisher);
	}

	/*
	* Controller passes the ISBN of books to select to BookService
	* The list of books found in the Database are returned to MainView
	*/
	public List<Book> selectISBN(String ISBN){
		return service.selectISBN(ISBN);
	}

	/*
	* Controller calls the SelectAll method in BookService
	* The list All books found in the Database are returned to MainView
	*/
	public List<Book> selectAll(){
		return service.selectAll();
	}

}
