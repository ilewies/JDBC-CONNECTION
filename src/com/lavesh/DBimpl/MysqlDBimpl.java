package com.lavesh.DBimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.lavesh.DBInterface.DBInterface;

public class MysqlDBimpl implements DBInterface {
	private Connection con=null;
	private Statement st = null;
	@Override
	public void loadDriver() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");

	}

	@Override
	public Connection getConnection() throws Exception {

		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test123","root","");
		return con;
	}

	@Override
	public Statement getStatement() throws Exception {
		 st = con.createStatement();
		return st;
	}

}
