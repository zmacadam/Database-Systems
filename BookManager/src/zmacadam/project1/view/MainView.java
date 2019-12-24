package zmacadam.project1.view;
/*

 */

import java.util.List;
import java.util.Scanner;

import zmacadam.project1.controller.BookController;
import zmacadam.project1.controller.PublisherController;
import zmacadam.project1.domain.Book;
import zmacadam.project1.domain.Publisher;

public class MainView {
	//MainView holds an instance of both the BookController and PublisherController
	private BookController bController = new BookController();
	private PublisherController pController = new PublisherController();

	/*
	 * The control flow in run() is 
	 * 1.print the menu 
	 * 2.get the input from user
	 * 3.call the corresponding method to update or query the database 
	 * 4.print results to user 
	 * 5.go back to step 1 until the input is exit.
	 */
	public void run() {
 
		// Use a scanner to receive all of the user's input
		Scanner sc = new Scanner(System.in);
		while (true) {
			// Print the menu and wait for user input to proc a method
			System.out.println("----------------------------------Book Manager Software---------------------------------");
			System.out.println("1. Add a Publisher 2. Add a Book 3. Edit a Book 4. Delete a Book 5. Search Books 6. Exit");
			System.out.println("Please select the function, type [1-6] and press enter:");
			int choose = sc.nextInt();

			switch (choose) {
			case 1:
				addPublisher();
				break;
			case 2:
				addBook();
				break;
			case 3:
				editBook();
				break;
			case 4:
				deleteBook();
				break;
			case 5:
				selectBook();
				break;
			case 6:
				System.exit(0);
				break;
			}
		}
	}

	// Add a Publisher to the Database with the user's input
	public void addPublisher() {
		System.out.println("Please enter the following information:");
		// Use a scanner to receive all of the user's input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of the Publisher:");
		String name = sc.nextLine();
		System.out.println("Enter phone of the Publisher:");
		String phone = sc.nextLine();
		System.out.println("Enter city of the Publisher:");
		String city = sc.nextLine();
		// Create a Publisher instance to hold the collected data
		Publisher pub = new Publisher(name, phone, city);
		// Pass the Publisher object pub to controller
		pController.addPublisher(pub);
		System.out.println("Publisher Added Successfully!");
		 
	}
	
	// Add a Book to the Database with the user's input
	public void addBook() {
		System.out.println("Please enter the following information:");
		// Use a scanner to receive all of the user's input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ISBN of the Book:");
		String ISBN = sc.nextLine();
		System.out.println("Enter title of the Book:");
		String title = sc.nextLine();
		System.out.println("Enter year of the Book:");
		int year = Integer.parseInt(sc.nextLine());
		System.out.println("Enter publisher of the Book:");
		String publishedBy = sc.nextLine();
		if (publishedBy.length() == 0) {
			publishedBy = null;
		}
		System.out.println("Enter previous edition of the Book");
		String previousEdition = sc.nextLine();
		if (previousEdition.length() == 0) {
			previousEdition = null;
		}
		System.out.println("Enter price of the Book:");
		double price = Double.parseDouble(sc.nextLine());
		// Create a Book instance to hold the collected data
		Book book = new Book(ISBN, title, year, publishedBy, previousEdition, price);
		// Pass the Book object book to controller
		bController.addBook(book);
		System.out.println("Book Added Successfully!");
		 
	}
	
	// Edit a Book existing in the Database with the user's new input
	public void editBook() {
		// Display all possible books to edit to the user
		selectAll();
		System.out.println("Which Book do you want to edit? (Identified by ISBN)");
		// Use a scanner to receive all of the user's input
		Scanner sc = new Scanner(System.in);
		String ISBN = sc.nextLine();
		System.out.println("Enter new title:");
		String title = sc.nextLine();
		System.out.println("Enter new year:");
		int year= Integer.parseInt(sc.nextLine());
		System.out.println("Enter new publisher:");
		String publishedBy = sc.nextLine();
		if (publishedBy.length() == 0) {
			publishedBy = null;
		}
		System.out.println("Enter new previous edition:");
		String previousEdition = sc.nextLine();
		if (previousEdition.length() == 0) {
			previousEdition = null;
		}
		System.out.println("Enter new price:");
		double price = Double.parseDouble(sc.nextLine());
		// Create a Book instance to encapsulate all the data above
		Book book = new Book(ISBN, title, year, publishedBy, previousEdition, price);
		// Pass the Book object book to controller
		bController.editBook(book);
		System.out.println("Edit Successfully!");
		 
	}
	/*
	 * 
	 */
	public void selectBook() {
		System.out.println("1. Search All Books 2. Search Books Based on Criteria");
		// Use a scanner to receive all of the user's input
		Scanner sc = new Scanner(System.in);
		int selectChooser = sc.nextInt();
		switch (selectChooser) {
		case 1:
			// Select all books from the Database
			selectAll();
			break;
		case 2:
			// Select Books based on certain criteria
			select();
			break;
		}
	}

	/*
	 * 
	 */
	public void selectAll() {
		// Call BookController's selectAll method
		List<Book> list = bController.selectAll();
		if (list.size() != 0)
			print(list);
		else
			System.out.println("No Book is found!");
	}

	/*
	 * 
	 */
	public void select() {
		System.out.println("Search By: 1. Title 2. ISBN 3. Publisher 4. Price range 5. Year 6. Title and Publisher");
		// Use a scanner to receive all of the user's input
		Scanner sc = new Scanner(System.in);
		int selectChooser = sc.nextInt();
		switch (selectChooser) {
		case 1:
			// Select Books based on Title
			selectTitle();
			break;
		case 2:
			// Select Books based on ISBN
			selectISBN();
			break;
		case 3:
			// Select Books based on Publisher
			selectPublishedBy();
			break;
		case 4:
			// Select Books based on Price Range
			selectPriceRange();
			break;
		case 5:
			// Select Books based on Year
			selectYear();
			break;
		case 6:
			// Select Books on both Title and Publisher
			selectTitlePublisher();
			break;
		}
		 
	}
	private void selectTitlePublisher() {
		// Use a scanner to receive all of the user's input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter title:");
		String title = sc.nextLine();
		System.out.print("Enter publisher:");
		String publisher = sc.nextLine();
		// Call BookControllers select method passing the given Title and Publisher
		List<Book> list = bController.selectTitlePublisher(title, publisher);
		if (list.size() != 0)
			print(list);
		else
			System.out.println("No Book is found with specified title and publisher!");	
		 
	}

	private void selectYear() {
		// Use a scanner to receive all of the user's input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter year:");
		int year = Integer.parseInt(sc.nextLine());
		// Call BookControllers select method passing the given Year
		List<Book> list = bController.selectYear(year);
		if (list.size() != 0)
			print(list);
		else
			System.out.println("No Book is found in the specified year!");	
		 
	}

	private void selectPriceRange() {
		// Use a scanner to receive all of the user's input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter minimum price:");
		double low = Double.parseDouble(sc.nextLine());
		System.out.print("Enter maximum price:");
		double high = Double.parseDouble(sc.nextLine());
		// Call BookControllers select method passing the given Price Range
		List<Book> list = bController.selectPriceRange(low, high);
		if (list.size() != 0)
			print(list);
		else
			System.out.println("No Book is found within specified price range!");		
		 
	}

	private void selectPublishedBy() {
		// Use a scanner to receive all of the user's input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter publisher:");
		String publisher = sc.nextLine();
		// Call BookControllers select method passing the given Publisher
		List<Book> list = bController.selectPublishedBy(publisher);
		if (list.size() != 0)
			print(list);
		else
			System.out.println("No Book is found with specified publisher!");	
		 
	}

	private void selectISBN() {
		// Use a scanner to receive all of the user's input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter ISBN:");
		String ISBN = sc.nextLine();
		// Call BookControllers select method passing the given ISBN
		List<Book> list = bController.selectISBN(ISBN);
		if (list.size() != 0)
			print(list);
		else
			System.out.println("No Book is found with specified ISBN!");	
		 
	}

	private void selectTitle() {
		// Use a scanner to receive all of the user's input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter title:");
		String title = sc.nextLine();
		// Call BookControllers select method passing the given Title 
		List<Book> list = bController.selectTitle(title);
		if (list.size() != 0)
			print(list);
		else
			System.out.println("No Book is found with specified title!");	
		 
	}

	/*
	 */
	public void deleteBook() {
		// First, we display all existing books to user
		selectAll();
		System.out.println("Enter the ISBN of the Book you want to delete and press enter:");
		// Use a scanner to receive all of the user's input
		Scanner sc = new Scanner(System.in);
		String ISBN = sc.nextLine();
		// Pass the ID of the Book to be deleted
		bController.deleteBook(ISBN);
		System.out.println("Book has been deleted.");
		 
	}
	private void print(List<Book> list) {
		System.out.printf("%-25s %-35s%-15s%-15s%-30s%-10s%n", "ISBN", "Title", "Year", "Published By", "Previous Edition", "Price");
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
		// Iterate the list and print each item to console
		for (Book book : list) {
			System.out.printf("%-25s %-35s%-15s%-15s%-30s%-10s%n", book.getISBN(), book.getTitle(), book.getYear(), book.getPublished_By(),
					book.getPrevious_Edition(), book.getPrice());
		}
	}
}
