package com.hsbc.tr.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectDemo {

	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement pst=null;
		String SELECT_SQL="select * from emp where empno=?";
		try {
			Class.forName("org.apache.derby.jdbc.ClientDriver");    //load driver
			conn=DriverManager.getConnection("jdbc:derby://localhost:1527/demodb");   //get connection
			if (conn!=null) {
				System.out.println("Connected to Database");
			}
			pst=conn.prepareStatement(SELECT_SQL);
			pst.setInt(1, 101);
			ResultSet rs=pst.executeQuery();
			
			while (rs.next()) {
				int id=rs.getInt(1);
				String name=rs.getString(2);
				String city=rs.getString(3);
				double sal=rs.getDouble(4);
				System.out.println(id+" "+name+" "+city+" "+sal);
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
