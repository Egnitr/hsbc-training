package com.hsbc.tr.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertDemo {

	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement pst=null;
		String INSERT_SQL="insert into emp(empno,name,city,salary) values(?,?,?,?)";
		try {
			Class.forName("org.apache.derby.jdbc.ClientDriver");    //load driver
			conn=DriverManager.getConnection("jdbc:derby://localhost:1527/demodb");   //get connection
			if (conn!=null) {
				System.out.println("Connected to Database");
			}
			pst=conn.prepareStatement(INSERT_SQL);
			pst.setInt(1, 101);
			pst.setString(2, "Prateek");
			pst.setString(3, "Lko");
			pst.setDouble(4, 20000);
			
			if(pst.executeUpdate()==1) {
				System.out.println("New row inserted");
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}catch (SQLException ex) {
			System.out.println(ex);
		}finally {
			try {
				if (conn!=null) {
					conn.close();
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}

}
