package Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.CustommerDAO;
import Model.Custommer;

/**
 * Servlet implementation class CreateAccountController
 */
@WebServlet("/CreateAccountController")
public class CreateAccountController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)  {
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) {
		CustommerDAO cusDAO = new CustommerDAO();
		String rq = request.getParameter("createacc");
		if(rq.equals("Create")) {
			String uname = request.getParameter("Uname");
			String pword = request.getParameter("Pword");
			String name = request.getParameter("Name");
			String addr = request.getParameter("Addr");
			String phone = request.getParameter("Phone");
			Custommer cus = new Custommer(uname, pword, name, addr, phone);
			boolean rs = cusDAO.saveAccount(cus);
			request.setAttribute("rp", "Create Account Done !");
			RequestDispatcher rd = request.getRequestDispatcher("view/register.jsp");
			try {
				rd.forward(request, response);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
