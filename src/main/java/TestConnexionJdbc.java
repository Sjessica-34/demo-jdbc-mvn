
import java.sql.Connection;
import java.sql.DriverManager;

public class TestConnexionJdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				String dburl = "jdbc:mariadb://127.0.0.1:3306/compta";
				String login = "root";
				String pwd = "Fer18rania*";

				try(Connection connection = DriverManager.getConnection(dburl, login, pwd)) {
					System.out.println(connection);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}

		}



