package zmacadam.project1.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import zmacadam.project1.domain.Publisher;
import zmacadam.project1.tools.JDBCUtils;

public class PublisherDao {
	private QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
	
	public void addPublisher(Publisher publisher) {
		try {
			// Write SQL statement with placeholders
			String sql = "INSERT INTO Publisher (name,phone,city) VALUES(?,?,?)";
			// Put the passed in parameters into an Array
			Object[] params = {publisher.getName(), publisher.getPhone(), publisher.getCity()};
			// Execute the SQL statement with the given parameters
			qr.update(sql, params);
		} catch (SQLException ex) {
			System.out.println(ex);
			throw new RuntimeException("Add Exception!");
		}
	}
}
