package zmacadam.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

//@Entity will create a table called Publisher
@Entity
public class Publisher {
	//Private Data Members, Attributes of the table Publisher
	@Id
	private String name; //Primary Key
	private String phone;
	private String city;
	@OneToMany(mappedBy = "publisher", cascade = CascadeType.PERSIST)
	private List<Book> books = new ArrayList<>();
	@OneToMany(mappedBy = "publisher", cascade = CascadeType.PERSIST)
	private List<Editor> editors = new ArrayList<>();
	
	//Default Constructor
	public Publisher() {
		super();
	}
	
	//Add Book to Books List and add the Publisher to the Book
	public void addBook(Book b) {
		this.books.add(b);
		b.setPublisher(this);
	}
	//Remove Book from the Books List and remove the Publisher from the Book
	public void removeBook(Book b) {
		this.books.remove(b);
		b.setPublisher(null);
	}
	//Add Editor to Editor List and add the Publisher to the Editor
	public void addEditor(Editor e) {
		this.editors.remove(e);
		e.setPublisher(this);
	}
	//Remove Editor from Editor List and remove the Publisher from the Editor
	public void removeEditor(Editor e) {
		this.editors.remove(e);
		e.setPublisher(null);
	}
	
	//Getters and Setters for Private Data Members
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public List<Editor> getEditors() {
		return editors;
	}

	public void setEditors(List<Editor> editors) {
		this.editors = editors;
	}
	
	@Override
	public String toString() {
		return "Publisher [Name= " + name + ", Phone= " + phone + ", City= " + city + "]";
	}
	
}
