package com.lavesh.DBInterface;

import java.sql.Connection;
import java.sql.Statement;

public interface DBInterface {
	
	public void loadDriver() throws Exception;
	public Connection getConnection() throws Exception;
	public Statement getStatement() throws Exception;
}
