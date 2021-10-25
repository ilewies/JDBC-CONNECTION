package RandD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.h2.Driver;
public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("org.h2.Driver");
		Connection con = DriverManager.getConnection("jdbc:h2:tcp://localhost:9092/~/test", "sa", "");
		Statement st = con.createStatement();
		boolean b = st.execute("insert into user values(1,'susu')");
		System.out.println(b);
		
	}

}
