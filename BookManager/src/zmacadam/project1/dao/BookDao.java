package zmacadam.project1.dao;


import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import zmacadam.project1.domain.Book;
import zmacadam.project1.tools.JDBCUtils;

public class BookDao {
	private QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());

	/*
	 * Delete a Book by ID
	 */
	public void deleteBook(String ISBN) {
		try {
			// Write SQL statement with placeholder
			String sql = "DELETE FROM Book WHERE ISBN=?";
			// Execute the SQL statement
			qr.update(sql, ISBN);
		} catch (SQLException ex) {
			System.out.println(ex);
			throw new RuntimeException("Delete Exception!");
		}
	}

	/*
	 * Edit the Book object that is passed in
	 */
	public void editBook(Book book) {
		try {
			// Write SQL statement with placeholder
			String sql = "UPDATE Book SET title=?,year=?,published_by=?,previous_edition=?, price=? WHERE ISBN=?";
			// Put the parameters from the Book object into an Array
			Object[] params = {book.getTitle(), book.getYear(), book.getPublished_By(), book.getPrevious_Edition(), book.getPrice(), book.getISBN()};
			// Execute the SQL statement with the given parameters
			qr.update(sql, params);
		} catch (SQLException ex) {
			System.out.println(ex);
			throw new RuntimeException("Edit Exception!");
		}
	}

	/*
	 * Add the Book object that is passed in
	 */
	public void addBook(Book book) {
		try {
			// Write SQL statement with placeholder
			String sql = "INSERT INTO Book (ISBN,title,year,published_by,previous_edition,price) VALUES(?,?,?,?,?,?)";
			// Put the parameters from the Book object into an Array
			Object[] params = {book.getISBN(), book.getTitle(), book.getYear(), book.getPublished_By(), book.getPrevious_Edition(), book.getPrice()};
			// Execute the SQL statement with the given parameters
			qr.update(sql, params);
		} catch (SQLException ex) {
			System.out.println(ex);
			throw new RuntimeException("Add Exception!");
		}
	}

	/*
	 * Select all Books from the Database
	 */
	public List<Book> selectAll() {
		try {
			// Write the SQL statement
			String sql = "SELECT * FROM Book";
			// Execute the SQL statement
			List<Book> list = qr.query(sql, new BeanListHandler<>(Book.class));
			// Return the list of Books selected
			return list;
		} catch (SQLException ex) {
			System.out.println(ex);
			throw new RuntimeException("Select All Exception!");
		}
	}

	public List<Book> selectTitle(String title) {
		try {
			// Write the SQL statement with placeholder
			String sql = "SELECT * FROM Book WHERE title=?";
			// Execute the SQL statement with the given parameters and return selected Books
			return qr.query(sql, new BeanListHandler<>(Book.class), title);
		} catch (SQLException ex) {
			System.out.println(ex);
			throw new RuntimeException("Select Exception!");
		}
	}

	public List<Book> selectPublishedBy(String publishedBy) {
		try {
			// Write the SQL statement with placeholder
			String sql = "SELECT * FROM Book WHERE published_by=?";
			// Execute the SQL statement with the given parameters and return selected Books
			return qr.query(sql, new BeanListHandler<>(Book.class), publishedBy);
		} catch (SQLException ex) {
			System.out.println(ex);
			throw new RuntimeException("Select Exception!");
		}
	}

	public List<Book> selectPrice(double low, double high) {
		try {
			// Write the SQL statement with placeholders
			String sql = "SELECT * FROM Book WHERE price BETWEEN ? AND ?";
			// Put the two parameters in an array
			Object[] params = {low, high};
			// Execute the SQL statement with the given parameters and return selected Books
			return qr.query(sql, new BeanListHandler<>(Book.class), params);
		} catch (SQLException ex) {
			System.out.println(ex);
			throw new RuntimeException("Select Exception!");
		}
	}

	public List<Book> selectYear(int year) {
		try {
			// Write the SQL statement with placeholder
			String sql = "SELECT * FROM Book WHERE year=?";
			// Execute the SQL statement with the given parameters and return selected Books
			return qr.query(sql, new BeanListHandler<>(Book.class), year);
		} catch (SQLException ex) {
			System.out.println(ex);
			throw new RuntimeException("Select Exception!");
		}
	}

	public List<Book> selectISBN(String ISBN) {
		try {
			// Write the SQL statement with placeholder
			String sql = "SELECT * FROM Book WHERE ISBN=?";
			// Execute the SQL statement with the given parameters and return selected Books
			return qr.query(sql, new BeanListHandler<>(Book.class), ISBN);
		} catch (SQLException ex) {
			System.out.println(ex);
			throw new RuntimeException("Select Exception!");
		}
	}

	public List<Book> selectTitlePublisher(String title, String publisher) {
		try {
			// Write the SQL statement with placeholders
			String sql = "SELECT * FROM Book WHERE title=? AND published_by=?";
			// Put the two parameters in an array
			Object[] params = {title, publisher};
			// Execute the SQL statement with the given parameters and return selected Books
			return qr.query(sql, new BeanListHandler<>(Book.class), params);
		} catch (SQLException ex) {
			System.out.println(ex);
			throw new RuntimeException("Select Exception!");
		}
	}

}
