package zmacadam.bootstrap;

import java.text.ParseException;

import org.hibernate.Session;
import org.hibernate.Transaction;

import zmacadam.domain.Book;
import zmacadam.domain.Editor;
import zmacadam.domain.Author;
import zmacadam.domain.Publisher;
import zmacadam.tools.HibernateUtils;

public class HibernateBootstrapWithCascading {

	public static void loadBookManagerData() throws ParseException {
		Session session = HibernateUtils.openSession();
		Transaction transaction = session.beginTransaction();

		//Begin by creating the Publisher's because Publisher has no FK
		//Create a new Publisher object and set the attributes
		Publisher p1 = new Publisher();
		p1.setName("McGraw Hill");
		p1.setPhone("8175689542");
		p1.setCity("Fort Worth");
		//Create a new Publisher object and set the attributes
		Publisher p2 = new Publisher();
		p2.setName("Pearson");
		p2.setPhone("8175689666");
		p2.setCity("OKC");
		//Create a new Publisher object and set the attributes
		Publisher p3 = new Publisher();
		p3.setName("Addison Wesley");
		p3.setPhone("817568978");
		p3.setCity("Dallas");
		//Create a new Publisher object and set the attributes
		Publisher p4 = new Publisher();
		p4.setName("O Reiley");
		p4.setPhone("8885961258");
		p4.setCity("Chicago");
		//Create a new Publisher object and set the attributes
		Publisher p5 = new Publisher();
		p5.setName("Oxford Press");
		p5.setPhone("123456789");
		p5.setCity("London");
		//Create a new Publisher object and set the attributes
		Publisher p6 = new Publisher();
		p6.setName("ABC");
		p6.setPhone("123456789");
		p6.setCity("Wichita Falls");
		//Create a new Publisher object and set the attributes
		Publisher p7 = new Publisher();
		p7.setName("Springer");
		p7.setPhone("9852365");
		p7.setCity("New York");
		
		//Create a new Book and set the attributes
		Book b1 = new Book();
		b1.setISBN("9780073376");
		b1.setTitle("OO Software Engineering");
		b1.setYear(2014);
		b1.setPrice(102.5);
		//This statement adds a Book to a Publisher's Book list and adds a Publisher
				//to the Book's Publisher attribute, it is bidirectional
		p1.addBook(b1);
		
		//Create a new Book and set the attributes
		Book b2 = new Book();
		b2.setISBN("0806666666");
		b2.setTitle("Fundamentals of DB 1");
		b2.setYear(1992);
		b2.setPrice(82.5);
		//This statement adds a Book to a Publisher's Book list and adds a Publisher
				//to the Book's Publisher attribute, it is bidirectional
		p6.addBook(b2);
		
		//Create a new Book and set the attributes
		Book b3 = new Book();
		b3.setISBN("0805317481");
		b3.setTitle("Fundamentals of DB 2");
		b3.setYear(1994);
		b3.setPrice(87.5);
		//This statement adds a Book to a Publisher's Book list and adds a Publisher
				//to the Book's Publisher attribute, it is bidirectional
		p6.addBook(b3);
		
		//Create a new Book and set the attributes
		Book b4 = new Book();
		b4.setISBN("0805317554");
		b4.setTitle("Fundamentals of DB 3");
		b4.setYear(1999);
		b4.setPrice(12.5);
		//This statement adds a Book to a Publisher's Book list and adds a Publisher
				//to the Book's Publisher attribute, it is bidirectional
		p6.addBook(b4);
		
		//Create a new Book and set the attributes
		Book b5 = new Book();
		b5.setISBN("0321122267");
		b5.setTitle("Fundamentals of DB 4");
		b5.setYear(2003);
		b5.setPrice(15.5);
		//This statement adds a Book to a Publisher's Book list and adds a Publisher
				//to the Book's Publisher attribute, it is bidirectional
		p3.addBook(b5);

		//Create a new Book and set the attributes
		Book b6 = new Book();
		b6.setISBN("0321369572");
		b6.setTitle("Fundamentals of DB 5");
		b6.setYear(2008);
		b6.setPrice(162.5);
		//This statement adds a Book to a Publisher's Book list and adds a Publisher
				//to the Book's Publisher attribute, it is bidirectional
		p3.addBook(b6);

		//Create a new Book and set the attributes
		Book b7 = new Book();
		b7.setISBN("0136086209");
		b7.setTitle("Fundamentals of DB 6");
		b7.setYear(2009);
		b7.setPrice(172.5);
		//This statement adds a Book to a Publisher's Book list and adds a Publisher
				//to the Book's Publisher attribute, it is bidirectional
		p2.addBook(b7);

		//Create a new Book and set the attributes
		Book b8 = new Book();
		b8.setISBN("0133970779");
		b8.setTitle("Fundamentals of DB 7");
		b8.setYear(2015);
		b8.setPrice(98.3);
		//This statement adds a Book to a Publisher's Book list and adds a Publisher
				//to the Book's Publisher attribute, it is bidirectional
		p2.addBook(b8);

		//Create a new Book and set the attributes
		Book b9 = new Book();
		b9.setISBN("0806666611");
		b9.setTitle("Software Requirements");
		b9.setYear(2013);
		b9.setPrice(99.5);
		//This statement adds a Book to a Publisher's Book list and adds a Publisher
				//to the Book's Publisher attribute, it is bidirectional
		p7.addBook(b9);

		//Create a new Book and set the attributes
		Book b10 = new Book();
		b10.setISBN("0806666612");
		b10.setTitle("UML Modeling");
		b10.setYear(2000);
		b10.setPrice(89.5);
		//This statement adds a Book to a Publisher's Book list and adds a Publisher
				//to the Book's Publisher attribute, it is bidirectional
		p4.addBook(b10);

		//Create a new Book and set the attributes
		Book b11 = new Book();
		b11.setISBN("0806666614");
		b11.setTitle("Machine Learning 1");
		b11.setYear(2000);
		b11.setPrice(109.5);
		//This statement adds a Book to a Publisher's Book list and adds a Publisher
				//to the Book's Publisher attribute, it is bidirectional
		p3.addBook(b11);

		//Create a new Book and set the attributes
		Book b12 = new Book();
		b12.setISBN("0806666613");
		b12.setTitle("Machine Learning 2");
		b12.setYear(2008);
		b12.setPrice(109.5);
		//This statement adds a Book to a Publisher's Book list and adds a Publisher
				//to the Book's Publisher attribute, it is bidirectional
		p3.addBook(b12);

		//Create a new Book and set the attributes
		Book b13 = new Book();
		b13.setISBN("0806666620");
		b13.setTitle("Big Bang Theory");
		b13.setYear(1975);
		b13.setPrice(19.5);
		//This statement adds a Book to a Publisher's Book list and adds a Publisher
				//to the Book's Publisher attribute, it is bidirectional
		p5.addBook(b13);

		//Create a new Book and set the attributes
		Book b14 = new Book();
		b14.setISBN("0806666622");
		b14.setTitle("Java Programming");
		b14.setYear(2008);
		b14.setPrice(59.5);
		//This statement adds a Book to a Publisher's Book list and adds a Publisher
				//to the Book's Publisher attribute, it is bidirectional
		p2.addBook(b14);
		
		//Create a new Author by passing in the attributes to the constructor
		Author a1 = new Author("123456789",  "John",  "Smith", 20000.5,  "address 1");
		//These lines adds an Author to the Book's Author list and adds a Book
				//to the Author's Book list to create the table Writes, it is bidirectional
		b1.addAuthor(a1);
		b8.addAuthor(a1);
		b7.addAuthor(a1);
		b14.addAuthor(a1);
		//Create a new Author by passing in the attributes to the constructor
		Author a2 = new Author("987654321",  "Harry",  "Potter", 25000.5,  "address 2");
		//These lines adds an Author to the Book's Author list and adds a Book
				//to the Author's Book list to create the table Writes, it is bidirectional
		b6.addAuthor(a2);
		b14.addAuthor(a2);
		//Create a new Author by passing in the attributes to the constructor
		Author a3 = new Author("333444555",  "Josh",  "Doe", 20400.5,  "address 3");
		//These lines adds an Author to the Book's Author list and adds a Book
				//to the Author's Book list to create the table Writes, it is bidirectional
		b5.addAuthor(a3);
		b4.addAuthor(a3);
		//Create a new Author by passing in the attributes to the constructor
		Author a4 = new Author("555666888",  "Ian",  "Goodfellow", 70000.5,  "address 4");
		//These lines adds an Author to the Book's Author list and adds a Book
				//to the Author's Book list to create the table Writes, it is bidirectional
		b3.addAuthor(a4);
		b2.addAuthor(a4);
		b5.addAuthor(a4);
		//Create a new Author by passing in the attributes to the constructor
		Author a5 = new Author("999111555",  "Andrew",  "Ng", 90000.5,  "address 5");
		//These lines adds an Author to the Book's Author list and adds a Book
				//to the Author's Book list to create the table Writes, it is bidirectional
		b9.addAuthor(a5);
		b10.addAuthor(a5);
		b12.addAuthor(a5);
		b5.addAuthor(a5);
		//Create a new Author by passing in the attributes to the constructor
		Author a6 = new Author("222333111",  "Peter",  "Doe", 80000.5,  "address 6");
		//These lines adds an Author to the Book's Author list and adds a Book
				//to the Author's Book list to create the table Writes, it is bidirectional
		b11.addAuthor(a6);
		b14.addAuthor(a6);
		b4.addAuthor(a6);
		//Create a new Author by passing in the attributes to the constructor
		Author a7 = new Author("654987321",  "Tom",  "Chandler", 60000.5,  "address 7");
		//These lines adds an Author to the Book's Author list and adds a Book
				//to the Author's Book list to create the table Writes, it is bidirectional
		b13.addAuthor(a7);
		b14.addAuthor(a7);
		b5.addAuthor(a7);
		
		//Set the Previous Edition Relation of all books
		b1.setPrevious_edition(null);
		b2.setPrevious_edition(null);
		b3.setPrevious_edition(b2);
		b4.setPrevious_edition(b3);
		b5.setPrevious_edition(b4);
		b6.setPrevious_edition(b5);
		b7.setPrevious_edition(b6);
		b8.setPrevious_edition(b7);
		b9.setPrevious_edition(null);
		b10.setPrevious_edition(null);
		b11.setPrevious_edition(null);
		b12.setPrevious_edition(b11);
		b13.setPrevious_edition(null);
		b14.setPrevious_edition(null);
		
		//Create a new Editor by passing in the attributes to the constructor
		Editor e1 = new Editor("913746825",  "Ming",  "Yao", 52369.5,  "address 11", 8);
		//This statement adds an Editor to the Publisher's Editor List and adds a
				//Publisher to the Editor's works_for attribute, it is bidirectional
		p1.addEditor(e1);
		
		//Create a new Editor by passing in the attributes to the constructor
		Editor e2 = new Editor("520898745",  "Tim",  "Duncan", 52369.5,  "address 11", 9);
		//This statement adds an Editor to the Publisher's Editor List and adds a
				//Publisher to the Editor's works_for attribute, it is bidirectional
		p3.addEditor(e2);
		
		//Create a new Editor by passing in the attributes to the constructor
		Editor e3 = new Editor("313164649",  "Allen",  "Iverson", 59369.5,  "address 11", 0);
		//This statement adds an Editor to the Publisher's Editor List and adds a
				//Publisher to the Editor's works_for attribute, it is bidirectional
		p2.addEditor(e3);
		
		//Create a new Editor by passing in the attributes to the constructor
		Editor e4 = new Editor("198503719",  "Ray",  "Allen", 52369.5,  "address 11", 1);
		//This statement adds an Editor to the Publisher's Editor List and adds a
				//Publisher to the Editor's works_for attribute, it is bidirectional
		p6.addEditor(e4);
		
		//Create a new Editor by passing in the attributes to the constructor
		Editor e5 = new Editor("333366996",  "Kobe",  "Bryant", 52369.5,  "address 11", 5);
		//This statement adds an Editor to the Publisher's Editor List and adds a
				//Publisher to the Editor's works_for attribute, it is bidirectional
		p5.addEditor(e5);
		
		//Create a new Editor by passing in the attributes to the constructor
		Editor e6 = new Editor("123456789",  "John",  "Smith", 3000.0,  "address 1", 1);
		//This statement adds an Editor to the Publisher's Editor List and adds a
				//Publisher to the Editor's works_for attribute, it is bidirectional
		p1.addEditor(e6);
		
		//Create a new Editor by passing in the attributes to the constructor
		Editor e7 = new Editor("987654321",  "Harry",  "Potter", 3000.0,  "address 2", 2);
		//This statement adds an Editor to the Publisher's Editor List and adds a
				//Publisher to the Editor's works_for attribute, it is bidirectional
		p4.addEditor(e7);
		
		//Create a new Editor by passing in the attributes to the constructor
		Editor e8 = new Editor("555666888",  "Ian",  "Goodfellow", 3000.0,  "address 4", 7);
		//This statement adds an Editor to the Publisher's Editor List and adds a
				//Publisher to the Editor's works_for attribute, it is bidirectional
		p7.addEditor(e8);
		
		//Create a new Editor by passing in the attributes to the constructor
		Editor e9 = new Editor("222333111",  "Peter",  "Doe", 3000.0,  "address 6", 3);
		//This statement adds an Editor to the Publisher's Editor List and adds a
				//Publisher to the Editor's works_for attribute, it is bidirectional
		p5.addEditor(e9);
		
		//Create a new Editor by passing in the attributes to the constructor
		Editor e10 = new Editor("999111555",  "Andrew",  "Ng", 3000.0,  "address 5", 5);
		//This statement adds an Editor to the Publisher's Editor List and adds a
				//Publisher to the Editor's works_for attribute, it is bidirectional
		p3.addEditor(e10);
	
		//This statement adds the Editor's to the Book Editor's List and adds a
		//The Book to the Editor's Books List to create the table Edits, it is bidirectional
		b1.addEditor(e8);
		b8.addEditor(e8);
		b7.addEditor(e8);		
		b6.addEditor(e10);
		b5.addEditor(e1);
		b4.addEditor(e2);
		b3.addEditor(e9);
		b2.addEditor(e7);
		b9.addEditor(e10);
		b10.addEditor(e3);
		b12.addEditor(e8);
		b11.addEditor(e6);
		b13.addEditor(e9);
		b14.addEditor(e10);
		b2.addEditor(e10);
		b2.addEditor(e9);
		b5.addEditor(e3);
		b8.addEditor(e10);
		
		//Persist all Publishers
		session.persist(p1);
		session.persist(p2);
		session.persist(p3);
		session.persist(p4);
		session.persist(p5);
		session.persist(p6);
		session.persist(p7);
		//Persist all Books
		session.persist(b1);
		session.persist(b2);
		session.persist(b3);
		session.persist(b4);
		session.persist(b5);
		session.persist(b6);
		session.persist(b7);
		session.persist(b8);
		session.persist(b9);
		session.persist(b10);
		session.persist(b11);
		session.persist(b12);
		session.persist(b13);
		session.persist(b14);
		
		transaction.commit();
		session.close();
	}

}
