package com.lavesh.DBInterface;

import java.sql.Connection;
import java.sql.Statement;

public interface DBFactoryInterface {

	public void loadDBDriver() throws Exception;

	public Connection getPsqlDBConnection() throws Exception;

	public Statement getPsqlDBStatement() throws Exception;

}
