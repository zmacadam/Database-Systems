package zmacadam.tests;

import java.text.ParseException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import zmacadam.bootstrap.HibernateBootstrap;
import zmacadam.domain.Book;
import zmacadam.tools.HibernateUtils;

public class HibernateAPITest {

	@Test
	/**
	 * In this test case, we call the loadBookManagerData method in class
	 * HibernateBootstrap to populate the bookManager database. Then, we query this DB
	 * for a Book with PK equal to 9780073336
	 */
	public void testHibernate() {

		//Prepare the bookManager Data
		try {
			HibernateBootstrap.loadBookManagerData();
		} catch (ParseException e) {
			e.printStackTrace();
		}

		//Open a new session
		Session session = HibernateUtils.openSession();
		//Begin the transaction
		Transaction transaction = session.beginTransaction();

		Book book = session.get(Book.class, "9780073376");// session.get API is used to retrieve one record
		System.out.println(book);

		//Commit the transaction
		transaction.commit();
		//Close the session
		session.close();
	}
}
