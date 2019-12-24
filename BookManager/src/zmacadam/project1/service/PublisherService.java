package zmacadam.project1.service;

import zmacadam.project1.dao.PublisherDao;
import zmacadam.project1.domain.Publisher;

public class PublisherService {
	private PublisherDao dao = new PublisherDao();

	/*
	 * Service passes the Publisher object to DAO to be added to the Database
	 */
	public void addPublisher(Publisher pub) {
		dao.addPublisher(pub);
	}
}
