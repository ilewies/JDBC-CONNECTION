package com.lavesh.DBFactory;

import java.sql.Connection;
import java.sql.Statement;

import com.lavesh.DBInterface.DBInterface;
import com.lavesh.DBimpl.PsqlDBimpl;

public class PsqlDBFactory {
	private static DBInterface dbpsql = new PsqlDBimpl();

	public static void loadPsqlDBDriver() throws Exception {
		dbpsql.loadDriver();
	}
	
	public static Connection getPsqlDBConnection() throws Exception {
		return dbpsql.getConnection();
	}
	
	public static Statement getPsqlDBStatement() throws Exception {
		return dbpsql.getStatement();
	}
}
