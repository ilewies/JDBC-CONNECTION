package com.lavesh.DBFactory;

import java.sql.Connection;
import java.sql.Statement;

import com.lavesh.DBInterface.DBInterface;
import com.lavesh.DBimpl.OracleDBimpl;

public class OracleDBFactory {
	public static DBInterface dbOracle = new OracleDBimpl();
	
	public static void loadOracleDBDriver() throws Exception {
		dbOracle.loadDriver();
	}
	
	public static Connection getOracleDBConnection() throws Exception {
		return dbOracle.getConnection();
	}
	
	public static Statement getOracleDBStatement() throws Exception {
		return dbOracle.getStatement();
	}

}
