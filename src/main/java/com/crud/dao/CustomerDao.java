package com.crud.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.crud.Beans.Customers;
import com.crud.connection.CrudConnections;

public class CustomerDao {
	CrudConnections connection = new CrudConnections();

	public boolean insertCustomers(Customers customers) {
		String sql = "insert into user(name, address, email, username, password, confirmpassword) value(?,?,?,?,?,?)";

		try {
			PreparedStatement stmt = connection.getCon().prepareStatement(sql);
			stmt.setString(1, customers.getName());
			stmt.setString(2, customers.getAddress());
			stmt.setString(3, customers.getEmail());
			stmt.setString(4, customers.getUsername());
			stmt.setString(5, customers.getPassword());
			stmt.setString(6, customers.getConfirmpassword());
			stmt.executeUpdate();

			connection.getCon().close();
			System.out.println("5");
		} catch (Exception e) {

			e.printStackTrace();
		}
		return false;

	}

	public List<Customers> getAllUser() {
		List<Customers> list = new ArrayList<Customers>();
		String sql = "select * from user";
		try {
			PreparedStatement statement = connection.getCon().prepareStatement(sql);
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				Customers cust = new Customers();
				cust.setId(rs.getInt(1));
				cust.setName(rs.getString(2));
				cust.setAddress(rs.getString(3));
				cust.setEmail(rs.getString(4));
				cust.setUsername(rs.getString(5));
				cust.setPassword(rs.getString(6));
				cust.setConfirmpassword(rs.getString(7));
				list.add(cust);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;

	}

	public int updateUser(Customers customer) {

		int status = 0;
		String sql = "update user set name=?, address=?, email=?, username=?, password=?, confirmpassword=? where id=?";
		try {
			PreparedStatement statement = connection.getCon().prepareStatement(sql);
			statement.setString(1, customer.getName());
			statement.setString(2, customer.getAddress());
			statement.setString(3, customer.getEmail());
			statement.setString(4, customer.getUsername());
			statement.setString(5, customer.getPassword());
			statement.setString(6, customer.getConfirmpassword());
			statement.setInt(7, customer.getId());

			status = statement.executeUpdate();

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return status;
	}

	public int deleteCustomer(int id) {
		int status = 0;
		String sql = "delete from user where id=?";
		try {
			PreparedStatement statement = connection.getCon().prepareStatement(sql);
			statement.setInt(1, id);
			status = statement.executeUpdate();

		} catch (Exception ex) {

			ex.printStackTrace();
		}

		return status;

	}

	public Customers getById(int id) {
		String sql = "select * from user where id=?";
		Customers c = new Customers();
		try {
			PreparedStatement statement = connection.getCon().prepareStatement(sql);
			statement.setInt(1, id);
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				c.setId(rs.getInt(1));
				c.setName(rs.getString(2));
				c.setAddress(rs.getString(3));
				c.setEmail(rs.getString(4));
				c.setUsername(rs.getString(5));
				c.setPassword(rs.getString(6));
				c.setConfirmpassword(rs.getString(7));
			}

		} catch (Exception ex) {

			ex.printStackTrace();
		}
		return c;

	}

}
