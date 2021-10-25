package com.lavesh.DBimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.lavesh.DBInterface.DBInterface;


public class H2DBimpl implements DBInterface {

	Connection con = null;
	Statement st = null;
	@Override
	public void loadDriver() throws Exception {
		Class.forName("org.h2.Driver");
	}

	@Override
	public Connection getConnection() throws Exception {
		
		//jdbc:h2:tcp://<server>[:<port>]/[<path>]<databaseName>
		con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");
		return con;
	}

	@Override
	public Statement getStatement() throws Exception {
		st = con.createStatement();
		return st;
	}

}
