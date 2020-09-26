package com.hsbc.app.impl;
import com.hsbc.app.entity.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.hsbc.app.dao.EmpNFException;
import com.hsbc.app.dao.DuplicateEmpException;
import com.hsbc.app.dao.EmpDao;
import com.hsbc.app.dao.EmpNFException;
import com.hsbc.app.entity.Emp;

public class EmpDaoJdbcImpl implements com.hsbc.app.dao.EmpDao {

	@Override
	public com.hsbc.app.entity.Emp findById(int id) throws EmpNFException {
		Emp e = null;
		Connection conn = null;
		try {
			conn = getConnection();
			PreparedStatement pst = conn.prepareStatement("select * from emp where empno=?");
			pst.setInt(1, id);

			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				e = new Emp(rs.getInt("EMPNO"), rs.getString("NAME"), rs.getString("CITY"), rs.getDouble("SALARY"));
			} else {
				throw new EmpNFException();
			}

			return e;

		} catch (SQLException ex) {
			// ex.printStackTrace();
			throw new RuntimeException(ex);
		} catch (EmpNFException e2) {
			throw e2;
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e3) {
				e3.printStackTrace();
			}
		}
		// return e;
	}

	@Override
	public List<Emp> listAll() {
		Connection conn = null;
		List<Emp> empList = new ArrayList<Emp>();
		try {
			conn = getConnection();
			PreparedStatement pst = conn.prepareStatement("select * from emp");

			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				empList.add(new Emp(rs.getInt("EMPNO"), rs.getString("NAME"), rs.getString("CITY"),
						rs.getDouble("SALARY")));
			}

			return empList;

		} catch (SQLException ex) {
			// ex.printStackTrace();
			throw new RuntimeException(ex);

		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e3) {
				e3.printStackTrace();
			}
		}
	}

	@Override
	public String save(Emp e) throws DuplicateEmpException {
		Connection conn = null;
		try {
			
			try {
				Emp emp = findById(e.getId());

			} catch (EmpNFException e2) {
				conn = getConnection();
				PreparedStatement pst = conn
						.prepareStatement("insert into emp(empno,name,city,salary) values(?,?,?,?)");

				pst.setInt(1, e.getId());
				pst.setString(2, e.getName());
				pst.setString(3, e.getCity());
				pst.setDouble(4, e.getSal());

				int rowCount = pst.executeUpdate();

				return "Emp Saved Successfully";
			}
			throw new DuplicateEmpException();

		} catch (SQLException ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		} catch (DuplicateEmpException ex) {
			throw new RuntimeException("Emp already Exists in DB");
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e3) {
				e3.printStackTrace();
			}
		}
	}

	@Override
	public Emp updateName(int id, String name) throws EmpNFException {
		// TODO Auto-generated method stub
		return null;
	}

	private Connection getConnection() throws SQLException {
		Connection conn = null;

		try {
			Class.forName("org.apache.derby.jdbc.ClientDriver");

			conn = DriverManager.getConnection("jdbc:derby://localhost:1527/demodb");

		} catch (ClassNotFoundException e) {
			System.out.println("Driver could not be Found..");

		} catch (SQLException ex) {
			System.out.println("Exception : " + ex);
			ex.printStackTrace();
			throw ex;
		}

		return conn;

	}
}