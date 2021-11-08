package com.lavesh.main;

import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Scanner;

import com.lavesh.DBFactory.OracleDBFactory;

public class Main {

	public static void main(String[] args) throws Exception {
		System.out.println("...select database to connect...");
		System.out.println("***********************");
		System.out.println("1. Oracle db");
		System.out.println("2. Mysql db");
		System.out.println("3. H2 db");
		System.out.println("4. psql db");
		System.out.println("Any key for exit");
		System.out.println("***********************");

		Scanner scanner = new Scanner(System.in);
		int option = scanner.nextInt();

		switch (option) {
		case 1:
			System.out.println(" ***oracle db*** ");
			OracleDB.getOracleDB();
			break;
		case 2:
			System.out.println(" ***mysql*** ");
			MysqlDB.getMysqlDB();
			break;
			
		case 3:
			System.out.println(" ***h2 db*** ");
			H2DB.getH2DB();
			break;
			
		case 4:
			System.out.println(" ***psql db*** ");
			PsqlDB.getPsqlDB();
			break;
		default:
			System.out.println("...exited");
			
		}

	}

}
