package zmacadam.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

//@Entity will create a table in bookManager called Book
@Entity
public class Book {
	//Private Data Members, Attributes of the table Book
	@Id
	private String ISBN; //Primary Key
	private String title;
	private Double price;
	private Integer year;
	@OneToOne
	@PrimaryKeyJoinColumn
	private Book previous_edition; //Foreign Key
	@ManyToOne
	@JoinColumn(name="published_by")
	private Publisher publisher; //Foreign Key
	@ManyToMany(mappedBy = "books", cascade = CascadeType.PERSIST)
	private List<Editor> editors = new ArrayList<>(); //Used to create Edits Table
	@ManyToMany(mappedBy = "books", cascade = CascadeType.PERSIST)
	private List<Author> authors = new ArrayList<>(); //Used to create Writes Table
	
	//Default Constructor
	public Book() {
		super();
	}
	//Add Editor to Editors List and add the Book to the Editor
	public void addEditor(Editor e) {
		this.editors.add(e);
		e.getBooks().add(this);
	}
	//Remove Editor from the Editors List and remove the Book from the Editor
	public void removeEditor(Editor e) {
		this.editors.remove(e);
		e.getBooks().remove(this);
	}
	//Add Author to Authors List and add the Book to the Author
	public void addAuthor(Author a) {
		this.authors.add(a);
		a.getBooks().add(this);
	}
	//Remove Author from the Authors List and remove the Book from the Author
	public void removeAuthor(Author a) {
		this.authors.add(a);
		a.getBooks().remove(this);
	}
	
	//Getters and Setters for Private Data Members
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public Book getPrevious_edition() {
		return previous_edition;
	}
	public void setPrevious_edition(Book previous_edition) {
		this.previous_edition = previous_edition;
	}
	public Publisher getPublisher() {
		return publisher;
	}
	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
	public List<Editor> getEditors() {
		return editors;
	}
	public void setEditors(List<Editor> editors) {
		this.editors = editors;
	}
	public List<Author> getAuthors() {
		return authors;
	}
	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}
}
