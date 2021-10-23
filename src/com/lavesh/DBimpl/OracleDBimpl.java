package com.lavesh.DBimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.lavesh.DBInterface.DBInterface;

public class OracleDBimpl implements DBInterface {
	private Connection con = null;
	private Statement st = null;

	@Override
	public void loadDriver() throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
	}

	@Override
	public Connection getConnection() throws Exception {
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "durga");
		return con;
	}

	@Override
	public Statement getStatement() throws Exception {
		st=con.createStatement();
		return st;
	}

}
