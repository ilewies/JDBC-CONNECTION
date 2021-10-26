package com.lavesh.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import com.lavesh.DBFactory.PsqlDBFactory;

public class PsqlDB {

	public static void getPsqlDB() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;

		try {
			PsqlDBFactory.loadPsqlDBDriver();
			con = PsqlDBFactory.getPsqlDBConnection();
			st = PsqlDBFactory.getPsqlDBStatement();

			System.out.println("Enter Query: ");
			String q = br.readLine();
			boolean b = st.execute(q);
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
