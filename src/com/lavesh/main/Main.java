package com.lavesh.main;

import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import com.lavesh.DBFactory.OracleDBFactory;

public class Main {

	public static void main(String[] args) throws Exception {

		//OracleDB.getOracleDB();
		MysqlDB.getMysqlDB();

	}



}
