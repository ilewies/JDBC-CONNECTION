package RandD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.h2.Driver;
public class Test {

	public static void main(String[] args) throws Exception {

//		Class.forName("org.h2.Driver");
//		Connection con = DriverManager.getConnection("jdbc:h2:tcp://localhost:9092/~/test", "sa", "");
//		Statement st = con.createStatement();
//		boolean b = st.execute("insert into user values(1,'susu')");
//		System.out.println(b);
		
		
		Class.forName("org.postgresql.Driver");
		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/abc123", "postgres", "postgres");
		Statement st = con.createStatement();
		boolean b = st.execute("insert into lavesh values(65,'laila')");
		System.out.println("value: "+b);
	}

}
