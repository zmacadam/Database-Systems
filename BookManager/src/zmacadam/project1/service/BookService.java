package zmacadam.project1.service;

import java.util.List;

import zmacadam.project1.dao.BookDao;
import zmacadam.project1.domain.Book;

public class BookService {
	private BookDao dao = new BookDao();
	/*
	 * Service passes the id of a Book instance to DAO to delete Book from Database
	 */
	public void deleteBook(String ISBN) {
		dao.deleteBook(ISBN);
	}
	
	/*
	 * Service passes the Book object to DAO to update the Book
	 */
	public void editBook(Book book) {
		dao.editBook(book);
	}
	
	/*
	 * Service passes the Book object to DAO to be added to the Database
	 */
	public void addBook(Book book) {
		dao.addBook(book);
	}

	
	/*
	 * Service invokes the DAO's selectAll method and returns the list of Books
	 */
	public List<Book> selectAll(){
		return dao.selectAll();
	}

	/*
	 * Service invokes the DAO's selectTitle method and returns the list of Books
	 */
	public List<Book> selectTitle(String title) {
		return dao.selectTitle(title);
	}

	/*
	 * Service invokes the DAO's selectPublishedBy method and returns the list of Books
	 */
	public List<Book> selectPublishedBy(String publishedBy) {
		return dao.selectPublishedBy(publishedBy);
	}

	/*
	 * Service invokes the DAO's selectPrice method and returns the list of Books
	 */
	public List<Book> selectPrice(double low, double high) {
		return dao.selectPrice(low, high);
	}

	/*
	 * Service invokes the DAO's selectYear method and returns the list of Books
	 */
	public List<Book> selectYear(int year) {
		return dao.selectYear(year);
	}

	/*
	 * Service invokes the DAO's selectISBN method and returns the list of Books
	 */
	public List<Book> selectISBN(String ISBN) {
		return dao.selectISBN(ISBN);
	}

	/*
	 * Service invokes the DAO's selectTitlePublisher method and returns the list of Books
	 */
	public List<Book> selectTitlePublisher(String title, String publisher) {
		return dao.selectTitlePublisher(title, publisher);
	}
	
}
