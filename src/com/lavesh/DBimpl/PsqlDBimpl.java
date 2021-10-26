package com.lavesh.DBimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.lavesh.DBInterface.DBInterface;

public class PsqlDBimpl implements DBInterface {

	private Connection con = null;
	private Statement st = null;
	@Override
	public void loadDriver() throws Exception {
		Class.forName("org.postgresql.Driver");

	}

	@Override
	public Connection getConnection() throws Exception {
		con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/abc123", "postgres", "postgres");
		return con;
	}

	@Override
	public Statement getStatement() throws Exception {
		st = con.createStatement();
		return st;
	}

}
