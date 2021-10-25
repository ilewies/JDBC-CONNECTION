package com.lavesh.DBFactory;

import java.sql.Connection;
import java.sql.Statement;

import com.lavesh.DBInterface.DBInterface;
import com.lavesh.DBimpl.MysqlDBimpl;

public class MysqlDBFactory {
	public static DBInterface dbmysql = new MysqlDBimpl();

	public static void loadMysqlDBDriver() throws Exception {
		dbmysql.loadDriver();
	}

	public static Connection getMysqlDBConnection() throws Exception {
		return dbmysql.getConnection();
	}

	public static Statement getOracleDBStatement() throws Exception {
		return dbmysql.getStatement();
	}

}
