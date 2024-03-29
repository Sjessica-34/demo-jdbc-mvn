package fr.diginamic.jdbc.dao;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ConnectionBDD {

	private static final String URL;
	private static final String USER;
	private static final String PASSWORD;

	static {
		ResourceBundle fichier = ResourceBundle.getBundle("database");
		
		URL = fichier.getString("db.url");
		USER = fichier.getString("db.user");
		PASSWORD = fichier.getString("db.password");
		
	private ConnectionBDD() throws SQLEception {
		connection = DriveManager.getConnection(URL,USER,PASSWORD);
		}
	
	
	public static ConnectionBDD getInstance() throws SQLException {
		if (instance == null) {
			instance = new ConnectionBDD();
		}
		return instance;
	}}
}
