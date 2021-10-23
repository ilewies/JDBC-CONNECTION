package com.lavesh.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import javax.xml.transform.Result;

import com.lavesh.DBFactory.OracleDBFactory;

public class Main {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;

		try {
			OracleDBFactory.loadOracleDBDriver();
			con = OracleDBFactory.getOracleDBConnection();
			st = OracleDBFactory.getOracleDBStatement();
			System.out.println("Enter Query: ");
			boolean b = st.execute(br.readLine());

			int updateColumn = st.getUpdateCount();
			if (b) {
				rs = st.getResultSet();
				ResultSetMetaData rsmt = rs.getMetaData();

				for (int i = 1; i < rsmt.getColumnCount(); i++) {
					System.out.print(rsmt.getColumnName(i) + "\t");
				}
				System.out.println();
				while (rs.next()) {
					for (int i = 1; i < rsmt.getColumnCount(); i++) {
						System.out.print(rs.getString(i) + "\t");
					}
					System.out.println();
				}
			} else {
				System.out.println("NON SELECT QUERY EXECUTED " + updateColumn);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
				st.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
