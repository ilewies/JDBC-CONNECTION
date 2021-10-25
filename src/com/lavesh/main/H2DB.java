package com.lavesh.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import com.lavesh.DBFactory.H2DBFactory;

public class H2DB {
	public static void getH2DB() throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			H2DBFactory.loadH2DBDriver();
			H2DBFactory.getH2DBConnection();
			H2DBFactory.getH2DBStatement();
			System.out.println("Enter Query: ");
			String q = br.readLine();
			boolean b = st.execute(q);
			System.out.println("value: "+b);
			//int updateColumn = st.getUpdateCount();
//			if (b) {
//				rs = st.getResultSet();
//				ResultSetMetaData rsmt = rs.getMetaData();
//
//				for (int i = 1; i < rsmt.getColumnCount(); i++) {
//					System.out.print(rsmt.getColumnName(i) + "\t");
//				}
//				System.out.println();
//				while (rs.next()) {
//					for (int i = 1; i < rsmt.getColumnCount(); i++) {
//						System.out.print(rs.getString(i) + "\t");
//					}
//					System.out.println();
//				}
//			} else {
//				System.out.println("NON SELECT QUERY EXECUTED " + updateColumn);
//			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
//			try {
//				con.close();
//				st.close();
//			} catch (Exception e2) {
//				e2.printStackTrace();
//			}
		}
	}

}
