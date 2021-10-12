package com.crud.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.crud.Beans.Customers;
import com.crud.dao.CustomerDao;

/**
 * Servlet implementation class OperationServlet
 */
@WebServlet("/")
public class OperationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public OperationServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();
		System.out.println(action);

		try {
			switch (action) {
			case "/insert":
				insertCustomers(request, response);
				break;
			case "/viewAllUsers":
				viewAllUsers(request, response);
				break;
			case "/update":
				updateUser(request, response);
				break;
			case "/getUser":
				getUser(request, response);
				break;
			case "/delete":
				deleteUser(request, response);
				break;
			default:
				System.out.println("Error");
				break;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void getUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
		CustomerDao dao = new CustomerDao();
		int custId = Integer.parseInt(request.getParameter("id"));
		Customers c = dao.getById(custId);
		HttpSession session = request.getSession();
		session.setAttribute("customer", c);
		response.sendRedirect("Update.jsp");

	}

	private void deleteUser(HttpServletRequest request, HttpServletResponse response) throws IOException {

		CustomerDao dao = new CustomerDao();
		Customers customer = new Customers();
		int custId = Integer.parseInt(request.getParameter("Cid"));
		dao.deleteCustomer(custId);
		response.sendRedirect("viewAllUsers");

	}

	private void updateUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
		CustomerDao dao = new CustomerDao();
		Customers customer = new Customers();
		String myName = request.getParameter("myName");
		String address = request.getParameter("address");
		String myEmail = request.getParameter("rEmail");
		String userName = request.getParameter("rName");
		String myPassword = request.getParameter("rPassword");
		String myPasswords = request.getParameter("rPasswords");
		int myId = Integer.parseInt(request.getParameter("myId"));

		customer.setName(myName);
		customer.setAddress(address);
		customer.setEmail(myEmail);
		customer.setUsername(userName);
		customer.setPassword(myPassword);
		customer.setConfirmpassword(myPasswords);
		customer.setId(myId);

		int status = dao.updateUser(customer);

		if (!(myPassword.equals(myPasswords))) {
			response.sendRedirect("Error.jsp");

		} else if (status > 0) {
			response.sendRedirect("viewAllUsers");

		} else {
			response.sendRedirect("Error.jsp");

		}

	}

	private void viewAllUsers(HttpServletRequest request, HttpServletResponse response) throws IOException {
		CustomerDao dao = new CustomerDao();
		List<Customers> list = dao.getAllUser();
		HttpSession session = request.getSession();
		session.setAttribute("AllUsers", list);
		response.sendRedirect("allUsers.jsp");

	}

	private void insertCustomers(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String myName = request.getParameter("myName");
		String address = request.getParameter("address");
		String myEmail = request.getParameter("rEmail");
		String userName = request.getParameter("rName");
		String myPassword = request.getParameter("rPassword");
		String myPasswords = request.getParameter("rPasswords");
		CustomerDao dao = new CustomerDao();
		Customers customer = new Customers();

		customer.setName(myName);
		customer.setAddress(address);
		customer.setEmail(myEmail);
		customer.setUsername(userName);
		customer.setPassword(myPassword);
		customer.setConfirmpassword(myPasswords);

		if (!(myPassword.equals(myPasswords))) {
			response.sendRedirect("Error.jsp");

		} else {
			dao.insertCustomers(customer);
			response.sendRedirect("index.jsp");
		}

	}

}
