package zmacadam.project1.controller;

import zmacadam.project1.domain.Publisher;
import zmacadam.project1.service.PublisherService;

public class PublisherController {
	private PublisherService service = new PublisherService();
	
	/*
	 * Controller passes a Publisher object to be added to the Database
	 */
	public void addPublisher(Publisher pub) {
		service.addPublisher(pub);
	}

}
