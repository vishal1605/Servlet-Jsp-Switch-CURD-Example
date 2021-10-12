package com.crud.Beans;

public class Customers {
	private int id;
	private String name;
	private String address;
	private String email;
	private String username;
	private String password;
	private String confirmpassword;

	public Customers(int id, String name, String address, String email, String username, String password,
			String confirmpassword) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.email = email;
		this.username = username;
		this.password = password;
		this.confirmpassword = confirmpassword;
	}

	public Customers(String name, String address, String email, String username, String password,
			String confirmpassword) {
		super();
		this.name = name;
		this.address = address;
		this.email = email;
		this.username = username;
		this.password = password;
		this.confirmpassword = confirmpassword;
	}

	public Customers() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmpassword() {
		return confirmpassword;
	}

	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}

	@Override
	public String toString() {
		return "Customers [id=" + id + ", name=" + name + ", address=" + address + ", email=" + email + ", username="
				+ username + ", password=" + password + ", confirmpassword=" + confirmpassword + "]";
	}
	
	

}
