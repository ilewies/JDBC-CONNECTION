package com.lavesh.DBFactory;

import java.sql.Connection;
import java.sql.Statement;

import com.lavesh.DBInterface.DBInterface;
import com.lavesh.DBimpl.MysqlDBimpl;

public class H2DBFactory {
	public static DBInterface dbh2sql = new MysqlDBimpl();
	public static void loadH2DBDriver() throws Exception {
		dbh2sql.loadDriver();
	}
	public static Connection getH2DBConnection() throws Exception {
		return dbh2sql.getConnection();
	}
	
	public static Statement getH2DBStatement() throws Exception {
		return dbh2sql.getStatement();
	}
	

}
